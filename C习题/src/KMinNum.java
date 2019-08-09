/**
 * @ClassName KMinNum
 * @Description:
 * @Author: 寇明珠
 * @Date: 2019/8/9
 * @Time: 22:57
 * @Version 1.0
 **/
public class KMinNum {
    public static void minNumOfK(int[] a,int k){
        int min = a[0];
        int j = -1;
        while(k != 0){
            min = a[0];
            for(int i = 0;i < a.length;i++){
                if(j != i) {
                    if (a[i] <= min) {
                        min = a[i];
                        j = i;
                    }
                }
            }
            System.out.println(min);
            k--;
        }

    }
    public static void main(String[] args) {
        int[] a = {2,5,8,9,0,1,4,6,7,2};
        minNumOfK(a,3);
    }
}
