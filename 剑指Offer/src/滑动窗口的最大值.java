import java.util.ArrayList;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/26 10:33
 **/
public class 滑动窗口的最大值 {
    /*{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
    他们的最大值分别为{4,4,6,6,6,5}；
    针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
    {[2,3,4],2,6,2,5,1}，
    {2,[3,4,2],6,2,5,1}，
     {2,3,[4,2,6],2,5,1}，
     {2,3,4,[2,6,2],5,1}，
     {2,3,4,2,[6,2,5],1}，
     {2,3,4,2,6,[2,5,1]}。*/
    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(size==0){
            return list;
        }
        for(int i = 0;i <= num.length-size;i++){
            int max = num[i];
            int count = size;
            int j = i;
            while(count-- != 0){
                max = Math.max(max,num[j++]);
            }
            list.add(max);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,2,6,2,5,1};
        System.out.println(maxInWindows(a,0));
    }
}
