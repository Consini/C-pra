/**
 * @ClassName Fibonacci
 * @Description:
 * @Author: 寇明珠
 * @Date: 2019/8/7
 * @Time: 19:35
 * @Version 1.0
 **/
import java.util.Scanner;
public class Fibonacci {
    public static int Fib(int n){
        int c = 0;
        int a = 1;
        int b = 1;
        if(n < 3){
            return 1;
        }
        n -= 2;
        while((n--) != 0){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n < 1){
            System.out.print("输入错误！请重新输入：");
            n = input.nextInt();
        }
        System.out.println(Fib(n));
    }
}
