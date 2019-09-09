/**
 * @ClassName List
 * 接口
 * @Author: K
 * @create: 2019/9/9-21:21
 **/
//接口
public interface List {
    void pushBack(int element);
    void pushFront(int element);
    void insert(int index, int element);
}
// AbstractList 抽象类实现了 List ，覆写了 pushFront / pushBack 方法，留了一个 insert 方法
//AbstractList 中只是线性表，把公共代码提取出来，无法实现insert 方法，因为顺序表和链表的insert是不同的
abstract class AbstractList implements List {
    protected int size = 0;
    @Override
    public void pushBack(int element) {
        insert(size, element);
    }
    @Override
    public void pushFront(int element) {
        insert(0, element);
    }
}
// ArrayList 类继承了 AbstractList 实现了 List，覆写了 insert
class ArrayList extends AbstractList implements List {
    private int[] array = new int[100];
    @Override
    public void insert(int index, int element) {
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }
}
//LinkedList 类继承了 AbstractList 实现了 List，覆写了 insert
class LinkedList extends AbstractList implements List {
    @Override
    public void insert(int index, int element) {
    }
}
