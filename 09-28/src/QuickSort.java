import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import java.util.Arrays;
import java.util.Stack;

/**
 * @ClassName QuickSort
 * 快速排序
 * @Author: K
 * @create: 2019/9/26-19:10
 **/
public class QuickSort {
    public static void quickSort(int[] array){
        quickSortInter1(array,0,array.length - 1);
    }
    public static void quickSort2(int[] array){
        quickSortInter2(array,0,array.length - 1);
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    // 递归调用栈在消耗空间
    private static void quickSortInter1(int[] array, int left, int right) {// 左右都是闭区间
        if(left >= right){
            return;
        }
        //int pivotIndex = partition1(array,left,right);
        //int pivotIndex = partition2(array,left,right);
        int pivotIndex = partition3(array,left,right);
        quickSortInter1(array,left,pivotIndex - 1);
        quickSortInter1(array,pivotIndex + 1,right);
    }
    private static void quickSortInter2(int[] array, int left, int right) {// 左右都是闭区间
        if(left >= right){
            return;
        }
        if(right - left + 1 >= 3) {
            int mid = (left + right) / 2;
            if (array[left] > array[mid]) {
                if (array[left] > array[right]) {
                    if (array[mid] > array[right]) {
                        swap(array, left, mid);
                    } else {
                        swap(array, left, right);
                    }
                } else {
                }
            } else {
                if (array[mid] > array[right]) {
                    if (array[left] > array[right]) {
                    } else {
                        swap(array, left, right);
                    }
                } else {
                    swap(array, left, mid);
                }
            }
            int[] pivotIndex = partition4(array,left,right);
            quickSortInter2(array,left,pivotIndex[0]);
            quickSortInter2(array,pivotIndex[1],right);
        }
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
    private static int[] partition4(int[] array,int left,int right){
        int pivot = array[left];
        int less = left;
        int great = right;
        int i = left;
        while(i <= great){
            if(array[i] == pivot){
                i++;
            }else if(array[i] < pivot){
                swap(array,i,less);
                less++;
                i++;
            }else{
                swap(array,i,great);
                great--;
            }
        }
        return new int[] {less - 1, great + 1};
    }

    public static void quickSort3(int[] array) {
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length - 1);
        stack.push(0);
        while (!stack.isEmpty()) {
            int left = stack.pop();
            int right = stack.pop();
            if (left >= right) {
                continue;
            }
            int pivotIndex = partition3(array, left, right);
            stack.push(right);
            stack.push(pivotIndex + 1);
            stack.push(pivotIndex - 1);
            stack.push(left);
        }
    }
    public static void main(String[] args) {
        int[]  a = {2,7,9,5,1,0,2,1};
        quickSort2(a);
        System.out.println(Arrays.toString(a));
    }
}
