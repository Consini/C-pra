import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/25 22:07
 **/
public class 把字符串转换为整数 {
    public static int StrToInt(String str) {
        if(str.isEmpty()){//字符串为空则直接返回0
            return 0;
        }
        char c = str.charAt(0);
        if(c=='+' || c=='-' || (c >= '0' && c <='9')) {//判断第一个字符，如果不是正负号或者数字直接返回0
            int i = 1;
            while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                i++;
            }//如果i不能走到最后表示该字符串不是数字串，如+12asad
            //字符串直接转整数可能会有溢出，思前想后没想到解决办法，最后用异常来解决。。。。
            try {
                if (i == str.length()) {//只有走到字符串末尾才表示这是一个数字串
                    return c=='+'?Integer.valueOf(str.substring(1, str.length())):Integer.parseInt(str);
                    //判断正负数
                }
            }catch (NumberFormatException e){
                return 0;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(StrToInt(s));
    }
}
