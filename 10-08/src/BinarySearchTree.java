import javax.sound.midi.Soundbank;

/**
 * @ClassName BinarySearchTree
 * 二叉搜索树
 * @Author: K
 * @create: 2019/10/8-18:44
 **/
public class BinarySearchTree {
    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key){
            this.key = key;
        }
    }
    private Node root = null;
    /* 在搜索树中查找 key 值，若找到返回该节点，若未找到返回空节点
    * 时间复杂度 O(log(N)) - O(N)  */
    public Node search(int key){
        Node cur = root;
        while(cur != null){
            if(key == cur.key){
                return cur;
            }else if(key > cur.key){
                cur = cur.right;
            }else{
                cur = cur.left;
            }
        }
        return null;
    }
    /* 插入数据区，若已经存在则不进行插入，否则插入*/
    public boolean insert(int key){
        // 如果该树是一个空节点，直接插入，即让该节点为 根结点 root
        if(root == null){
            root = new Node(key);
            return true;
        }
        // 寻找 key 值的合理位置,若该值已有则插入失败
        Node cur = root;
        Node parent = null;
        while(cur != null){
            if(key == cur.key){
                return false;
            }else if(key < cur.key){
                parent = cur;
                cur = cur.left;
            }else{
                parent = cur;
                cur = cur.right;
            }
        }
        // 插入
        Node node = new Node(key);
        if(key > parent.key){
            parent.right = node;
        }else{
            parent.left = node;
        }
        return true;
    }
    // 删除
    public boolean remove(int key){
        Node cur = root;
        Node parent = null;
        // 先找到待删除节点以及他的父亲节点
        while(cur != null){
            if(cur.key == key){// 找到，准备删除
                removeNode(parent,cur);
                return true;
            }else if(key > cur.key){
                parent = cur;
                cur = cur.right;
            }else{
                parent = cur;
                cur = cur.left;
            }
        }
        return false;
    }

    private void removeNode(Node parent, Node cur) {
        // 进行删除
        if(cur.left == null){
            if(cur == root){
                root = cur.right;
            }else if(cur == parent.left){
                parent.left = cur.right;
            }else{
                parent.right = cur.right;
            }
        }else if(cur.right == null){
            if(cur == root){
                root = cur.left;
            }else if(cur == parent.left){
                parent.left = cur.left;
            }else{
                parent.right = cur.left;
            }
        }else{// 替换法：在右子树寻找最小的(或者左子树中最大的)
            Node goatParent = cur;
            Node goat = cur.right;
            while(goat.left != null){
                goatParent = goat;
                goat = goat.left;
            }
            cur.key = goat.key;
            // 判断 goat 是 goatParent 的左孩子还是右孩子
            if(goat == goatParent.left){
                goatParent.left = goat.right;
            }else{
                goatParent.right = goat.right;
            }
        }
    }

    public static void main(String[] args) {
        // 1.创建搜索树 2.随机插入数据 3.打印前序 + 中序 4.查找 5.删除
        BinarySearchTree tree = new BinarySearchTree();
        int[] trees = {3,9,7,4,1,6,2,8,5};
        for(int i : trees) {
            tree.insert(i);
        }
        System.out.println("插入重复数据");
        System.out.println(tree.insert(5));
        System.out.println("插入数据：");
        System.out.println(tree.insert(10));
        System.out.print("前序遍历：");
        preOrder(tree.root);
        System.out.print("中序遍历：");
        inOrder(tree.root);
        System.out.println("查找数据：");
        System.out.println(tree.search(9).key);
        System.out.println(tree.remove(5));
    }

    private static void inOrder(Node node) {
        if(node != null){
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }
    private static void preOrder(Node node) {
        if(node != null){
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

}
