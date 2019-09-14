import java.util.ArrayList;

/**
 * @ClassName PrevPermOpt1
 * 给你一个正整数的数组 A（其中的元素不一定完全不同），
 * 请你返回可在一次交换（交换两数字 A[i] 和 A[j] 的位置）后得到的、
 * 按字典序排列小于 A 的最大可能排列。  如果无法这么操作，就请返回原数组
 * @Author: K
 * @create: 2019/9/12-18:13
 **/
// 3 2 1 -- 3 1 2
public class PrevPermOpt1 {
    public static int[] prevPermOpt1(int[] A) {
        int i = 0;
        for( i = A.length - 1;i > 0;i--){
            if(A[i] < A[i - 1]){
                break;
            }
        }
        if(i == 0){
            return A;
        }
        int k1 = i - 1;//需要交换的第一个数字的下标
        int max = i;//需要交换的第二个数字的临时下标
        int j = 0;
        for( j = i;j < A.length ;j++){
            if(A[j] < A[k1] && A[j] > A[max] ){
                max = j;
            }
        }
        int t = A[k1];
        A[k1] = A[max];
        A[max] = t;
        return A;
    }
    public static void main(String[] args) {
        int[] A = {1,1,5};
        prevPermOpt1(A) ;
            for(int i = 0;i < A.length;i++){
            System.out.println(A[i]);
        }
    }
}
