import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/28 23:28
 **/
public class 统计兔子个数 {// 斐波那契数列
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(n < 3){
                System.out.println(1);
                return;
            }
            int a = 1,b = 1,count = 0;
            n -= 2;
            while(n-- != 0){
                count = a + b;
                a = b;
                b = count;
            }
            System.out.println(count);
        }
    }
}
