/**
 * @ClassName DeleteSpace
 * 删除字符串首位空格，中间空格只留一个
 * @Author: K
 * @create: 2019/8/20-20:34
 **/
public class DeleteSpace {
    public static String delete1(String s){
        s = s.trim();//s.trim()方法的作用是去除首尾空格
        StringBuilder ret = new StringBuilder();
        for(int i = 0;i < s.length() - 1;i++){
            if(s.charAt(i) != ' '){
                ret.append(s.charAt(i));
            }
            if(s.charAt(i + 1) == ' '){
                ret.append(' ');
                i = i + 1;
                while(s.charAt(i) == ' '){
                    i++;
                }
                i--;
            }
        }
        return ret.toString();
    }

    public static String delete2(String s){
        s = s.trim();

    }
    public static void main(String[] args) {
        String s = "     as    b   bjsn    adgj   ";
        System.out.println(delete1(s));
        System.out.println(delete2(s));
    }
}
