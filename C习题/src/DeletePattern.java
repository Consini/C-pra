import java.net.SocketTimeoutException;

/**
 * @ClassName DeletePattern
 * @Description:
 * @Date: 2019/8/12
 * @Time: 19:08
 * @Version 1.0
 **/
import java.lang.StringBuilder;
public class DeletePattern {
    public static String deletePattern(String a,String b){
        StringBuilder s = new StringBuilder();//存储结果字符串
        char[] b1 = new char[256];
        for(int i = 0;i < b.length();i++){
            b1[b.charAt(i) ] = 1;
        }
        for(int i = 0;i < a.length();i++){
            if(b1[a.charAt(i)] != 1){
                s.append(a.charAt(i));
            }
        }
        return s.toString();
    }
        public static void main(String[] args) {
        String a = "They are students.";
        String b = "aeiou";
        System.out.println(deletePattern(a,b));
    }
}
