import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @ClassName CollectionDemo
 * java集合框架
 * @Author: K
 * @create: 2019/9/8-9:55
 **/
//        boolean add(E e) 将元素 e 放入集合中
//        void clear() 删除集合中的所有元素
//        boolean isEmpty() 判断集合是否没有任何元素，俗称空集合
//        boolean remove(Object e) 如果元素 e 出现在集合中，删除其中一个
//        int size() 返回集合中的元素个数
//        Object[] toArray() 返回一个装有所有集合中元素的数组
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("我");
        list.add("爱");
        list.add("Java");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        Object[] array = list.toArray();
        System.out.println("=======");
        System.out.println(Arrays.toString(array));
        for(String e : list){
            System.out.println(e);
        }
        list.remove("我");
        for(String e : list){
            System.out.println(e);
        }
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
