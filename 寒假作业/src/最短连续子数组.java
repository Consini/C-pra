import java.util.Arrays;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/2/4 18:33
 **/
public class 最短连续子数组 {
    public static int findUnsortedSubarray(int[] nums) {
        int max = nums[0],min = nums[nums.length - 1];
        int low = 0,high = -1;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] >= max){
                max = nums[i];
            }else{
                high = i;
            }
            int j = nums.length - 1 - i;
            if(min < nums[j]){
                low = j;
            }else{
                min = nums[j];
            }
        }
        return high - low + 1;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(findUnsortedSubarray(a));
    }
}
