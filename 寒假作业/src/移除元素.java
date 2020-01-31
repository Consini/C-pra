/**
 * @Description TODO
 * @Author K
 * @Date 2020/1/31 11:24
 **/
public class 移除元素 {
    public static int removeElement(int[] nums, int val) {
        int i = 0,j = nums.length - 1;
        while(i <= j){
            while(i <= j && nums[i] != val){
                i++;
            }
            if(i == j || i == nums.length){
                break;
            }
            while(i < j && nums[j] == val){
                j--;
            }
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
        return i;
    }
    public static void main(String[] args) {
        int[] a = {3,3};
        System.out.println(removeElement(a,3));
    }
}
