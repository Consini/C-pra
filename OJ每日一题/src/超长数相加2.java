import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/19 23:11
 **/
public class 超长数相加2 {
        private static volatile boolean flag = false;
        private static void insert(StringBuffer s,int sum){
            if (flag) {
                sum += 1;
            }
            if (sum / 10 == 0) {
                s.insert(0, sum);
                flag = false;
            } else {
                s.insert(0, sum % 10);
                flag = true;
            }
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()) {
                String a = sc.nextLine();
                String b = sc.nextLine();
                String tmp;
                if(a.length() < b.length()){
                    tmp  = b;
                    b = a;
                    a = tmp;
                }
                StringBuffer s = new StringBuffer();
                int i = a.length() - 1, j = b.length() - 1;
                int sum;
                while (i >= 0 && j >= 0) {
                    sum = a.charAt(i) + b.charAt(j) - 96;
                    insert(s,sum);
                    i--;
                    j--;
                }
                if (i < 0 && j < 0) {
                    if (flag) {
                        s.insert(0, 1);
                        System.out.println(s);
                        return;
                    }
                }
                while (i >= 0) {
                    sum = a.charAt(i) - 48;
                    insert(s,sum);
                    i--;
                }
                if(flag){
                    s.insert(0,1);
                }
                System.out.println(s);
            }
        }
}
