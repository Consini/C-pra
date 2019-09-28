import java.util.Arrays;
import java.util.Random;
/**
 * @ClassName Lab
 * @Author: K
 * @create: 2019/9/28-11:16
 **/
interface SortMethod{ // 排序方法的抽象
    String getName();
    void sort(int[] a);
}
interface BuildMethod{ // 数组数据初始化的抽象
    String getName();
    int[] build(int n);
}
class InsertSortMethod implements SortMethod{
    @Override
    public String getName() {
        return "插入排序";
    }
    @Override
    public void sort(int[] a) {
        Sort.insertSort(a);
    }
}
class ShellSortMethod implements SortMethod{
    @Override
    public String getName() {
        return "希尔排序";
    }
    @Override
    public void sort(int[] a) {
        Sort.shellSort(a);
    }
}
class selectSortMethod implements SortMethod{
    @Override
    public String getName() {
        return "选择排序";
    }
    @Override
    public void sort(int[] a) {
        Sort.selectSort1(a);
    }
}
class heapSortMethod implements SortMethod{
    @Override
    public String getName() {
        return "堆排序";
    }
    @Override
    public void sort(int[] a) {
        Sort.heapSort(a);
    }
}
class bubbleSortMethod implements SortMethod{
    @Override
    public String getName() {
        return "冒泡排序";
    }
    @Override
    public void sort(int[] a) {
        Sort.bubbleSort(a);
    }
}
class quickSortMethod implements SortMethod{
    @Override
    public String getName() {
        return "快速排序";
    }
    @Override
    public void sort(int[] a) {
        QuickSort.quickSort2(a);
    }
}
class MergeSortMethod implements SortMethod{
    @Override
    public String getName() {
        return "归并排序";
    }
    @Override
    public void sort(int[] a) {
        MergeSort.mergeSort(a);
    }
}
class BuildRandomMethod implements BuildMethod{
    @Override
    public String getName() {
        return "构建随机数组";
    }
    @Override
    public int[] build(int n){
        return Lab.buildRandom(n);
    }
}
class BuildAscendingMethod implements BuildMethod{
    @Override
    public String getName() {
        return "构建升序数组";
    }
    @Override
    public int[] build(int n) {
        return Lab.buildAscending(n);
    }
}
class BuildDesendingMethod implements BuildMethod{
    @Override
    public String getName() {
        return "构建降序数组";
    }
    @Override
    public int[] build(int n) {
        return Lab.buildDesending(n);
    }
}
class BuildEqualsMethod implements BuildMethod{
    @Override
    public String getName() {
        return "构建相等数组";
    }
    @Override
    public int[] build(int n) {
        return Lab.buildEquals(n);
    }
}
public class Lab {
    public static Random random = new Random(20190928);
    public static int[] buildRandom(int n) {// 随机数组
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = random.nextInt(n);
        }
        return r;
    }
    public static int[] buildAscending(int n) {// 升序数组
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = random.nextInt(n);
        }
        Arrays.sort(r);
        return r;
    }
    public static int[] buildDesending(int n) {// 降序数组
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = random.nextInt(n);
        }
        Arrays.sort(r);
        int[] b = new int[n];
        for(int i = 0;i < r.length;i++){
            b[--n] = r[i];
        }
        return b;
    }
    public static int[] buildEquals(int n){// 相等数组
        return new int[n];
    }

    public static void main(String[] args) {
        BuildMethod[] bms = {
                new BuildRandomMethod(),
                new BuildAscendingMethod(),
                new BuildDesendingMethod(),
                new BuildEqualsMethod()
        };
        SortMethod[] sms = {
                new InsertSortMethod(),
                new ShellSortMethod(),
                new selectSortMethod(),
                new heapSortMethod(),
                new bubbleSortMethod(),
                new quickSortMethod(),
                new MergeSortMethod(),
        };
        for(int i = 1;i <= 4;i++){
            int n = 50000 * i;
            for(BuildMethod bm : bms){
                int[] a = bm.build(n);
                for(SortMethod sm : sms){
                    int[] b = a.clone();
                    long begin = System.nanoTime();
                    sm.sort(b);
                    long end = System.nanoTime();
                    double ms = (end - begin) * 1.0 / 1000 / 1000;
                    System.out.printf("数据量：%d，%s，%s,耗时：%sms",n,bm.getName(),sm.getName(),ms);
                    System.out.println();
                }
            }
        }
    }
}
