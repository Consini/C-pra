import java.util.Arrays;

/**
 * @ClassName Heap
 * @Author: K
 * @create: 2019/9/22-11:10
 **/
public class Heap {
    public static void shifDownSmall(int[] array,int index,int size){
        int left = 2 * index + 1;//找到 index 位置的左孩子的下标
        while(left < size){
            int min = left;
            int right = left + 1;// 右孩子位置
            if(right < size && array[right] < array[min]){// 选择较小的值
                min = right;
            }
            if(array[index] <= array[min]){
                break;
            }
                swap(array,index,min);
                index = min;
                left = 2 * index + 1;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void shifDownBig(int[] array,int index,int size){
        int left = 2 * index + 1;//找到 index 位置的左孩子的下标
        while(left < size){
            int max = left;
            int right = left + 1;// 右孩子位置
            if(right < size && array[right] > array[max]){// 选择较小的值
                max = right;
            }
            if(array[index] >= array[max]){
                break;
            }
            swap(array,index,max);
            index = max;
            left = 2 * index + 1;
        }
    }

    // 建堆,时间复杂度O(n * log(n))，粗略为 O(n)
    public static void createHeap(int[] array,int size){
        for(int i = (size - 2)/2;i >= 0;i--){
            shifDownSmall(array,i,size);
        }
    }
    public static void main(String[] args) {
        int[] small = {27,15,19,18,28,34,65,49,25,37};
        System.out.println(Arrays.toString(small));
        shifDownSmall(small,0,small.length);
        System.out.println(Arrays.toString(small));
        int[] big = {1,7,9,3,0,3,6,8,2,1,6};
        System.out.println(Arrays.toString(big));
        shifDownBig(big,0,big.length);
        System.out.println(Arrays.toString(big));
        int[] array = {1,7,9,3,0,3,6,8,2,1,6};
        createHeap(array,array.length);
        System.out.println(Arrays.toString(array));
    }
}