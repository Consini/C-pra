import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/16 22:22
 **/
public class 个位数统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int[] a = new int[10];
        for(int i = 0;i < n.length();i++){
            int num = n.charAt(i) - 48;
            a[num] += 1;
        }
        for(int i = 0;i < a.length;i++){
            if(a[i] != 0){
                System.out.println(i+":"+a[i]);
            }
        }
    }
}
