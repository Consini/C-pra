/**
 * @ClassName MyCircularQueue
 * 循环队列
 * @Author: K
 * @create: 2019/9/13-22:43
 **/
public class MyCircularQueue {
    private int[] array;
    private int size = 0;
    private int front = 0;
    private int rear = 0;
    /** 构造器，设置队列长度为 k */
    MyCircularQueue(int k) {
        array = new int[k];
    }
    /**  向循环队列插入一个元素。如果成功插入则返回真，尾插 . */
    public boolean enQueue(int value) {
        if(size == array.length){
            return false;
        }
        array[rear] = value;
        rear = (rear + 1)%array.length;
        size++;
        return true;
    }

    /**从循环队列中删除一个元素。如果成功删除则返回真,头删 */
    public boolean deQueue() {
        if(size == 0){
            return false;
        }
        front = (front + 1) % array.length;
        size--;
        return true;
    }

    /** 从队首获取元素。如果队列为空，返回 -1  */
    public int Front() {
        if(size == 0){
            return -1;
        }
        return array[front];
    }

    /** 获取队尾元素。如果队列为空，返回 -1 。 */
    public int Rear() {
        if(size == 0){
            return -1;
        }
        int last = (rear - 1 + array.length) % array.length;
        return array[last];
    }

    /** 检查循环队列是否为空。 */
    public boolean isEmpty() {
        return size == 0;
    }

    /** 检查循环队列是否已满。 */
    public boolean isFull() {
        return size == array.length;
    }
}
