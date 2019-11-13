import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/14 0:02
 **/
public class 最小的k个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] str = input.split(" ");
        int[] arr = new int[str.length - 1];
        for(int i = 0;i < arr.length;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        int n = Integer.parseInt(str[str.length - 1]);
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = i + 1;j < arr.length;j++){
                if(arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
