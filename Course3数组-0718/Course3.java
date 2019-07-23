import java.util.Arrays;
public class Course3{
	public static void main(String[] args){		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binarySearch1(a,0));
		System.out.println(binarySearch2(a,2));
		// swap(a,0,3);	//swap(a[0],a[3]);//错误的	
		// System.out.println(indexOf(a,3));
		// int[] b=copyOf(a,7);
		// for(int i=0;i<b.length;i++){
			// System.out.print(b[i]+" ");
		// }
	}
	//数组引用
	public static void Fun(){
		int[] x = null ;
        int[] temp = null ; // 声明对象
        x = new int[3] ;
		System.out.println(x.length) ;// 3
		x[0] = 1 ; // 数组第一个元素
		x[1] = 2 ; // 数组第二个元素
		x[2] = 3 ; // 数组第三个元素
		for (int i = 0; i<x.length ; i++) {
			System.out.print(x[i]+" ") ; // 通过循环控制索引下标更改,输出为1 2 3
		  }
		temp = x ; //如果要发生引用传递，不要出现[]
		temp[0] = 55 ; // 修改数据
		System.out.println(x[0]) ;//55
	}
	//二分查找,前提是数组必须是有序的
	public static int binarySearch1(int[] a,int v){
		int left = 0;
		int right = a.length;
		int mid = 0;		
		//左闭右开
		while(left < right){
			mid = left + (right - left)/2;
			if(a[mid] == v){
				return mid;
			}else if(a[mid] > v){
				right = mid;
			}else{
				left = mid + 1;
			}
		}
		return -1;
	}
	public static int binarySearch2(int[] a, int v) {
		int left = 0;
		int right = a.length - 1;
		//左闭右闭
		while (left <= right) {
			int mid = (left + right) / 2;
			if (v == a[mid]) {
				return mid;
			} else if (v < a[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}		
		return -1;
	}
	//fill(int[] a,int val)给定知道值val将数组每个元素置为val
	public static void fill(int[] a,int v){
		for(int i=0;i<a.length;i++){
			a[i]=v;
		}
	}
	//copyOf(int[] a,int newlength)复制数组，如果原数组比新长度长，截断原数组；
	public static int[] copyOf(int[] original,int newlength){
		int[] newarray = new int[newlength];
		int len = original.length <= newlength ? original.length : newlength;
		for(int i = 0;i < len;i++){
			newarray[i] = original[i];
		}
		// if(newlength >= original.length){
			// for(int i = 0;i < original.length;i++){
				// newarray[i] = original[i];
			// }
		// }else{
			// for(int j = 0;j < newlength;j++){
				// newarray[j] = original[j];
			// }
		// }
		return newarray;
	}
	//v第一次出现在a中的位置，没有找到返回-1
	public static int indexOf(int[] a,int v){
		for(int i=0;i<a.length;i++){
			if(a[i] == v){
				return i;
			}
		}
		return -1;
	}
	//交换数组的值
	public static void swap(int[] a,int i,int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
