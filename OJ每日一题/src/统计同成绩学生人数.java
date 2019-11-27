import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/23 0:17
 **/
public class 统计同成绩学生人数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // while ((sc.hasNext())) {
        int n = 1;
        while (true){
            n = sc.nextInt();
            if(n == 0){
                break;
            }
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
            }
            int score = sc.nextInt();
            int count = 0;
            for(int j = 0;j < n;j++){
                if(a[j] == score){
                    count++;
                }
            }
            System.out.println(count);
            //  }
        }
    }
}
