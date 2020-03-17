import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/3/16 21:29
 **/
public class 每日一题0317_1_最近公共祖先 {
    public static int getLCA(int a, int b) {
//        while(a != b){
//            if(a > b){
//                a /= 2;
//            }
//            if(b > a){
//                b /= 2;
//            }
//        }
//        return a;
        int max = a>b ? a:b;
        int min = a+b-max;
        while(max > min){
            max /= 2;
            if(max < min) {
                int t = max;
                max = min;
                min = t;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(getLCA(a,b));
        }
    }
}
