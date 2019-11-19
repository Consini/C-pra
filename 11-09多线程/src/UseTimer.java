
import java.util.Timer;
import java.util.TimerTask;
class MyTimer {
    //错误版本，执行结果，先打印该起床了，再打印我是另一个人
    // 错误原因：只有一个线程，所以会先休眠，休眠结束后继续执行
//    public void execute(Runnable task, long delay) {
//                try {
//                    Thread.sleep(delay);
//                    task.run();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//    }

    public void execute(Runnable task, long delay) {
        new Thread(new Runnable() {//创建一个新线程，让他休眠，主线程不会受到影响，可以继续执行
            @Override
            public void run() {
                try {
                    Thread.sleep(delay);
                    task.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
public class UseTimer {
    private static class MyTimerTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("该起床了");
        }
    }
    public static void main(String[] args) {
        //就是闹钟
//        Timer timer = new Timer();
//        timer.schedule(new MyTimerTask(), 1000);
//        System.out.println("我是另一个人");//先打印我是另一个人，再打印该起床了

        MyTimer timer = new MyTimer();//先打印我是另一个人，再打印该起床了
        timer.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("该起床了");
            }
        }, 1000);
        System.out.println("我是另一个人");
    }
}

