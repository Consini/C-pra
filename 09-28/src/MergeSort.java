import com.sun.media.sound.RIFFInvalidDataException;

import java.util.Arrays;

/**
 * @ClassName MergeSort
 * 归并排序
 * @Author: K
 * @create: 2019/9/28-9:12
 **/
public class MergeSort {
    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length);
    }
    private static void mergeSortInternal(int[] array, int low, int high) {
        if(low >= high - 1){
            return;
        }
        int mid = (high + low) / 2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid,high);
        merge(array,low,mid,high);
    }
    private static void merge(int[] array, int low, int mid, int high) {
        int[] b = new int[high - low];
        int i = low;
        int j = mid;
        int k = 0;
        while(i < mid && j < high){
            if(array[i] > array[j]){
                b[k++] = array[j++];
            }else{
                b[k++] = array[i++];
            }
        }
        while(i < mid){
            b[k++] = array[i++];
        }
        while(j < high){
            b[k++] = array[j++];
        }
        for(int m = 0;m < high - low;m++){
            array[low + m] = b[m];
        }
    }

    public static void mergeSort2(int[] array){
        int[] extra = new int[array.length];
        mergeSortInternal2(array,0,array.length,extra);
    }

    private static void mergeSortInternal2(int[] array, int low, int high,int[] extra) {
        if(low >= high - 1){
            return;
        }
        int mid = (high + low) / 2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid,high);
        merge2(array,low,mid,high,extra);
    }
    private static void merge2(int[] array, int low, int mid, int high,int[] extra) {
        int i = low;
        int j = mid;
        int k = 0;
        while(i < mid && j < high){
            if(array[i] > array[j]){
                extra[k++] = array[j++];
            }else{
                extra[k++] = array[i++];
            }
        }
        while(i < mid){
            extra[k++] = array[i++];
        }
        while(j < high){
            extra[k++] = array[j++];
        }
        for(int m = 0;m < high - low;m++){
            array[low + m] = extra[m];
        }
    }


    public static void mergeSort3(int[] array){
        for (int i = 1;i < array.length;i *= 2){// 多少层
            for(int j = 0;j < array.length;j = j + 2 * i){
                int low = j;
                int mid = j + i;
                if(mid >= array.length){
                    continue;
                }
                int high = mid + i;
                if(high > array.length){
                    high = array.length;
                }
                merge(array,low,mid,high);
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,9,0,2,4,8,1,2,5,9,6,3};
        System.out.println(Arrays.toString(a));
        //mergeSort(a);
        //mergeSort2(a);
        mergeSort3(a);
        System.out.println(Arrays.toString(a));
    }
}
