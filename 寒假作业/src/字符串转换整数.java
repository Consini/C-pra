/**
 * @Description TODO
 * @Author K
 * @Date 2020/2/1 14:14
 **/
public class 字符串转换整数 {
    public static int myAtoi(String str) {
        int i = 0,b = 1,ret = 0;
        while(i < str.length()){
            char c = str.charAt(i);
            if(c == ' '){
                i++;
            }else if(c == '+'){
                i++;
                b = 1;
                break;
            }else if(c == '-'){
                i++;
                b = -1;
                break;
            }else if(c >= '0' && c <= '9'){
                break;
            }else{
                return 0;
            }
        }
        if(i == str.length()){
            return 0;
        }
        while(i < str.length() && str.charAt(i)>='0' && str.charAt(i)<='9'){
            int last = (str.charAt(i)-'0')*b;
            if(ret > Integer.MAX_VALUE/10 || (ret == Integer.MAX_VALUE/10 && last > 7)){
                return Integer.MAX_VALUE;
            }
            if(ret < Integer.MIN_VALUE/10 || (ret == Integer.MIN_VALUE/10 && last < -8)){
                return Integer.MIN_VALUE;
            }
           ret = ret*10 + last;
            i++;
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("     -42   "));
        System.out.println(myAtoi("odew diej 789"));
        System.out.println(myAtoi("034983947485693021"));
        System.out.println(myAtoi("-2147483649"));
        System.out.println(myAtoi("+-9"));
    }
}
