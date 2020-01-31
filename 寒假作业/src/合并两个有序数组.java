/**
 * @Description TODO
 * @Author K
 * @Date 2020/1/31 15:27
 **/
public class 合并两个有序数组 {
    // 将第二个先放到第一个数组里面，然后进行排序
    //插排：每次选择无序区间的第一个元素，在有序区间内选择合适的位置插入
    // 时间复杂度 O(n+m)，空间复杂度均为 O(1)
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0,j = m;i < n;i++,j++){
            nums1[j] = nums2[i];
        }
        for(int i = 1;i < n + m;i++){
            int val = nums1[i];
            int j = i - 1;
            for(;j >= 0 && val < nums1[j];j--){
                nums1[j+1] = nums1[j];
            }
            nums1[j+1] = val;
        }
    }
    //双指针法，同时在从前面开始，从第一个数组中找到第二个数组元素的合适位置做插入
    // 时间复杂度 O(n^2)，空间复杂度均为 O(1)
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0,p2 = 0,count = 0;
        while(p2 < n){
            if(!(nums1[p1] <= nums2[p2] && p1 < m+count)){
                for(int i = m+count;i > p1;i--){
                    nums1[i] = nums1[i-1];
                }
                nums1[p1] = nums2[p2];
                p2++;
                count++;
            }
            p1++;
        }
    }
    //双指针法，将数组 1 复制一份，然后通过比较填入元素
    // 时间复杂度O(n+m)，空间复杂度均为 O(m)
    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int[] copyArray = new int[m];
        System.arraycopy(nums1,0,copyArray,0,m);
        int i = 0,j = 0,index = 0;
        while(i < m && j < n){
            nums1[index++] = (copyArray[i]<=nums2[j]) ? copyArray[i++] : nums2[j++];
        }
        if(i == m){
            System.arraycopy(nums2,j,nums1,index,n-j);
        }
        if(j == n){
            System.arraycopy(copyArray,i,nums1,index,m-i);
        }
    }
    //双指针法，设置前后指针将大的元素填进去
    // 时间复杂度 O(n+m)，空间复杂度均为 O(1)
    public void merge4(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1,j = n - 1,index = n+m-1;
        while(i>=0 && j>=0){
            nums1[index--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
        System.arraycopy(nums2,0,nums1,0,j+1);
    }
    public static void main(String[] args) {
        int[] num1 = {9};
        int[] num2 = {1};
        merge2(num1,0,num2,1);
        for(int i = 0;i< num1.length;i++){
            System.out.print(num1[i]+" ");
        }
    }
}
