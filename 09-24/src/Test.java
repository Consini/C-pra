import java.util.Arrays;

/**
 * @ClassName Test
 * @Author: K
 * @create: 2019/9/26-16:39
 **/
public class Test {
    private static void swap(int[] a,int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void insertSort(int[] array){
        for(int i = 1;i < array.length;i++){// 无序
            int v = array[i];
            int j;
            for( j = i - 1;j >= 0 && array[j] > v;j--){// 有序
                array[j + 1] = array[j];
            }
            array[j + 1] = v;
        }
    }
    public static void shellSort(int[] array){
        int gap = array.length;
        while (true){
            gap /= 2;
            for(int i = gap;i < array.length;i++){
                int v = array[i];
                int j;
                for(j = i - gap;j >= 0 && array[j] > v ;j -= gap){
                    array[j + gap] = array[j];
                }
                array[j + gap] = v;
            }
            if(gap == 1){
                break;
            }
        }
    }
    public static void selectSort(int[] array){
        for(int i = 0;i < array.length - 1;i++){// 无序
            int max = 0;
            for(int j = 1;j < array.length - i;j++){// 有序
                if(array[j] > array[max]){
                    max = j;
                }
            }
            swap(array,max,array.length - i - 1);
        }
    }
    public static void bubbleSort(int[] array){
        for(int i = 0;i < array.length - 1;i++){
            for(int j = 1;j < array.length - i - 1;j++){

            }
        }
    }
    public static void main(String[] args) {
        int[] a = {3,6,9,1,2,31,0,2};
        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
