/**
 * @ClassName PalindNum
 * @Description:
 * @Author: 寇明珠
 * @Date: 2019/8/12
 * @Time: 20:29
 * @Version 1.0
 **/
public class PalindNum {
    public static boolean isPalindrome(int x) {
        if(x < 11){
            return false;
        }
        int[] a ;
        int j = 0;
        while(x != 0){
            a[j] = x % 10;
            x /= 10;
            j += 1;
        }
        for(int i = 0;i < a.length / 2;i++){
            if(a[i] != a[a.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if(isPalindrome(121)){
            System.out.println("Is PrlindNum!");
        }
    }
}
