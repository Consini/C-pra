import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/9 16:46
 **/
class Fib{
    // 时间复杂度 O(2^n)
    public static long calc(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return calc(n - 1)+calc(n - 2);
        }
    }
}
class MyThread2 extends Thread{
    private int n;
    MyThread2 (int n){
        this.n = n;
    }
    @Override
    public void run(){
        long result = Fib.calc(n);
        System.out.printf("第%d项斐波那契数为%d%n",n,result);
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入要计算第几项斐波那契数");
            int n = sc.nextInt();
            Thread t = new MyThread2(n);// 输入n后，创建一个线程去计算它，然后打印。
            t.start();
            // 此时输入一个较大的数后，还没计算出来就可以先输入下一个数字
            /*3
            请输入要计算第几项斐波那契数
            第3项斐波那契数为3
            45
            请输入要计算第几项斐波那契数
            6
            请输入要计算第几项斐波那契数
            第6项斐波那契数为13
            第45项斐波那契数为1836311903
            */
        }
    }
}
