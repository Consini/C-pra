/**
 * @ClassName Stack
 * @Description:
 * @Author:
 * @Date: 2019/7/29
 * @Time: 11:34
 * @Version 1.0
 **/
import java.util.Arrays;
public class Stack {
    private int[] array ;
    private int top = 0;

    public Stack(int defaultCapacity){
        array = new int[defaultCapacity];
    }

    public Stack(){
        this(20);
    }

    //插入数据
    public void push(int val){
        if(top == array.length){
            array = Arrays.copyOf(array,array.length * 2);
        }
        array[top++] = val;
    }

    //删除数据
    public void pop(int val){
        if(top <= 0){
            System.out.println("当前栈内没有元素，无法删除！");
            return;
        }
        array[--top] = 0;
    }

    //查看栈顶元素
    public int top(){
        if(top <= 0){
            System.out.println("当前栈内没有数据！");
            return -1;
        }
        return array[top - 1];
    }

    //返回栈内元素个数
    public int size(){
        return top;
    }

    //判断栈是否为空
    public boolean isEmpty(){
        return top == 0;
    }

}
