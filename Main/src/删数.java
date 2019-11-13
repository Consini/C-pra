import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/14 1:03
 **/
public class 删数 {
    public static int fun(int n){
        int[] a = new int[n];
        int count = n;
        int pop = 0;
        while(count > 1){
            for(int i = 0;i < n;i++){
                if(a[i] == 0){
                    pop++;
                    if(pop == 3){
                        a[i] = -1;
                        count--;
                        pop = 0;
                    }
                }
            }
        }
        int result = 0;
        for(int i = 0;i < n;i++){
            if(a[i] == 0){
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int result = fun(n);
            System.out.println(result);
        }

    }
}
