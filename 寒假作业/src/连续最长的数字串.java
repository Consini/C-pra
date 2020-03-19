import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/2/12 14:50
 **/
public class 连续最长的数字串 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int i = 0, j = 0, max = 0, index = 0;
            while (j < str.length()) {
                i = j;
                while (i < str.length() && (str.charAt(i) < '0' || str.charAt(i) > '9')) {
                    i++;
                }
                j = i;
                while (j < str.length() && str.charAt(j) >= '0' && str.charAt(j) <= '9') {
                    j++;
                }
                max = max > (j - i) ? max : (j - i);
                index = max == (j - i) ? i : index;
            }
            System.out.print(str.substring(index, index + max));
        }
}
