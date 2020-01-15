import java.util.*;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/1/14 19:07
 **/
public class Solution {
    public static int thirdMax(int[] nums) {
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        Arrays.sort(nums);
        Set<Integer> set = new TreeSet<>();
        int ret = Integer.MIN_VALUE;
        for(int i = nums.length-1;i>=0;i--){
            if(!set.contains(nums[i]) && set.size()<3){
                set.add(nums[i]);
                ret = nums[i];
            }
        }
        if(set.size()==3) {
            return ret;
        }
        return nums[nums.length-1];
    }
    public static int thirdMax2(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0], nums[1]);
        }
//        int one=Math.max(Math.max(nums[0],nums[1]),nums[2]);
//        int three=Math.min(Math.min(nums[0],nums[1]),nums[2]);
//        int two=nums[0]+nums[1]+nums[2]-one-three;
        int one=nums[0],two=one,three=one;
        for(int i = 1;i < nums.length;i++){
            if(nums[i] > three){
                if(nums[i] < two){
                    three = nums[i];
                }else if(nums[i] > two && nums[i] < one){
                    three = two;
                    two = nums[i];
                }else if(nums[i] > one){
                    three = two;
                    two = one;
                    one =nums[i];
                }
            }
        }
        return three;
    }
    public static void main(String[] args) {
        int[] a = {2,2,3,1};
        System.out.println(thirdMax2(a));
    }
}
