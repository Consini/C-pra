import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/1 20:01
 **/
public class 小易的升级之路 {
    private static int fun(int a,int b){
        int c = a%b;
        while(c != 0){
            a = b;
            b = c;
            c = a%b;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (b[i] <= a) {
                    a += b[i];
                } else {
                    a = a + fun(b[i], a);
                }
            }
            System.out.println(a);
        }
    }
}
