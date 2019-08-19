/**
 * @ClassName MyPow
 * x的y次方,x ,y均为整数
 * @Author: K
 * @create: 2019/8/19-23:08
 **/
public class MyPow {
    public static int pow(int x,int y){
        if(y == 0){
            return 1;
        }
        return x * pow(x,y-1);
    }
    public static long jc(int a){
            if(a == 1){
            return 1;
        }
        return a * jc(a - 1);
    }
    public static void main(String[] args) {
        System.out.println(pow(2,3));
        System.out.println(jc(100));
    }
}
