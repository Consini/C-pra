import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/2 20:29
 **/
public class 十进制转十六进制 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            StringBuffer stringBuffer = new StringBuffer();
            if(n==0){
                System.out.println(0);
                return;
            }
            while(n != 0)
            {
                int s = n % 16;//余数
                if (s-10 >= 0)
                {
                    char c = (char)('A' + s - 10);
                    stringBuffer.append(c);
                }else {
                    stringBuffer.append(s);
                }
                n = n / 16;//商
            }
            for(int i = stringBuffer.length()-1;i >= 0;i--){
                System.out.print(stringBuffer.charAt(i));
            }
        }
    }
}
