//import java.util.Scanner;
//
///**
// * @Description TODO
// * @Author K
// * @Date 2019/11/23 0:04
// **/
//public class 洗牌2 {
//    private static StringBuffer clear(int n,StringBuffer s){
//        StringBuffer stringBuffer = new StringBuffer();
//        int j = n/2 - 1;
//        for(int i = n - 1;i >= n/2;i--,j--){
//            stringBuffer.append(s.charAt(i));
//            stringBuffer.append(s.charAt(j));
//        }
//        return stringBuffer.reverse();
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        StringBuffer result = new StringBuffer();
//        while (t != 0) {
//            t--;
//            int n = sc.nextInt(),k = sc.nextInt();
//            int[] a = new int[2*n];
//            for (int i = 0; i < 2 * n; i++) {
//                a[i] = sc.nextInt();
//            }
//            while (k != 0) {
//                k--;
//                clear(2 * n, a);
//            }
//            result.append(str);
//        }
//        for(int i = 0;i < result.length() - 1;i++){
//            System.out.print(result.charAt(i)+ " ");
//        }
//        System.out.println(result.charAt(result.length() - 1));
//    }
//}
