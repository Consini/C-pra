import javax.swing.*;
import java.util.List;

/**
 * @ClassName HashBucket
 * 哈希表
 * @Author: K
 * @create: 2019/10/19-12:19
 **/
public class HashBucket {
    private static class Node{
        private int key;
        private int value;
        Node next;
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    private Node[] array;
    private int size;// 当前数据个数
    private static final double factor = 0.75;//阈值
    //计算负载因子
    private double loadFactor(){
        return size * 1.0 / array.length;
    }
    public HashBucket(){
        array = new Node[8];
        size = 0;
    }
    // 查找,时间复杂度 O(1)
    /*过程：1.关键字经过变换得到 int 类型的值，如果不是 int 型，需要使用 key.hashCode()来转化为int型值
     2.将 int值转化为合法下标
     3.把关键字放入该合法下标位置的链表中*/
    public int get(int key){
        int index = key % array.length;
        Node head = array[index];
        for(Node cur = head;cur != null;cur = cur.next){
            if(key == cur.key){
                return cur.value;
            }
        }
        return -1;
    }
    // 在链表中查找 key 所在的节点，找到更新 value 并返回原来的 value ，没找到插入新节点,时间复杂度O(1)
    public int put(int key,int value){
        int index = key % array.length;
        for(Node cur = array[index];cur != null;cur = cur.next){
           if(key == cur.key){
               int oldValue = cur.value;
               cur.value = value;
               return oldValue;
           }
       }
       // 头插
        Node node = new Node(key,value);
        node.next = array[index];
        array[index] = node;
        size++;
        if(loadFactor() >= factor ){
            resize();//将数组大小扩大，重新哈希
        }
        return -1;
    }
    private void resize() {
        // 双层循环搬数据，外层循环数组，内层循环链表
        Node[] newArray = new Node[array.length * 2];
        for(int i = 0;i < array.length;i++){
            Node next;
            for(Node cur = array[i];cur != null;cur = next){
                next = cur.next;// 保存 cur.next
                int index = cur.key % newArray.length;
                cur.next = newArray[index];
                newArray[index] = cur;
            }
        }
        array = newArray;
    }
    /* 删除，如果找到删除并返回该 key 关联的 value，没找到返回 -1*/
    public int remove(int key){
        int index = key % array.length;
        Node head = array[index];
        if(head != null && head.key == key){// 头删
            array[index] = array[index].next;
            return head.value;
        }
        Node prev = null;
        for(Node cur = head;cur != null;cur = cur.next){
            if(key == cur.key){
                prev.next = cur.next;
                return cur.value;
            }
            prev = cur;
        }
        return -1;
    }
}
