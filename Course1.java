//顺序表
public class Course1 {
	private int[] array;//数组容量为array.length
	
	private int size;//现有数据个数
	
	public Course1(){//申请空间，初始化数据个数为0
		array = new int[10];
		size = 0;
	}
	
	private static void entureCapacity(){//确定数组容量是否足够，不够扩充
		if(size < array.length){
			return;
		}
		int newCapacity = array.length * 2;
		int newArray = new int[newCapacity];
		for(int i = 0;i < size;i++){
			newArray[i] = array[i];
		}
		array = newArray;//新的引用
	}
	
	public static void print(){//打印数组
		for(int i = 0;i < size;i++){
			System.out.print(array[i]+" ");
		}
		System.ouot.println();
	}
	
	public static void headInsert(int element){//头插
		ensureCapacity();
		// for(int i = size - 1;i >= 0; i--){
			// array[i+1] = array[i];
		// }
		for(int i = size;i > 0;i--){
			array[i] = array[i - 1];
		}
		array[0] = element;
		size++;
	}
	
	public static void tailInsert(int element){//尾插
		ensureCapacity();
		array[size++] = element;
	}
	
	public static void insert(int index,int element){//指定下标插入
		if (index < 0 || index > size) {
			System.err.println("下标错误");
			return;
		}
		
		ensureCapacity();
		// for(int i = size; i > index ; i--){
			// array[i] = array[i - 1];
		// }
		for(int i = size - 1;i >= index;i--){
			array[i + 1] = array[i];
		}
		array[index] = element;
		size++;
	}
	
	public static void headDelect(){//头删
		if (size <= 0) {
			System.err.println("顺序表为空");
			return;
		}
		
		for(int i = 1;i < size;i++){
			array[i - 1] = array[i];
		}
		array[--size] = 0;
	}
	
	public static void tailDelect(){//尾删
		if (size <= 0) {
			System.err.println("顺序表为空");
			return;
		}
		array[--size] = 0;
	}
	
	public static void delect(int index){//删除
		if (size <= 0) {
			System.err.println("顺序表为空");
			return;
		}
		if (index < 0 || index >= size) {
			System.err.println("下标错误");
			return;
		}
		
		for(int i = index + 1;i < size;i++){
			array[i - 1] = array[i];
		}
		array[--size] = 0;
	}
	
	public static int search(int element){//查找
		for(int i = 0;i < size;i++){
			if(array[i] = element){
				return i;
			}
		}
		return -1;
	}
	
	public static void modify(int index,int element){
		if (index < 0 || index > size) {
			System.err.println("下标错误");
			return;
		}
		array[index] = element;
	}
	
	public static void main (String[] args){
		Course1 list = new Course1;
		
	}
	
}
