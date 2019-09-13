import java.time.Period;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassName MinStack
 * 最小栈
 * @Author: K
 * @create: 2019/9/12-20:46
 **/
/*E push(E item) 压栈
E pop() 出栈
E peek() 查看栈顶元素
boolean empty() 判断栈是否为空*/
public class MinStack {
    private Stack<Integer> normal;
    private Stack<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        normal = new Stack<>();
        min = new Stack<>();
    }
    public void push(int x) {
        normal.push(x);
        if(min.isEmpty()){
            min.push(x);
        }else if(x < min.peek()){
            min.push(x);
        }else{
            min.push(min.peek());
        }
    }
    public void pop() {
        normal.pop();
        min.pop();
    }
    public int top() {
        return normal.peek();
    }
    public int getMin() {
        return min.peek();
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.top();
        System.out.println(minStack.getMin());


    }
}
