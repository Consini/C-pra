/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/22 22:34
 **/
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
public class 洗牌 {
    private static StringBuffer clear(int n,StringBuffer s){
        StringBuffer stringBuffer = new StringBuffer();
        int j = n/2 - 1;
        for(int i = n - 1;i >= n/2;i--,j--){
            stringBuffer.append(s.charAt(i));
            stringBuffer.append(s.charAt(j));
        }
        return stringBuffer.reverse();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] strings = string.split(" ");
        int t = Integer.parseInt(strings[0]);//有几组数据
        int index = 1;
        while(t != 0){
            t--;
            int n = Integer.parseInt(strings[index++]);
            int k = Integer.parseInt(strings[index++]);
            StringBuffer str = new StringBuffer();
            for(int i = 0;i < 2*n;i++){
                str.append(strings[index++]);
            }
            while(k != 0){
                k--;
                str = clear(2*n,str);
            }
            if(t != 0) {
                for (int i = 0; i < str.length(); i++) {
                    System.out.print(str.charAt(i) + " ");
                }
            }else {
                for (int i = 0; i < str.length() - 1; i++) {
                    System.out.print(str.charAt(i) + " ");
                }
                System.out.println(str.charAt(str.length() - 1));
            }
        }
    }
}
