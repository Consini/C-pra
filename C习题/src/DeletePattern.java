import java.net.SocketTimeoutException;

/**
 * @ClassName DeletePattern
 * @Description:
 * @Author: 寇明珠
 * @Date: 2019/8/12
 * @Time: 19:08
 * @Version 1.0
 **/

public class DeletePattern {
    public static char[] deletePattern1(char[] a, char[] b){
       for(int i = 0;i < b.length;i++){
           for(int j = 0;j < a.length;j++){
               if(a[j] == b[i]){
                   a[j] = 0;
               }
           }
       }
       return a;
    }
        public static void main(String[] args) {
        String a = "abcdeabc";
        char[] a1 = a.toCharArray();
        String b = "abc";
        char[] b1 = b.toCharArray();
        deletePattern1(a1,b1);
        for(int i = 0;i < a1.length;i++){
            if(a1[i] != 0){
                System.out.printf("%s",a1[i]);
            }
        }
    }
}
