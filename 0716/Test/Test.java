//递归实现快速排序
//快速排序：左右指针法
// public class Test{
	// public static void main(String[] args){
		// int[] array ={4,1,7,6,9,2,8,0,3,5};
        // int i=0;
		// for(i=0;i<array.length;i++){
			// System.out.print(i+" ");
		// }
		// quickSort(array,0,array.length-1);
		// System.out.println();
		// for(i=0;i<array.length;i++){
			// System.out.print(i+" ");
		// }
	// }
	// public static int change (int[] array,int left,int right){
		// int key = array[right-1];
		// int tmp=0;
		// while(left < right){
			// while(array[left] < key){
			// left++;
		    // }
		    // while(array[right-1] > key){
			// right--;
		    // }
		    // tmp = array[left];
		    // array[left] = array[right];
		    // array[right] = tmp;
		// }
		// tmp = array[left];
		// array[left] = key;
		// key = tmp;
		// return left;
	// }
	// public static void quickSort(int[] array,int left,int right){
		// if(left < right){
			// int mid = change(array,left,right);
			// quickSort(array,left,mid-1);
			// quickSort(array,mid+1,right);
		// }
		// return ;
	// }
// }













// //递归实现10！
// public class Test{
	// public static void main(String[] args){
		// System.out.println(recur(10));
	// }
	// public static int recur(int num){
		// if(num == 1){
			// return 1;
		// }
		// else{
			// return num*recur(num-1);
		// }
	// }
// }


//实现1-100的增加
// public class Test{
	// public static void main(String[] args){
		// System.out.println(sum(100));
	// }
	// public static int sum(int num){
		// if(num == 1){
		// return 1;
		// }
		// else{
			// return sum(num-1)+num;
		// }
	// }
// }