import java.util.Arrays;
/**
 * @ClassName Sort
 * 排序算法（升序）
 * @Author: K
 * @create: 2019/9/24-18:48
 **/
public class Sort {
    //  直接插入排序。时间复杂度最坏O(n^2),最好O(n）。空间复杂度O(1)
    // 思路：前面为有序（从后往前判断），后面为无序，（从前往后遍历）
    public static void insertSort(int[] array){
        // 有序区间: [0, i)
        // 无序区间: [i, array.length)
        for(int i = 1;i < array.length;i++){
            int key = array[i];// 保存当前待排序数据
            int j;// 遍历有序部分从后往前比较
            for(j = i - 1;j >= 0 && array[j] > key;j--){
                //条件：如果 j 到达第一个位置表示这个数就是最小的，如果 key >= array[j] 就不用进行处理
                array[j + 1] = array[j];
            }
            array[j + 1] = key;//由于上面j--， 此时 j 的位置是key值正确位置的前一个，所以要+1，将 key 值放到他该在的位置
        }
    }

    // 希尔排序:分组对数据进行预处理
    public static void shellSort(int[] array){
        int gap = array.length;
        while(true){
            gap /= 2;
            // 排序
            for(int i = gap;i < array.length;i++){
                int key = array[i];
                int j = i - gap;
                for(;j >= 0 && array[j] > key;j -= gap){
                    array[j + gap] = array[j];
                }
                array[j + gap] = key;
            }
            if(gap == 1){
                break;
            }
        }
    }

    // 选择排序
    //每次选择最大的元素放到无序区间的最后面,无序在前，有序在后
    public static void selectSort1(int[] array){
        // 无序区间: [0, array.length - i)
        // 有序区间: [array.length - i, array.length)
        for(int i = 0;i < array.length - 1;i++){// 有序
            int max = 0;
            for(int j = 1;j < array.length - i;j++){
                if(array[j] > array[max]){
                    max = j;
                }
            }
            swap(array,array.length - 1 - i,max);
        }
    }
    //每次选择最小的元素放到无序区间的最前面,有序在前，无序在后
    public static void selectSort2(int[] array){
        // 有序区间[0,i)
        //无序区间[i,array.length)
        for(int i = 0;i < array.length - 1;i++){
            int min = i;
            for(int j = i + 1;j < array.length;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            swap(array,min,i);
        }
    }
    public static void swap(int[] array,int a,int b){
        int t = array[a];
        array[a] = array[b];
        array[b] = t;
    }

    // 双向选择排序
    // 每一次从无序区间选出最小 + 最大的元素，存放在无序区间的最前和最后，直到全部待排序的数据元素排完
    public static void selectSortOP(int[] array){
        // 无序区间[begin,end]
        int begin = 0;
        int end = array.length - 1;
        while(begin < end) {
            int min = begin;
            int max = begin;
            for (int i = begin ; i <= end; i++){// 遍历有序
                if(array[i] > array[max]){
                    max = i;
                }
                if(array[i] < array[min]){
                    min = i;
                }
            }
            swap(array, min, begin);
            if(max == begin){
                max = min;
            }
            swap(array,max,end);
            begin++;
            end--;
        }
    }

    // 堆排序
    public static void heapSort(int[] array){// 4 3 2 1
        createHeapBig(array);
        for(int i = 0;i < array.length - 1;i++){
            swap(array,0,array.length - 1 - i);
            shiftDownBig(array,0,array.length - 1 - i);
        }
    }
    // 建立大根堆
    private static void createHeapBig(int[] array) {
        for(int i = (array.length - 2)/2;i >= 0 ;i--){
            shiftDownBig(array,i,array.length);
        }
    }
    // 向下调整
    private static void shiftDownBig(int[] array, int index, int size) {
        int left = index * 2 + 1;
        while(left < size){
            int right = left + 1;
            int max = left;
            if(right < size && array[right] > array[max]){
                max = right;
            }
            if(array[index] >= array[max]){
                break;
            }
            swap(array,index,max);
            index = max;
            left = index * 2 + 1;
        }
    }

    // 冒泡排序:相邻数比较，将大的放在后面
    public static void bubbleSort(int[] array){
        for(int i = 0;i < array.length - 1;i++){
            for(int j = 0;j < array.length - i - 1;j++){
                if(array[j] > array[j + 1]){
                    swap(array,j,j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {4,3,2,1};//数组复制 int[] b = a.clone()
        System.out.println(Arrays.toString(a));
//        insertSort(a);
//        shellSort(a);
//        selectSort1(a);
//        selectSort2(a);
//        selectSortOP(a);
        heapSort(a);
//        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
