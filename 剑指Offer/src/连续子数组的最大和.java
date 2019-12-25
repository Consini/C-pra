/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/25 20:26
 **/
public class 连续子数组的最大和 {
    /*{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)*/
    public static int FindGreatestSumOfSubArray(int[] array) {
        int sum = array[0],max = array[0];
        for(int i = 1;i < array.length;i++){
            int k = sum + array[i];
            if(k > 0){
                sum = k;
            }else{
                sum = array[++i];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {1,-2,3,10,-4,7,2,-5};
        System.out.println(FindGreatestSumOfSubArray(a));
    }
}
