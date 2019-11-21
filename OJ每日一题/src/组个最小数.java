import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/20 19:27
 **/
public class 组个最小数 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while ((sc.hasNext())){
                int[] a = new int[10];
                for(int i = 0;i < a.length;i++){
                    a[i] = sc.nextInt();
                }
                StringBuffer s = new StringBuffer();
                for(int i = 1;i < a.length;i++){
                    if(a[i] != 0){
                        s.append(i);
                        a[i] -= 1;
                        break;
                    }
                }
                for(int i = 0;i < a.length;i++){
                    while(a[i] != 0){
                        s.append(i);
                        a[i] -= 1;
                    }
                }
                System.out.println(s);
            }
        }
}
