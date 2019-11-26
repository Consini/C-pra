import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/26 12:26
 **/
public class n个数里最小的k个 {
    private static int partition(int[] a,int begin,int end){
        int pivot = a[begin];
        int i = begin,j = end;
        while(i < j){
            while(i < j && a[j] >= pivot){
                j--;
            }
            a[i] = a[j];
            while (i < j && a[i] < pivot){
                i++;
            }
            a[j] = a[i];
        }
        a[i] = pivot;
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
//            int k = s.charAt(s.length() - 1);
//            int[] arr = new int[s.length()/2 ];
//            for(int i = 0,j = 0;i < arr.length;i++,j+=2){
//                arr[i] = (int)(s.charAt(j));
//                System.out.println(arr[i]);
//            }
            String[] str = s.split(" ");
            int k = Integer.parseInt(str[str.length - 1])-1;
            int[] arr = new int[str.length - 1];
            for(int i = 0;i < arr.length;i++){
                arr[i] = Integer.parseInt(str[i]);
            }
            int start = 0;
            int end = arr.length - 1;
            int index = partition(arr,start,end);
            while(index != k){
                if(index > k){
                    end = index - 1;
                    index = partition(arr,start,end);
                }else{
                    start = index + 1;
                    index = partition(arr,start,end);
                }
            }
            Arrays.sort(arr,0,index);
            for(int i = 0;i <= k;i++){
                System.out.print(i==k ? arr[i] : (arr[i]+" "));
            }
        }
    }
}
