/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/10 9:18
 **/
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack2.push(node);
    }

    public int pop() {
        if(stack1.isEmpty()){
            stack1.push(stack2.pop());
        }
        return stack1.pop();
    }
}
