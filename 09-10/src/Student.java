/**
 * @ClassName Student
 * @Author: K
 * @create: 2019/9/10-20:38
 **/
public class Student {
        String sn;//学号
        String name;
        int age;
        int gender;

    @Override
    public boolean equals(Object o){
        //如果o为null或者o与Card不是一个类型，直接返回false
        if(null == o || !(o instanceof Card)){
            return false;
        }
        //如果o与this指向同一块区域返回true
        if(this == o){
            return true;
        }
        return sn.equals(((Student) o).sn);
    }
}
