import java.util.Arrays;

/**
 * @ClassName QuickSort
 * 快速排序
 * @Author: K
 * @create: 2019/9/26-19:10
 **/
public class QuickSort {

    public static void quickSort(int[] array){
        quickSortInter(array,0,array.length - 1);
    }
    private static void quickSortInter(int[] array, int left, int right) {// 左右都是闭区间
        if(left >= right){
            return;
        }
        //int pivotIndex = partition1(array,left,right);
        //int pivotIndex = partition2(array,left,right);
        int pivotIndex = partition3(array,left,right);
        quickSortInter(array,left,pivotIndex - 1);
        quickSortInter(array,pivotIndex + 1,right);
    }
    // Hoare法
    private static int partition1(int[] array, int left, int right) {
        int pivot = array[left];
        int i = left;
        int j = right;
        while(i < j){
            while(i < j && array[j] >= pivot){
                j--;
            }
            while(i < j && array[i] <= pivot){
                i++;
            }
            swap(array,i,j);
        }
        swap(array,i,left);
        return i;
    }
    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    // 挖坑法
    private static int partition2(int[] array,int left,int right){
        int pivot = array[left];
        int i = left;
        int j = right;
        while(i < j){
            while(i < j && array[j] >= pivot){
                j--;
            }
            array[i] = array[j];
            while(i < j && array[i] <= pivot){
                i++;
            }
            array[j] = array[i];
        }
        array[i] = pivot;
        return i;
    }

    // 前后遍历法
    private static int partition3(int[] array,int left,int right){
        int pivot = array[left];
        int d = left + 1;
        int i = left + 1;
        for(;i <= right;i++){
            if(array[i] < pivot){
                swap(array,i,d++);
            }
        }
        swap(array,d - 1,left);
        return d - 1;
    }
    // 递归调用栈在消耗空间
    public static void main(String[] args) {
        int[]  a = {2,7,9,5,1,0,2,1};
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}
