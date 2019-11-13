import java.util.Scanner;
import java.util.Stack;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/9 23:26
 **/
public class Parenthesis {
    public static boolean fun(String A,int n){
        if(A.charAt(0) == ')'){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < A.length();i++){
            char c = A.charAt(i);
            if(c == '('){
                stack.push(c);
            }
            if(c == ')' && stack.isEmpty()){
                return false;
            }
            if(c == ')'){
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "(())";
        System.out.println(fun(s,4));
    }

}
