import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/3/3 22:36
 **/
public class 每日一题0303_1_找x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int len = sc.nextInt();
            int[] arr = new int[len];
            for(int i = 0;i < len;i++){
                arr[i] = sc.nextInt();
            }
            int find = sc.nextInt();
            int index = -1;
            for(index = 0;index < len;index++){
                if(arr[index] == find){
                    break;
                }
            }
            index = index==len ? -1:index;
            System.out.println(index);
        }
    }
}
