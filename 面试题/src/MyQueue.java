/**
 * @ClassName MyQueue
 * @Description:
 * @Author:
 * @Date: 2019/7/30
 * @Time: 10:28
 * @Version 1.0
 **/


import java.util.ArrayList;

public class MyQueue {
    private ArrayList<Integer> out;
    private ArrayList<Integer> in;
    /** Initialize your data structure here. */
    public MyQueue() {
        in = new ArrayList<Integer>();
        out = new ArrayList<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(out.isEmpty()){
            while(!in.isEmpty()){

            }
        }
    }

    //获取栈顶元素不删除
    /** Get the front element. */
    public int peek() {

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {

    }
}
