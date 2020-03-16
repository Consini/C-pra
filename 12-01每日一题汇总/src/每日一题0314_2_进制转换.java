import java.util.Map;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/3/15 22:08
 **/
public class 每日一题0314_2_进制转换 {
    private static int fun(char c){
        int k = 0;
        switch (c){
            case 'A':k = 10;
                break;
            case 'B':k = 11;
                break;
            case 'C':k = 12;
                break;
            case 'D':k = 13;
                break;
            case 'E':k = 14;
                break;
            case 'F':k = 15;
                break;
            default:k = c-'0';
                break;
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String s = scanner.nextLine();
            long ret = 0;
            for(int i = s.length()-1,j = 0;i > 1;i--,j++){
                char c = s.charAt(i);
                int k = fun(c);
                ret = ret + (long)(Math.pow(16,j))*k;
            }
            System.out.println(ret);
        }
    }
}
