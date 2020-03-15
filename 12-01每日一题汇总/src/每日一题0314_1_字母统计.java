import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/3/15 21:59
 **/
public class 每日一题0314_1_字母统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String string = sc.nextLine();
            HashMap<Character,Integer> map = new HashMap<>();
            for(char c = 'A';c <= 'Z';c++){
                map.put(c,0);
            }
            for(int i = 0;i < string.length();i++){
                char c = string.charAt(i);
                if(c >= 'A' && c <= 'Z') {
                    map.put(c, map.get(c) + 1);
                }
            }
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
}
