import sun.net.idn.Punycode;

/**
 * @ClassName SumKIndex
 * 数组中相加为k的数字下标
 * @Author: K
 * @create: 2019/8/20-20:18
 **/
public class SumKIndex {
    //时间复杂度 O(n^ 2),遍历数组，
    public static int[] sumK(int[] a,int k){
        int[] index = {-1,-1};
        int i = 0;
        int j = 0;
        for(i = 0;i < a.length - 1;i++){
            for(j = i + 1;j < a.length;j++ ){
                if(a[i] + a[j] == k){
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }
    //定义两个变量
    public static int[] sumK2(int[] a,int k){
        int x = 0;
        int y = a.length - 1;
        int[] result = {-1,-1};
        while(x < y){
            if(a[x] + a[y] == k){
                result[0] = x;
                result[1] = y;
                return result;
            }else if(a[x] + a[y] > k){
                y--;
            }else{
                x++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int k = 14;
        for(int i : sumK(a,k)){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : sumK2(a,k)){
            System.out.print(i+" ");
        }
    }
}
