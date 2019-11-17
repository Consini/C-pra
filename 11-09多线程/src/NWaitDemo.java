public class NWaitDemo {
    private static Object o = new Object();
    private static int n = 0;
    private static class Sub extends Thread {
        Sub() {
            super("n--");
        }
        @Override
        public void run() {
            while (true) {
                synchronized (o) {
                    if (n == 0) {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    n--;
                    System.out.println(getName() + ":" + n);
                    o.notify();
                }
            }
        }
    }
    private static class Add extends Thread {
        Add() {
            super("n++");
        }
        @Override
        public void run() {
            while (true) {
                synchronized (o) {
                    if (n == 10) {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // 因为锁还没释放（方法没有执行结束），所以 notify 放上面也是可以的
                    o.notify();
                    n++;
                    System.out.println(getName() + ":" + n);
                }
            }
        }
    }
    public static void main(String[] args) {
        Thread a = new Add();
        Thread b = new Sub();
        a.start();
        b.start();
    }
}
