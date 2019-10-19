/**
 * @ClassName HashTable
 * 泛型实现哈希桶
 * @Author: K
 * @create: 2019/10/19-13:50
 **/
public class HashTable<K,V> {
    private static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next = null;
    }

    private Node<K, V>[] array = (Node<K, V>[])new Node[8];//泛型类不能直接创建数组
    private int size;
    public V get(K key) {
        // 1. key => int
        // java 中的规定
        int hash = key.hashCode();  // 注意 1
        int index = hash % array.length;
        Node<K, V> head = array[index];
        for (Node<K, V> cur = head; cur != null; cur = cur.next) {
            if (key.equals(cur.key)) { // key 是引用类型，判断是否相等要调用 equals()方法
                return cur.value;
            }
        }
        return null;
    }
}
