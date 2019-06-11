
package palindromenumber;
import java.util.Scanner;
public class Palindromenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个三位数字：");
        int num=input.nextInt();
        if(num%10 == num/100){
            System.out.println("是回文");
        }
        else{
            System.out.println("不是回文");
        }
    }
    
}
