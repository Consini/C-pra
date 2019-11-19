package 按序打印;
/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/17 11:24
 **/
//0 代表A，1代表 B ，2 代表 C

public class fun1 {
    private static class Foo {
        private static int n = 0;
        // 虽然 n 不为 0，但不让出 CPU，导致 n 无法及时变化。每次都是等到时间片到
        // 加锁 ——>
        public void one() {//只有 n == 0 才继续执行，不为 0 时就退出，然后继续抢锁进行判断
            synchronized (this) {
                if (n != 0) {
                    return;
                }
                System.out.println("one");
                n = 1;
            }
        }
        public void two() {
            synchronized (this) {
                if (n != 1) {
                    return;
                }
                System.out.println("two");
                n = 2;
            }
        }
        public void three() {
            synchronized (this) {
                if (n != 2) {
                    return;
                }
                System.out.println("three");
                n = 0;
            }
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
