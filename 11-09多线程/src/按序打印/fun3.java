package 按序打印;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/17 11:33
 **/
public class fun3 {
    private static class Foo {
        private static int n = 0;
        // 条件不满足时可以及时释放 CPU，但是还是参与 CPU 的抢夺
        // Thread.yield() 可以适当增加性能
        public void one() {
            synchronized (this) {
                if (n == 0) {
                    n = 1;
                    System.out.println("one");
                }
            }
            Thread.yield();//让出 CPU
        }
        public void two() {
            synchronized (this) {
                if (n == 1) {
                    n = 2;
                    System.out.println("two");
                }
            }
            Thread.yield();
        }
        public void three() {
            synchronized (this) {
                if (n == 2) {
                    n = 0;
                    System.out.println("three");
                }
            }
            Thread.yield();
        }
    }
    private static Foo foo = new Foo();
    private static class OneThread extends Thread {
        @Override
        public void run() {
            while (true) {
                foo.one();
            }
        }
    }
    private static class TwoThread extends Thread {
        @Override
        public void run() {
            while (true) {
                foo.two();
            }
        }
    }
    private static class ThreeThread extends Thread {
        @Override
        public void run() {
            while (true) {
                foo.three();
            }
        }
    }
    public static void main(String[] args) {
        Thread one = new OneThread();
        Thread two = new TwoThread();
        Thread three = new ThreeThread();
        one.start();
        two.start();
        three.start();
    }
}
