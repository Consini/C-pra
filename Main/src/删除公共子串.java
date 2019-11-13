import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/10 8:42
 **/
public class 删除公共子串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.nextLine();
        StringBuffer result = new StringBuffer();
        for(int i = 0;i < str.length();i++){
            int count = 0;
            for(int j = 0;j < s.length();j++){
                char c = s.charAt(j);
                if(str.charAt(i) != c){
                    count++;
                }
            }
            if(count == s.length()){
                result.append(str.charAt(i));
            }
        }
        System.out.println(result);
    }
}
