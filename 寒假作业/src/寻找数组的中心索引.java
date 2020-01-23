/**
 * @Description TODO
 * @Author K
 * @Date 2020/1/23 10:38
 **/
public class 寻找数组的中心索引 {
    public static int pivotIndex(int[] nums) {
        if(nums.length < 3){
            return -1;
        }
        int i = 0,j = nums.length - 1,left = nums[i],right = nums[j];
        while(i < j){
            if(left == right && i+2 == j){
                return i+1;
            }else if(left < right){
                i++;
                left += nums[i];
            }else{
                j--;
                right += nums[j];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {-1,-1,-1,-1,-1,0};
        System.out.println(pivotIndex(a));
    }
}
