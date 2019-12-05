import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/30 20:01
 **/
public class 数字分类 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] s = sc.nextLine().split(" ");
            int n =Integer.parseInt(s[0]);
            int[] arr = new int[s.length - 1];
            for(int i = 0;i < arr.length;i++){
                arr[i] = Integer.parseInt(s[i+1]);
            }
            int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0;
            int flag = 1;
            int count = 0;
            boolean b = true;
            for(int i = 0;i < n;i++){
                if(arr[i]%5 == 0 && arr[i]%2 == 0){
                    a1 += arr[i];
                }
                if(arr[i]%5 == 1){
                    b = false;
                    a2 = a2 + flag*arr[i];
                    flag = flag*(-1);
                }
                if(arr[i]%5 == 2){
                    a3++;
                }
                if(arr[i]%5 == 3){
                    a4 += arr[i];
                    count++;
                }
                if(arr[i]%5 == 4 && arr[i] > a5){
                    a5 = arr[i];
                }
            }
            if(a1 == 0){
                System.out.print("N ");
            }else{
                System.out.print(a1+" ");
            }
            if(a2 == 0 && b == true){
                System.out.print("N ");
            }else{
                System.out.print(a2+" ");
            }
            if(a3 == 0){
                System.out.print("N ");
            }else{
                System.out.print(a3+" ");
            }
            if(a4 == 0){
                System.out.print("N ");
            }else{
                System.out.print(Math.round(a4*1.0/count*10)/10.0+" ");
            }
            if(a5 == 0){
                System.out.print("N");
            }else{
                System.out.println(a5);
            }
        }
    }
}
