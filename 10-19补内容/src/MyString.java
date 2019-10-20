import java.util.Arrays;

/**
 * @ClassName MyString
 * @Author: K
 * @create: 2019/10/19-16:55
 **/
public final class MyString {// 不能被继承,保证不可变性
    private final char[] value;
    public MyString(char[] value){
        this.value = Arrays.copyOf(value,value.length);
    }
    public MyString(char[] value,int offset,int count){
        this.value = Arrays.copyOfRange(value,offset,offset+count);
    }
    public char charAt(int index){
        return value[index];
    }
    public char[] toCharArray(){
        return Arrays.copyOf(value,value.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyString myString = (MyString) o;
        return Arrays.equals(value, myString.value);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(value);
    }

    public MyString toUpperCase(){
        char[] value = toCharArray();
        for(int i = 0;i < value.length;i++){
            if(Character.isLowerCase(value[i])){// 不考虑不可变性
                value[i] = Character.toUpperCase(value[i]);
            }
        }
        return new MyString(value);// 考虑不可变性
    }
    public boolean equalsIgnoreCase(MyString o){// 忽略大小写的比较
        if(o == null || o.value.length != value.length){
            return false;
        }
        for(int i = 0;i < value.length;i++){
            char c = Character.toUpperCase(value[i]);
            char d = Character.toUpperCase(o.value[i]);
            if(c != d){
                return false;
            }
        }
        return true;
    }
    public MyString contact(MyString o){// 拼接
        char[] v = new char[value.length + o.value.length];
        System.arraycopy(value,0,v,0,value.length);
        System.arraycopy(o.value,0,v,value.length,o.value.length);
        return new MyString(v);
    }
}
