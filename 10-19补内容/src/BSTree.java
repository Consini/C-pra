import sun.awt.SunHints;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName BSTree
 * 二叉搜索树
 * @Author: K
 * @create: 2019/10/19-9:31
 **/
public class BSTree<K,V> implements Map <K,V>{
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        Node<K,V> cur = root;
        /* 如果使用自定义类型作为 TreeMap 的 K 类型
        1.要么自定义类型是 Comparable
        2.要么在构造方法中传入一个比较器
        */
        int r;
        while(cur != null){
            if(comparator != null){
              r = comparator.compare((K)key,cur.key);// 不为空则按照比较器方法进行比较
            }else{
                Comparable<K> comparableKey = (Comparable<K>) key;// 向下转型
                r = comparableKey.compareTo(cur.key);
            }
            if(r == 0){
                return cur.value;
            }else if(r > 0){
                cur = cur.right;
            }else{
                cur = cur.left;
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        if(root == null){
            root = new Node<>(key,value);
            size++;
            return null;
        }
        Node<K,V> cur = root;
        Node<K,V> parent = null;
        while(cur != null){
            int r;
            if(comparator != null){
                r = comparator.compare(key,cur.key);
            }else{
                Comparable<K> kComparable = (Comparable<K>)key;
                r = kComparable.compareTo(cur.key);
            }
            if(r == 0){
                V oldValue = cur.value;
                cur.value = value;
                return oldValue;
            }else if(r < 0){
                parent = cur;
                cur = cur.left;
            }else{
                parent = cur;
                cur = cur.right;
            }
        }
        if(cur == parent.left){
            parent.left = new Node<>(key,value);
        }else{
            parent.right = new Node<>(key,value);
        }
        size++;
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    private static class Node<K,V> implements Map.Entry<K,V>{
        private K key;
        private V value;
        private Node<K,V> left = null;
        private Node<K,V> right = null;
        @Override
        public K getKey() {
            return key;
        }
        @Override
        public V getValue() {
            return value;
        }
        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }
        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    private Node<K,V> root = null;
    private int size = 0;
    private Comparator<K> comparator = null;
    public BSTree(){
    }
    public BSTree(Comparator<K> comparator){
        this.comparator = comparator;
    }

}
