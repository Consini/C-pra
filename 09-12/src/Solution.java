import java.util.Stack;

/**
 * @ClassName Solution
 * 队列与栈的面试题
 * @Author: K
 * @create: 2019/9/12-19:53
 **/
public class Solution {
    //有效的括号
    /*E push(E item) 压栈
      E pop() 出栈
      E peek() 查看栈顶元素*/
    public static boolean isValid(String s) {
        if(s.length() == 0){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else {
                if(stack.empty()){
                    return false;
                }
                char t = stack.pop();
                if(!((t == '(' && c == ')') || (t == '[' && c == ']') || (t == '{' && c == '}') )) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        //有效的括号
        String s = "{[]}";
        System.out.println(isValid(s));
    }
}
