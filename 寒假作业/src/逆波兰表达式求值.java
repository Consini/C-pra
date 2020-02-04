import java.util.Stack;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/2/4 19:06
 **/
public class 逆波兰表达式求值 {
    /*输入: ["4", "13", "5", "/", "+"]
      输出: 6
      解释: (4 + (13 / 5)) = 6*/
    // 栈
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a,b;
        for(String s : tokens){
            switch (s){
                case "+":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a+b);
                    break;
                case "-":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a-b);
                    break;
                case "*":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a*b);
                    break;
                case "/":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a/b);
                    break;
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        }
        return stack.pop();
    }

    //数组
    public static int evalRPN2(String[] tokens) {
        int[] numStack = new int[tokens.length/2+1];
        int index = 0;
        for(String s : tokens){
            switch (s){
                case "+":
                    numStack[index - 2] = numStack[index - 2] + numStack[index - 1];
                    index -= 1;
                    break;
                case "-":
                    numStack[index - 2] = numStack[index - 2] - numStack[index - 1];
                    index -= 1;
                    break;
                case "*":
                    numStack[index - 2] = numStack[index - 2] * numStack[index - 1];
                    index -= 1;
                    break;
                case "/":
                    numStack[index - 2] = numStack[index - 2] / numStack[index - 1];
                    index -= 1;
                    break;
                default:
                    numStack[index++] = Integer.valueOf(s);
                    break;
            }
        }
        return numStack[0];
    }
    public static void main(String[] args) {
        String[] arr = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(arr));
        System.out.println(evalRPN2(arr));
    }
}
