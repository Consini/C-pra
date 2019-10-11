import com.sun.deploy.security.SandboxSecurity;

/**
 * @ClassName BadKeyBaord
 * 牛客旧键盘问题
 * @Author: K
 * @create: 2019/10/11-19:30
 **/
import java.util.*;
public class BadKeyBaord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String right = input.nextLine();// 好键盘的内容
        String wrong = input.nextLine();// 坏键盘输出的内容
        Set<Character> set = new TreeSet<>();
        Set<Character> result = new TreeSet<>();
        for(char c : wrong.toCharArray()){
            set.add(c);
        }
        for(char c : right.toCharArray()){
            if(!set.contains(c)){
                c = Character.toUpperCase(c);
                if(result.add(c)) {
                    System.out.print(c);
                }
            }
        }
    }
}
