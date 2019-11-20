/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/14 17:24
 **/
public class 替换空格 {
    public static String replaceSpace(StringBuffer str) {
        String s = str.toString();
        String s1 = s.replaceAll(" ","%20");
        return s1;
    }

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("we rsr h");
        System.out.println(replaceSpace(s));
    }
}
