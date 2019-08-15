/**
 * @ClassName PalindNum
 * @Description:
 * @Author: 
 * @Date: 2019/8/12
 * @Time: 20:29
 * @Version 1.0
 **/
public class PalindNum {
    //首位末位比较
    public static boolean isPalindrome1(int x) {
            if(x < 0){
                return false;
            }
            int div = 1;
            while(x / div >= 10){
                div *= 10;
            }
            while(x > 0){
                if(x/div != x%10){
                    return false;
                }
                x = (x%div)/10;
                div /= 100;
            }
            return true;
        }
    //旋转后一半数字
    public static boolean isPalindrome2(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int num = 0;
        while(x > num){
            num = num * 10 + x % 10;
            x /= 10;
        }
        return x == num || x == (num / 10);
    }

    public static void main(String[] args) {
        if(isPalindrome1(1231)){
            System.out.println("Is PrlindNum!");
        }else{
            System.out.println("Not PrlindNum");
        }

        if(isPalindrome2(121)){
            System.out.println("Is PrlindNum!");
        }else{
            System.out.println("Not PrlindNum");
        }
    }
}
