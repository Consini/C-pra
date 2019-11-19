package 按序打印;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/17 11:50
 **/
/*假如此时 n = 1，A线程进来发现 n ！= 0，就把A放入等待集，然后假设 C 上来，发现 n != 2,把自己放到等待集上
然后 B 发现 n == 1，打印 two然后将 n 置为 2，再将等待集中的 A ，C 放出来，开始新的抢夺和判断
 */
public class fun4 {
    private static class Foo {
        private int n = 0;
        // 条件不满足，退出 CPU，并不进行抢夺
        public void one() throws InterruptedException {
            //
            if (n != 0) {
                synchronized (this){
                    wait();
                }
                return;
            }
            // 和 n=1 顺序不能交换，线程调度可能发生在任何时期
            System.out.println("one");
            n = 1;
            synchronized (this){
                notifyAll();
            }
        }

        public void two() throws InterruptedException {
            if (n != 1) {
                synchronized (this){
                    wait();
                }
                return;
            }
            System.out.println("two");
            n = 2;
            synchronized (this){
                notifyAll();
            }
        }

        public void three() throws InterruptedException {
            if (n != 2) {
                synchronized (this){
                    wait();
                }
                return;
            }
            System.out.println("three");
            n = 0;
            synchronized (this){
                notifyAll();
            }
        }
        private static Foo foo = new Foo();
        private static class OneThread extends Thread {
            @Override
            public void run() {
                while (true) {
                    try {
                        foo.one();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        private static class TwoThread extends Thread {
            @Override
            public void run() {
                while (true) {
                    try {
                        foo.two();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        private static class ThreeThread extends Thread {
            @Override
            public void run() {
                while (true) {
                    try {
                        foo.three();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public static void main(String[] args) {
            Thread one = new Foo.OneThread();
            Thread two = new Foo.TwoThread();
            Thread three = new Foo.ThreeThread();
            one.start();
            two.start();
            three.start();
        }
    }
}
