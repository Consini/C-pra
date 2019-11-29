import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/28 22:59
 **/
public class 最难得问题 {
    private static char fun(char c){
        char ch = (char)(c - 5);
        if(c <= 'E'){
            ch = (char)(c + 26 -5);
        }
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            char[] ch = sc.nextLine().toCharArray();
            for(int i = 0;i < ch.length;i++){
                if(ch[i] >= 'A' && ch[i] <= 'Z'){
                    System.out.print(fun(ch[i]));
                }else {
                    System.out.print(ch[i]);
                }
            }
            System.out.println();
        }
    }
}
