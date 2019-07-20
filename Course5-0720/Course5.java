class Student{
	//没有属性，方法，构造方法
	//编译器自动给一个构造方法
	/*public Student(){
		
	}*/
	//一旦定义了构造方法，编译器不会再给
}
class Person{
	public String name = null;
	public int gender = 0;
	public int age = 0;
	
	public String toString(){
		return String.format("Person(%s,%d,%d)",name,gender,age);
	}
	//方法重载，无参构造方法
	public Person(){
		
	}
	//构造方法
	public Person(String n,int g,int a){
		name = n;
		gender = g;
		age = a;
	}
}
public class Course5{
	public static void main(String[] args){
		Person p = new Person("段狗子",2,12);
		System.out.println(p.toString());
	}
}