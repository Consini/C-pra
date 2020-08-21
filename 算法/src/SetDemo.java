/**
 * @Description TODO
 * @Author K
 * @Date 2020/8/20 20:19
 **/
public class SetDemo {
    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key){
            this.key = key;
        }
    }
    private Node root = null;
    public boolean search(int key){
        if(root == null){
            return false;
        }
        Node cur = root;
        while(cur != null){
            if(cur.key == key){
                return true;
            }else if(cur.key > key){
                cur = cur.left;
            }else{
                cur = cur.right;
            }
        }
        return false;
    }
    public boolean insert(int key){
        Node node = new Node(key);
        if(root == null){
            root = node;
            return true;
        }
        Node cur = root;
        Node parent = root;
        while(cur != null){
            if(cur.key == key){
                return false;
            }else if(cur.key > key){
                parent = cur;
                cur = cur.left;
            }else{
                parent = cur;
                cur = cur.right;
            }
        }
        if(parent.key > key){
            parent.left = node;
        }else{
            parent.right = node;
        }
        return true;
    }
    public boolean remove(int key){
        if(root == null){
            return false;
        }
        Node parent = null;
        Node cur = root;
        while (cur != null){
            if(cur.key == key){
                removeNode(parent,cur);
                return true;
            }else if(cur.key > key){
                parent = cur;
                cur = cur.left;
            }else{
                parent = cur;
                cur = cur.right;
            }
        }
        return false;
    }

    private void removeNode(Node parent, Node cur) {
        if(cur.left == null){
            if(cur == root){
                root = cur.right;
            }else if(cur == parent.left) {
                parent.left = cur.right;
            }else{
                parent.right = cur.right;
            }
        }else if(cur.right == null){
            if(root == cur){
                root = cur.left;
            }else if(cur == parent.left){
                parent.left = cur.left;
            }else{
                parent.right = cur.left;
            }
        }else{
            Node nodeParent = cur;
            Node node = cur.right;
            while(node.left != null){
                nodeParent = node;
                node = node.left;
            }
            cur.key = node.key;
            if(node == nodeParent.left){
                nodeParent.left = node.right;
            }else{
                nodeParent.right = node.right;
            }
        }
    }


}
