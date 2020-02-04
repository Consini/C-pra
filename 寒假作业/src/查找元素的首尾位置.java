/**
 * @Description TODO
 * @Author K
 * @Date 2020/2/1 17:58
 **/
public class 查找元素的首尾位置 {
    /*输入: nums = [5,7,7,8,8,10], target = 8
输出: [3,4]
输入: nums = [5,7,7,8,8,10], target = 6
输出: [-1,-1]*/
    // 左侧查找
    private static int leftSearch(int[] nums,int target){
        int left = 0,right = nums.length;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        if(left == nums.length) return -1;
        return target == nums[left] ? left : -1;
    }
    // 右侧查找
    private static int rigthSearch(int[] nums,int target){
        int left = 0,right = nums.length;
//        while(left < right-1){
//            int mid = left + (right - left)/2;
//            if(nums[mid] > target){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return left;

        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] > target){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        if(left == 0) return -1;
        return target == nums[left-1] ? (left-1) : -1;
    }

    private static int binarySearch(int[] nums,int target,boolean flag){
        int low = 0,high = nums.length;
        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] > target || (flag && nums[mid] == target)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ret ={-1,-1};
        int left = binarySearch(nums,target,true);
        if(left == nums.length || target != nums[left]){
            return ret;
        }
        ret[0] = left;
        ret[1] = binarySearch(nums,target,false) - 1;
        return ret;

//        int[] ret = {-1,-1};
//        int left = leftSearch(nums,target);
//        if(left == -1) return ret;
//        ret[0] = left;
//        ret[1] = rigthSearch(nums,target);
//        return ret;
    }

    private static void printArr(int[] nums){
        for(int i : nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = {5,7,7,8,8,10};
        int[] b = {};
        int[] c = {2,2};

        printArr(searchRange(a,8));
        printArr(searchRange(a,1));
        printArr(searchRange(b,6));
        printArr(searchRange(c,2));
        printArr(searchRange(c,1));
    }
}
