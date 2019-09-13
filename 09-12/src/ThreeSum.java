import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ThreeSum
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组
 * @Author: K
 * @create: 2019/9/12-18:12
 **/
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
       List<List<Integer>> list = new ArrayList<>();
       int n = 0;
       for(int i = 0; i < nums.length - 2;i++){
           int j = i + 1;
           int k = nums.length - 1;
           while(i < nums.length - 2 && nums[i] == nums[i + 1]){
               i++;
           }
           while(j < k) {
               if (nums[i] + nums[j] + nums[k] == 0) {
                   list.add(new ArrayList<>());
                   list.get(n).add(nums[i]);
                   list.get(n).add(nums[j]);
                   list.get(n).add(nums[k]);
                   n++;
                   j++;
                   k--;
               } else if (nums[i] + nums[j] + nums[k] < 0) {
                   while (j < k && nums[j] == nums[j + 1]) {
                       j++;
                   }
                   j++;
               } else {
                   while (j < k && nums[k] == nums[k - 1]) {
                       k--;
                   }
                   k--;
               }
           }
       }
       return list;
}
    public static void main(String[] args) {
        int[] nums = {1,0,-1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
