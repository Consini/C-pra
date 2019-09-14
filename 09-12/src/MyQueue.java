import java.util.Stack;
/**
 * @ClassName MyQueue
 * 用栈实现队列
 * @Author: K
 * @create: 2019/9/13-21:49
 **/
/*E push(E item) 压栈
E pop()        出栈
E peek()        查看栈顶元素
boolean empty() 判断栈是否为空 */
public class MyQueue {
    private Stack<Integer> in;
    private Stack<Integer> out;
    /** Initialize your data structure here.初始化 */
    public MyQueue() {
        in = new Stack();
        out = new Stack();
    }
    /** Push element x to the back of queue.将一个元素放入队列的尾部 */
    public void push(int x) {
        in.push(x);
    }
    /** Removes the element from in front of queue and returns that element.从队列首部移除元素*/
    public int pop() {
        if(out.isEmpty()){
            while(in.size() != 0){
                int tmp = in.pop();
                out.push(tmp);
            }
        }
        return out.pop();
    }
    /** Get the front element. 返回队列首部的元素*/
    public int peek() {
        if(out.isEmpty()){
            while(in.size() != 0){
                int tmp = in.pop();
                out.push(tmp);
            }
        }
        int v = out.pop();
        out.push(v);
        return v;
    }

    /** Returns whether the queue is empty. 返回队列是否为空*/
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());   // 返回 1
        System.out.println(queue.pop() );  // 返回 1
        System.out.println(queue.empty()); // 返回 false

    }
}
