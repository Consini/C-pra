/**
 * @Description 多线程示例1
 * @Author K
 * @Date 2019/11/9 16:10
 **/
public class ThreadDemo1 {
    private static class MyThread extends Thread{
        @Override
        public void run() {
            while(true){
                System.out.println("method2 中打印");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static void method1() throws InterruptedException {
        while(true){
            System.out.println("method1 中打印");
            Thread.sleep(1000);
        }
    }
    private static void method2(){
        MyThread t = new MyThread();
        t.start();
    }
    public static void main(String[] args) throws InterruptedException {
        //method1();//一直打印 method1
        method2();// 两个死循环可以同时开始执行，没有一个卡主另一个的情况，
        // main 和 method2 交替打印
        while(true){
            System.out.println("main中打印");
            Thread.sleep(1000);// 进程会暂停运行 1 秒
        }
    }
}
