/**
 * @Description TODO
 * @Author K
 * @Date 2020/2/2 13:10
 **/
public class 通配符匹配 {
    public static boolean isMatch(String s, String p) {
        if(p.equals("*")){
            return true;
        }
        if(s.equals("")){
            if(p.equals("")) return true;
            if(p.equals("?")) return true;
        }
        int i = 0,j = 0;
        while(i < s.length() && j < p.length()){
            char a = s.charAt(i);
            char b = p.charAt(j);
            if(a == b || b == '?'){
                i++;
                j++;
                continue;
            }else if(b == '*'){
                if(j == p.length() - 1){
                    return true;
                }
                j++;
                while(s.charAt(i) != p.charAt(j)){
                    i++;
                    if(i == s.length()){
                        return false;
                    }
                }
            }else{
                return false;
            }
        }
        return i == s.length() && j == p.length();
    }
    public static void main(String[] args) {
        System.out.println(isMatch("","?"));
        System.out.println(isMatch("adceb","*a*b"));
        System.out.println(isMatch("acdcb","a*c?b"));
        System.out.println(isMatch("cb","?a"));
        System.out.println(isMatch("iswi","*"));
        System.out.println(isMatch("a","aa"));
        System.out.println(isMatch("aa","a"));
        String a = "abefcdgiescdfimde" ,b = "ab*cd?i*de";
        System.out.println(isMatch(a,b));
    }
}
