package 按序打印;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/17 11:41
 **/
public class fun2{
    private static class Foo {
        private volatile int n = 0;
        // j减少了锁的开销
        public void one() {
            if (n != 0) {
                return;
            }
            // 和 n=1 顺序不能交换，线程调度可能发生在任何时期
            System.out.println("one");
            n = 1;
        }

        public void two() {
            if (n != 1) {
                return;
            }
            System.out.println("two");
            n = 2;
        }

        public void three() {
            if (n != 2) {
                return;
            }
            System.out.println("three");
            n = 0;
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
}
