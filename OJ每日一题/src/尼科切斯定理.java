import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/20 19:44
 **/
public class 尼科切斯定理 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while ((sc.hasNext())){
            int n = sc.nextInt();
            int num = n*n;
            int[] a = new int[n];
            if(n%2 == 0){
                a[0] = num+1 - (n/2)*2;
            }else{
                a[0] = num - (n/2)*2;
            }
            int i = 1;
            System.out.print(a[0]+"+");
            for( i = 1;i < a.length - 1;i++){
                a[i] = a[i-1] + 2;
                System.out.print(a[i]+"+");
            }
            System.out.print(a[i-1]+2);
            System.out.println();
        }
    }
}
