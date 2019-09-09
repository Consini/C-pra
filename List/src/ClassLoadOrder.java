class A {
    static {
        System.out.println("这是 A 的静态代码块");
    }
}

class B extends A {
    static {
        System.out.println("这是 B 的静态代码块");
    }
}

public class ClassLoadOrder extends B {
    public static void main(String[] args) {
        System.out.println("开始");
        new B();
        System.out.println("结束");
    }
}
