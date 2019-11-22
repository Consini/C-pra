import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/19 23:09
 **/
public class 超长数相加 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()) {
                String a = sc.nextLine();
                String b = sc.nextLine();
                StringBuffer s = new StringBuffer();
                int i = a.length() - 1, j = b.length() - 1;
                boolean flag = false;
                int sum;
                while (i >= 0 && j >= 0) {
                    sum = a.charAt(i) + b.charAt(j) - 96;
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
                    i--;
                }
                while (j >= 0) {
                    sum = b.charAt(j) - 48;
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
                    j--;
                }
                if(flag){
                    s.insert(0,1);
                }
                System.out.println(s);
            }
    }
}
