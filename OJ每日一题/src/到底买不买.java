import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/30 10:40
 **/
public class 到底买不买 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();//店家的
            String s = sc.nextLine();//小红的
            List<Character> list = new ArrayList<>();
            for (int i = 0;i < str.length();i++){
                list.add(str.charAt(i));
            }
            int count = 0;
            for(int i = 0;i < s.length();i++){
                if(list.contains(s.charAt(i))){
                    list.remove(list.indexOf(s.charAt(i)));
                }else {
                    count++;
                }
            }
            if(count == 0){
                System.out.println("Yes "+(str.length() - s.length()));
            }else{
                System.out.println("No "+count);
            }
        }
    }
}
