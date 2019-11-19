/**
 * @Description 两个等待集，
 * @Author K
 * @Date 2019/11/19 10:29
 **/
public class MyQueue2 {
    private int[] array = new int[2];
    private volatile int size;//保证可见性
    private int front;
    private int rear;
    private Object full = new Object();
    private Object empty = new Object();
//保证消费者唤醒的一定是生产者，生产者唤醒是消费者
    public void put(int message) throws InterruptedException {
        do {
            while (size == array.length) {
                synchronized (full) {
                    full.wait();//只释放 this（full）的锁
                }
            }
            // 这里保证，size 一定是 < array.length 的
            synchronized (this) {   // 持续时间很久
                if (size == array.length) {
                    continue;
                }
                array[rear] = message;
                rear = (rear + 1) % array.length;
                size++;
            }
            synchronized (empty) {
                empty.notify();
            }
            return;
        } while (true);
    }
    public synchronized int take() throws InterruptedException {
        do {
            while (size == 0) {
                synchronized (empty) {
                    empty.wait();
                }
            }
            int message;
            synchronized (this) {   // 这句代码可能会执行很长时间
                if (size == 0) {
                    continue;
                }
                message = array[front];
                front = (front + 1) % array.length;
                size--;
            }
            synchronized (full) {
                full.notify();
            }
            return message;
        } while (true);
    }
}

