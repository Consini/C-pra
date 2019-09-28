import javax.swing.*;
import java.util.Comparator;
import java.util.SplittableRandom;
/**
 * @ClassName Person
 * 对象的比较
 * @Author: K
 * @create: 2019/9/28-14:53
 **/
class PersonNameComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}
class PersonHighComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return (int)(o1.high - o2.high);
    }
}
class PersonComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.high < o2.high){
            return -1;
        }else if(o1.high > o2.high){
            return 1;
        }

        if(o1.weight < o2.weight){
            return -1;
        }else if(o1.weight > o2.weight){
            return 1;
        }

        int r = o1.name.compareTo(o2.name);
        if(r < 0){
            return -1;
        }else if(r > 1){
            return 1;
        }

        if(o1.age < o2.age){
            return -1;
        }else if(o1.age > o2.age){
            return 1;
        }
        return 0;
    }
}
public class Person implements Comparable<Person>{
    public String name;
    public int age;
    public double high;
    public double weight;

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
        //return age - o.age;
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "caa";
        Person p2 = new Person();
        p2.name = "bbb";
        int c = p1.compareTo(p2);
//        Comparator<Person> comparator = new PersonComparator();
//        c = comparator.compare(p1,p2);
        if(c < 0){
            System.out.println("p1 小于 p2");
        }else if(c == 0){
            System.out.println("p1 等于 p2");
        }else{
            System.out.println("p1 大于 p2");
        }
        //System.out.println("abc".compareTo("bbc"));
    }
}
