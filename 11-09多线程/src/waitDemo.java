import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/12 18:58
 **/
public class waitDemo {
    private static Object object = new Object();
    public static class A extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            // 等待 B 线程启动，并完成某个条件
            synchronized (object) {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 100; i < 110; i++) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Thread a = new A();
        a.start();
        Scanner sc = new Scanner(System.in);
        System.out.println("不输入，A 线程就绝对不会继续");
        sc.nextLine();
        synchronized (object){
            object.notify();
        }
    }
}
