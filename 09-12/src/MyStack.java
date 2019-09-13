import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName MyStack
 * 用队列实现栈
 * @Author: K
 * @create: 2019/9/13-21:53
 **/
/*入队列 add(e) offer(e)
出队列 remove() poll()
队首元素 element() peek()*/
public class MyStack {
    private Queue<Integer> queue = new LinkedList<>();
    public MyStack() {
    }
    public void push(int x) {
        queue.add(x);
    }
    public int pop() {
        for(int i = 0;i < queue.size() - 1;i++){
            int tmp = queue.poll();
            queue.add(tmp);
        }
        return queue.remove();
    }
    public int top() {
        for(int i = 0;i < queue.size() - 1;i++){
            int tmp = queue.remove();
            queue.add(tmp);
        }
        int tmp = queue.poll();
        queue.add(tmp);
        return tmp;
    }
    public boolean empty() {
        return queue.isEmpty() ;
    }
}
