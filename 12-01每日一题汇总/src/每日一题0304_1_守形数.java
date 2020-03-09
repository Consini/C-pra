import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/3/4 20:10
 **/
public class 每日一题0304_1_守形数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int n2 = num *num;
            if(num==100){
                System.out.println("No!");
            }else if(num < 10){
                if(n2%10 == num){
                    System.out.println("Yes!");
                }else{
                    System.out.println("No!");
                }
            }else{
                if(n2%100 == num){
                    System.out.println("Yes!");
                }else{
                    System.out.println("No!");
                }
            }
        }
    }
}
