
package sumdigits;
import java.util.Scanner;
public class Sumdigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个整数:");
        long num=input.nextLong();
        System.out.println(num+"各位数字之和"+sumDi(num));
    }
    public static int sumDi(long n)
    {
        int tmp=0;
        while(n!=0){
            tmp+=n%10;
            n/=10;
        }
        return tmp;
    }
}

