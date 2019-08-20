/**
 * @ClassName MyPow
 * x的y次方,x ,y均为整数
 * @Author: K
 * @create: 2019/8/19-23:08
 **/
import java.util.Scanner;
public class MyPow {
    // 一步一步运算，x 一次一次的乘
    public static int pow1(int x,int y){
        int ret = 1;
        while(y-- != 0){
            ret *= x;
        }
        return ret;
    }
    // 优化方法，递归思路，如求 8 次方，知道了 4 次方再平方就能得到结果
    public static int pow2(int x,int y){
        //一定要先判断指数是否为 1，否则找不到递归出口
        if(y == 1){
            return x;
        }
        int ret = pow2(x,y>>1);
        ret *= ret;
        if(1 == (y & 1)){
            return ret * x;
        }
        return ret;
    }
    //该方法用来判断指数正负，以及在得到结果后，若指数为负则求倒数
    public static double myPow(int x,int y){
        if(y < 0){
            return 1.0/pow1(x,-y);
           // return 1.0/pow2(x,-y);
        }
        return pow1(x,y);
        //return pow2(x,y);
    }
    // 测试用例
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        while(x != 0 && y != 0){
            System.out.println(myPow(x,y));
        }
        System.out.println("x，y均为整数，请重新输入！");
    }
}
