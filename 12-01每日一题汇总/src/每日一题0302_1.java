import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/3/3 18:03
 **/
public class 每日一题0302_1 {
    private static long fun(long n){
        long sum = 0;
        while(n != 0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long n = sc.nextInt();
            long n2 = n*n;
            System.out.println(fun(n)+" "+fun(n2));
        }
    }
}
