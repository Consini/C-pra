import java.util.*;


public class MapDemo<K extends Comparable<K>,V>{
    static class Node<K extends Comparable<K>,V>{
        K key;
        V value;
        Node<K,V> left;
        Node<K,V> rigth;

    }
    private Node<K,V> root = null;
    // 查找
    public V get(K key){
        Node<K,V> node = root;
        while(node != null){
            int r = key.compareTo(node.key);
            if(r == 0){
                return node.value;
            }else if (r > 0){
                node = node.rigth;
            }else{
                node = node.left;
            }
        }
        return null;
    }
    public V put(K key,V value){
        if(root == null){
            root = new Node<>();
            root.key = key;
            root.value = value;
            return null;
        }
        Node<K,V> node = root;
        Node<K,V> parent = null;
        while(node != null){
            int r = key.compareTo(node.key);
            if(r == 0){
                V old = node.value;
                node.value = value;
                return old;
            }else if (r > 0){
                parent = node;
                node = node.rigth;
            }else{
                parent = node;
                node = node.left;
            }
        }
        Node<K,V> cur = new Node<>();
        cur.key = key;
        cur.value = value;
        if(parent.key.compareTo(key) > 0){
            parent.left = cur;
        }else{
            parent.rigth = cur;
        }
        return null;
    }
    public V remove (K key){
        Node<K,V> parent = null;
        Node<K,V> node = root;
        while(node != null){
            if(node.key == key){
                V old = node.value;
                deleteNode(parent,node);
                return old;
            }else if(node.key.compareTo(key) > 0){
                parent = node;
                node = node.left;
            }else{
                parent = node;
                node = node.rigth;
            }
        }
        return null;
    }

    private void deleteNode(Node<K,V> parent, Node<K,V> node) {
        if(node.left == null){
            if(node == root){
                root = node.rigth;
            }else if(node == parent.left){
                parent.left = node.rigth;
            }else{
                parent.rigth = node.rigth;
            }
        }else if(node.rigth == null){
            if(node == root){
                root = node.left;
            }else if(node == parent.left){
                parent.left = node.left;
            }else{
                parent.rigth = node.left;
            }
        }else{
            // 在右子树找最大值
            Node<K,V> curParent = node;
            Node<K,V> cur = curParent.rigth;
            while(cur.left != null){
                curParent =cur;
                cur = cur.left;
            }
            node.value = cur.value;
            if(cur == curParent.left){
                curParent.left = cur.rigth;
            }else{
                curParent.rigth = cur.rigth;
            }
        }
    }

    public static void main(String[] argv){

    }
}