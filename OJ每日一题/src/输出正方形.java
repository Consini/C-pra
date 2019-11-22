import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/19 22:19
 **/
public class 输出正方形 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String a = sc.next();
            int row = (n%2 == 0 ? n/2 : n/2+1) - 2;
            for(int i = 0;i < n;i++){
                System.out.print(a);
            }
            System.out.println();
            for(int i = 0;i <row;i++ ){
                for(int j = 0;j < n;j++){
                    if(j == 0 || j == n - 1){
                        System.out.print(a);
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(int i = 0;i < n;i++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
