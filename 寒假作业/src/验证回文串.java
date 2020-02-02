/**
 * @Description TODO
 * @Author K
 * @Date 2020/2/2 21:05
 **/
public class 验证回文串 {
    /*输入: "A man, a plan, a canal: Panama"   输出: true
      输入: "race a car"   输出: false*/
    private static boolean isLetter(char c){
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c >= 'A' && c <= 'Z';
    }
    public static boolean isPalindrome(String s) {
        int i = 0,j = s.length() - 1;
        while(i < j){
            while(i < j && !isLetter(s.charAt(i))){
                i++;
            }
            while(i < j && !isLetter(s.charAt(j))){
                j--;
            }
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(left >= 'A'&& left <= 'Z'){
                left = (char)(left - 'A' + 'a');
            }
            if(right >= 'A'&& right <= 'Z'){
                right = (char)(right - 'A' + 'a');
            }
            if(left == right){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        s = "0p.,0";
        System.out.println(isPalindrome(s));
        char c = 'D';
        System.out.println((char)(c-'A'+'a'));
    }
}
