/**
 * @Description TODO
 * @Author K
 * @Date 2020/1/23 10:38
 **/
public class 寻找数组的中心索引 {
    public static int pivotIndex(int[] nums) {
        int sum=0,left=0;
        for(int i=0;i < nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(left*2==sum-nums[i]){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {-1,-1,-1,0,-1,-1};
        //System.out.println(pivotIndex(a));
    }
}
