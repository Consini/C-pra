import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * @ClassName PriorityQueue
 * 优先级队列
 * @Author: K
 * @create: 2019/9/22-14:18
 **/
public class PriorityQueue {

    private int[] array = new int[10];
    private int size = 0;

    private void offer(int i) {
        array[size++] = i;
        shiftUpSmall(（array,index),size;
    }

    // 向上调整小根堆
    public static void shiftUpSmall(int[] array,int index){
        int parent = (index - 1)/2;
        while(index != 0 || array[parent] > array[index]){
            swap(array,index,parent);
            index = parent;
            parent = (index - 1)/2;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.offer(7);
        queue.offer(9);
        queue.offer(5);
    }


}
