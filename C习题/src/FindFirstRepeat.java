/**
 * @ClassName FindFirstRepeat
 * 第一次重复出现的字符
 * @Author: K
 * @create: 2019/8/16-1:20
 **/
public class FindFirstRepeat {
    public static char findFirstRepeat(String A, int n) {
        // write code here
        //boolean arr[256] = {false};
        char[] a = new char[256] ;
        if(n == 0 ){
            return '\n';
        }
        int i = 0;
        for(i = 0;i < n ;i++){
            if( a[A.charAt(i) - '0'] != '0' ){
                a[A.charAt(i)-'0'] = 1;
            }else{
                break;
            }
        }
        return A.charAt(i);
    }
    public static void main(String[] args) {
        String s = "qywyer23tdd";
        System.out.println(findFirstRepeat(s,11));
    }
}
