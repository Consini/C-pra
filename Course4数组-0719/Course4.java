import java.util.Arrays;
public class Course4{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6};
		//bubbleSort1(a);
		// for(int i = 0;i < a.length;i++){
			// System.out.print(a[i]+" ");
		// }
		
		// System.out.println();
		// bubbleSort2(a);
		// for(int i = 0;i < a.length;i++){
			// System.out.print(a[i]+" ");
		// }
		// System.out.println();
		
		//System.out.println(average(a
		
		//int[]  c = rotating(a,3);
		// for(int i=0;i<a.length;i++){
			// System.out.print(a[i]+" ");
		// }
		
		//System.out.println(Arrays.toString(rotating(a,3)));
		
		// int[] b = sortArrayByParity2(a);
		// for(int i = 0;i < b.length ; i++){
			// System.out.print(b[i]+" ");
		// }
		// System.out.println();
	}
	//偶数放在前面，奇数放在后面
	//从前面找奇数，后面找偶数，找到交换。直至left>=right
	public static int[] sortArrayByParity1(int[] a){
		int left = 0;
		int right = a.length - 1;
		while (left < right){
			while( left < right && a[left] % 2 == 0 ){
				left++;
			}
			while( left < right && a[right] %2 != 0){
				right--;
			}
			swap(a,left,right);
		}
		return a;
	}
	//从前面定义两个变量i和d，i向后走找偶数，找到了和d交换
	public static int[] sortArrayByParity2(int[] a){
		int d = 0;
		for(int i = 0;i < a.length;i++){
			if( a[i] % 2 == 0){
				swap(a, i, d);
				d++;
			}
		}
		return a;
	}
	//旋转数组rotating(a,3)  1 2 3 4 5-->3 4 5 1 2
	public static int[] rotating(int[] a,int n){
		n = n%a.length;
		int[] b = Arrays.copyOfRange(a,a.length-n,a.length);
		System.arraycopy(a,0,a,n,a.length-n);	
		System.arraycopy(b,0,a,0,n);		
		return b;
	}
	//求数组平均值，去掉最大值和最小值
	public static double average(int[] a){
		int sum = 0;
		int max = a[0];
		int min = a[0];
		// int max = Integer.MIN_VALUE;//int最小值-2^31
		// int min = Integer.MAX_VALUE;//int最大值(2^31)-1
		for(int v : a){
			sum += v;
			if( v > max){
				max = v;
			}
			if(v < min){
				min = v;
			}
		}
		return (double)(sum - max - min)/(a.length - 2);
	}
	//交换数组元素
	public static void swap(int[] array,int a,int b){
			array[a] = array[a] + array[b];//加减法
		    array[b] = array[a] - array[b];
		    array[a] = array[a] - array[b];
	}
	//冒泡排序，从后往前找小数放在前面
	public static void bubbleSort2(int[] a){
		for(int i = 0;i < a.length;i++){
			//有序区间[0,i)
			//无序区间[i,a.length)
			for(int j = a.length - 1;j > i ;j--){
				if(a[j-1] > a[j]){
				swap(a,j-1,j);	
				}
			}
		}
	}
	//冒泡排序（减治算法）,从前往后找大数放在后面
	public static void bubbleSort1(int[] a){
		for(int i = 0;i < a.length;i++){
			//无序区间[0,a.length-i)
			//有序区间[a.length-i,a.length)
			boolean flag = true;
			//如果一次都没有交换，则原数组就是有序的
			for(int j = 0;j < a.length - i - 1;j++){
				if(a[j] > a[j+1]){
				swap(a,j,j+1);
				flag = false;
				}				
			}
		}
	}
}