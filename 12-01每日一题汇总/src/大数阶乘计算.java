import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/2 19:18
 **/
public class 大数阶乘计算 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int n = scanner.nextInt();
        int len = (int)(Math.log10(2*n*3.141592654)/2+n*Math.log10(n/2.71828182846)+1);
        if(len ==0 ){
            System.out.println(n);
            return;
        }
        int[] a = new int[len];
        a[0] = 1;
        for(int i = 1;i <= n;i++){
            int d = 0;
            for(int j = 0;j < len;j++){
                a[j] = d + a[j]*i;
                d = a[j]/10;
                a[j] = a[j]%10;
            }
        }
        for(int i = a.length-1;i >=0;i--){
            System.out.print(a[i]);
        }
    }
}
