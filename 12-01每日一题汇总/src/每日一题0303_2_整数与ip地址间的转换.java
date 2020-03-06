import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/3/3 22:44
 **/
public class 每日一题0303_2_整数与ip地址间的转换 {
    private static String toBinary(StringBuilder stringBuilder){
        String ret = Integer.toBinaryString(Integer.parseInt(stringBuilder.toString()));
        if(ret.length() < 8){
            int n = 8 - ret.length();
            while(n > 0){
                ret = "0"+ret;
                n--;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while(sc.hasNext()){
            String string = sc.nextLine();
            String string1 = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < string.length();i++){
                StringBuilder s = new StringBuilder();
                while(i < string.length() && string.charAt(i) != '.' ){
                    s.append(string.charAt(i));
                    i++;
                }
                sb.append(toBinary(s));
            }
        System.out.println(Long.parseLong(sb.toString(), 2));
        String s2 = Long.toBinaryString(Long.parseLong(string1));
            int n = 32-s2.length();
            while(n > 0){
                s2 = "0"+s2;
                n--;
            }
            int i = 0;
            StringBuilder ret = new StringBuilder();
            while(i < 4){
                String s = s2.substring(i*8,(i+1)*8);
                ret.append(Integer.parseInt(s,2));
                if(i < 3){
                    ret.append(".");
                }
                i++;
            }
            System.out.println(ret);
        //}
    }
}
