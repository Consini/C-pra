import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/9 17:01
 **/
public class ThreadDemo3 {
    private static class MyThread3 extends Thread{
        private int n;
        MyThread3 (int n){
            this.n = n;
        }
        @Override
        public void run() {
            long result = Fib.calc(n);
            System.out.printf("第%d项斐波那契数为%d%n",n,result);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入");
            int n = sc.nextInt();
            Thread t = new MyThread3(n);
            System.out.print("计算中");
            t.start();
            while (t.isAlive()){
                Thread.sleep(500);
                System.out.print(".");
            }
            /*
            请输入
            45
            计算中..........第45项斐波那契数为1836311903
            .请输入
            */
        }
    }
}
