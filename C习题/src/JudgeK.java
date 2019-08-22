/**
 * @ClassName JudgeK
 * 判断一个数是否是2的k次方
 * @Author: K
 * @create: 2019/8/21-22:50
 **/
public class JudgeK {
    public static boolean judge1(int n){
        int count = 0;
        for(int i = 1;i <= 32;i++){
            if((n >> i & 1) == 1){
                count++;
            }
        }
        if(count == 1){
            return true;
        }
        return false;
    }
    public static boolean judge2(int n){
        if(n < 1){
            return false;
        }
        return (n & (n - 1))==0;
    }

    public static void main(String[] args) {
        int n = 23;
        System.out.println(judge1(n));
        System.out.println(judge2(n));
    }
}
