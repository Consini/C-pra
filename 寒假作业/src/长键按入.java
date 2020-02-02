import java.util.*;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/2/1 11:48
 **/
public class 长键按入 {
    static class Group{
        String key;
        List<Integer> value;
        public Group(String key,List<Integer> value){
            this.key = key;
            this.value = value;
        }
    }
    private static Group groupity(String s){
        StringBuilder key = new StringBuilder();
        List<Integer> value = new ArrayList<>();
        int count = 0;
        for(int i = 0;i < s.length();i++){
            if(i == s.length() - 1 || s.charAt(i) != s.charAt(i+1)){
                key.append(s.charAt(i));
                value.add(i - count + 1);
                count = i + 1;
            }
        }
        return new Group(key.toString(),value);
    }
    public static boolean isLongPressedName(String name, String typed) {
        Group g1 = groupity(name);
        Group g2 = groupity(typed);
        if(!g1.key.equals(g2.key)){
            return false;
        }
        for(int i = 0;i < g1.value.size();i++){
            if(g1.value.get(i) > g2.value.get(i)) return false;
        }
        return true;
    }

    public static boolean isLongPressedName2(String name, String typed) {
        if(typed.length() < name.length()  || name.charAt(0)!= typed.charAt(0)){
            return false;
        }
        int i = 1,j = 1;
        while(i < name.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
                //若 typed 遍历到最后但 name 还没有，说明不匹配
                if(j == typed.length() && !(i == name.length())){
                    return false;
                }
            }else if(typed.charAt(j) == name.charAt(i-1)){
                while(typed.charAt(j) == name.charAt(i-1)){
                    j++;
                    //若 j 一直自增直到末尾，说明不匹配。如 "sabc" 与 "saaaa"
                    if(j == typed.length()){
                        return false;
                    }
                }
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "saeed", typed = "ssaaeedd";
        System.out.println(isLongPressedName(name,typed));
        System.out.println(isLongPressedName2(name,typed));
        name = "alex";
        typed = "aaleex";
        System.out.println(isLongPressedName(name,typed));
        System.out.println(isLongPressedName2(name,typed));
        name = "aaaa";
        typed = "aaaaaaa";
        System.out.println(isLongPressedName(name,typed));
        System.out.println(isLongPressedName2(name,typed));
        name = "pyplrz";
        typed = "ppyypllr";
        System.out.println(isLongPressedName(name,typed));
        System.out.println(isLongPressedName2(name,typed));
        name = "saeed";
        typed = "saeeeeee";
        System.out.println(isLongPressedName(name,typed));
        System.out.println(isLongPressedName2(name,typed));
    }
}
