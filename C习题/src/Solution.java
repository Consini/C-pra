/**
 * @ClassName Solution
 * @Description:
 * @Author: 寇明珠
 * @Date: 2019/8/11
 * @Time: 12:19
 * @Version 1.0
 **/
import java.util.Arrays;
public class Solution {
    public static int MoreThanHalfNum_Solution(int[] array){
        Arrays.sort(array);
        int mid = array[array.length / 2];
        int count = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] == mid){
                count++;
            }
        }
        if(count > array.length / 2){
            return mid;
        }
        return 0;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(a));
    }
}
