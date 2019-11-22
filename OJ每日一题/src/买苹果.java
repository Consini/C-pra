import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/21 17:27
 **/
public class 买苹果 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while ((sc.hasNext())){
            int n = sc.nextInt();
            int num = 0;
            if(n%2 == 1){
                num = -1;
            }else if(n%8 == 0){
                num = n/8;
            }else{
                num = n/8 + 1;
            }
            System.out.println(num);
        }
    }
}
