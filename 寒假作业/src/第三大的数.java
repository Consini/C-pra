import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/1/23 19:36
 **/
public class 第三大的数 {
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
        int one = nums[0];
        long two = Long.MIN_VALUE,three = two;
        for(int i = 1;i < nums.length;i++){
            int num = nums[i];
            if(num == one || num == two || num == three){
                continue;
            }
            if(num > one){
                three = two;
                two = one;
                one = num;
            }else if(num > two){
                three = two;
                two = num;
            }else if(num > three){
                three = num;
            }
        }
        return three == Long.MIN_VALUE ? one : (int)three;
    }
    public static int thirdMax3(int[] nums){
        Set<Integer> set = new TreeSet<>();
        for(int i = 0;i < nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println(set);
        Object[] ret = (set.toArray());
        if(ret.length < 3){
            return (int)ret[ret.length-1];
        }
        return (int)ret[ret.length-3];
    }
    public static int thirdMax4(int[] nums){
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0;i < nums.length;i++){
            set.add(nums[i]);
            if(set.size() > 3){
                set.remove(set.first());
            }
        }
        return set.size() < 3 ? set.last() : set.first();
    }
    public static void main(String[] args) {
        int[] a = {2,2,3,-2147483648};
        //System.out.println(thirdMax(a));
        System.out.println(thirdMax2(a));
        //System.out.println(thirdMax4(a));
        System.out.println(Integer.MIN_VALUE);
    }
}
