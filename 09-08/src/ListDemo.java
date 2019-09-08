import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName WrapperClass
 * 包装类
 * @Author: K
 * @create: 2019/9/8-11:56
 **/
public class ListDemo {
    public static void main(String[] args) {
        List<String> courese = new ArrayList<>();
        courese.add("C");
        courese.add("JavaSE");
        courese.add("JavaSE");
        courese.add("JavaEE");
        courese.add("JavaWeb");
        System.out.println(courese);
        System.out.println(courese.set(0,"C语言"));
        System.out.println(courese);
        System.out.println(courese.subList(0,2));
        //System.out.println(courese.remove(1));
        System.out.println(courese.remove("JavaSE"));
        System.out.println(courese);
    }
}
