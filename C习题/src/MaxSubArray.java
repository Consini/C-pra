/**
 * @ClassName MaxSubArray
 * @Description:
 * @Author:
 * @Date: 2019/8/15
 * @Time: 20:26
 * @Version 1.0
 **/
import java.util.Scanner;
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = nums[0];
        //foreach遍历数组
        for(int n : nums){
            if(sum > 0){
                sum += n;
            }else{
                sum = n;
            }
            ans = Math.max(sum,ans);
        }
//        for(int i = 0;i < nums.length;i++){
//            if(sum > 0){
//                sum += nums[i];
//            }else{
//                sum = nums[i];
//            }
//            ans = Math.max(ans,sum);
//        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
            for(int i = 0;i < a.length;i++){
                a[i] = input.nextInt();
            }
            System.out.println("最大子数组和为 "+maxSubArray(a));
        }
}
