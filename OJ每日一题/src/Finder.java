/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/8 18:05
 **/
import java.util.*;

public class Finder {
    public static void swap(int[] a,int i,int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public static int findKth(int[] a, int n, int K) {
        int result = K - 1;
        for(int i = 0;i < n-1;i++){
            K--;
            for(int j = i+1;j < n-1;j++){
                if(a[j] >= a[i]){
                    swap(a,i,j);
                }
            }
            if(K == 0){
                break;
            }
        }
        return a[result];
    }

    public static void main(String[] args) {
        int[] a = {5,9,2,6,7,8,1,3,9,10,33,54,24,67,89,12,34,56,26,57};
        System.out.println(findKth(a,20,5));
    }
}
