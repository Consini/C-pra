/**
 * @ClassName Compress
 * 字符串压缩
 * @Author: K
 * @create: 2019/8/20-20:32
 **/
public class Compress {
    public static String compress(String s){
        StringBuilder ret = new StringBuilder();
        int count = 1;
        int i = 0;
        for( i = 0;i < s.length() - 1;i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                count++;
                continue;
            }else{
                if(count == 1){
                    ret.append(s.charAt(i));
                }else{
                    ret.append(count);
                    ret.append(s.charAt(i));
                }
            }
            count = 1;
        }
        if(s.charAt(i) != s.charAt(i - 1)){
            ret.append(s.charAt(i));
        }else{
            ret.append(count);
            ret.append(s.charAt(i));
        }
        return ret.toString();
    }
    public static void main(String[] args) {
        String s = "xxxyyyyz";
        System.out.println(compress(s));
    }
}
