import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/21 17:45
 **/
public class 神奇的口袋 {
    static int count = 0;
    static int[] weight;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while ((sc.hasNext())){
            int n = sc.nextInt();
            weight = new int[n+1];
            for(int i = 1;i <= n;i++){
                weight[i] = sc.nextInt();
            }
            count(40,n);
            System.out.println(count);
        }
    }

    private static void count(int s, int n) {
        if(s == 0){
            count++;
            return ;
        }
        if(s < 0 || (s > 0 && n < 1)){
            return;
        }
        count(s-weight[n],n-1);
        count(s,n-1);
    }
}
