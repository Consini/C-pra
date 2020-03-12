import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/3/6 8:10
 **/
public class 每日一题0305_1_年会抽奖 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            double ret = 1.0*(n-1)/n*100;
            System.out.printf("%.2f",ret);
            System.out.println("%");
        }
    }
}
