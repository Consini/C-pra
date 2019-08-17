/**
 * @ClassName FindFirstRepeat
 * 第一次重复出现的字符
 * @Author: K
 * @create: 2019/8/16-1:20
 **/
public class FindFirstRepeat {
    public static char findFirstRepeat(String A, int n) {
        int[] a = new int[128];
        int i = 0;
        for(i = 0 ;i < n;i++){
            a[A.charAt(i)]++;
        }
        for(i = 0;i <n;i++){
            if(a[A.charAt(i)] > 1){
                return A.charAt(i);
            }
        }
        return '\n';
    }
    public static void main(String[] args) {
        String s = "qywyer23tdd";
        System.out.println(findFirstRepeat(s,11));
    }
}
