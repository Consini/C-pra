import java.util.Arrays;

/**
 * @ClassName KMinNum
 * @Description:
 * @Author: 寇明珠
 * @Date: 2019/8/9
 * @Time: 22:57
 * @Version 1.0
 **/
import java.util.Arrays;

public class KMinNum {
    public static void minNumOfK1(int[] a,int k){
        Arrays.sort(a);
        for(int i = 0;i < k;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void minNumOfK2(int[] a,int k){

    }
    public static void main(String[] args) {
        int[] a = {2, 4, 1, 7, 9, 0, 6, 8, 3};
        minNumOfK2(a,3);
        minNumOfK1(a,3);
    }
}
