/**
 * @ClassName generic
 * 泛型类的使用
 * @Author: K
 * @create: 2019/10/19-8:25
 **/
// 定义
class Person<T>{
    // 类型变量并不是任何场景都可以使用，静态的类型变量不可以被使用
    T name;//如定义为静态属性static T name
    T getName(){// 方法 static T geName(){ return name; }
        return name;
    }
    class Node{//内部类 static class Node{ T age; }
        T age;
    }
}

// 使用
public class generic {
    public static void main(String[] args) {
        Person<String> q = new Person<>();
        String s1 = q.getName();
        Person<Integer> p = new Person<>();
        Integer s2 = p.getName();
    }
}

