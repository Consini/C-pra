import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/13 22:19
 **/
public class 最小公倍数 {
    private static int fun(int a,int b){
        int c = 0;
        int a1 = a;
        int b1 = b;
        while(a%b != 0){
            c = a%b;
            a = b;
            b = c;
        }
        return a1*(b1/c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a < b){
            int t = a;
            a = b;
            b = t;
        }
        if(a%b == 0){
            System.out.println(a);
        }else{
            System.out.println(fun(a,b));
        }
    }
}
