// 1. 给定两个整形变量的值，将两个值的内容进行交换。
// import java.util.Scanner;
// public class day02{
	// public static void main(String[] args){
		// Scanner input=new Scanner(System.in);
		// int a=input.nextInt();
		// int b=input.nextInt();
		// int tmp=0;
		// tmp=a;
		// a=b;
		// b=tmp;
		// System.out.println(a+"  " +b);
	// }
// }
// 2. 不允许创建临时变量，交换两个数的内容（附加题）
// import java.util.Scanner;
// public class day02{
	// public static void main(String[] args){
		// Scanner input=new Scanner(System.in);
		// int a=input.nextInt();
		// int b=input.nextInt();
		// a=a+b;//加减法
		// b=a-b;
		// a=a-b;
		// // a=a^b;//异或法
		// // b=a^b;
		// // a=a^b;
		// System.out.println(a+" " +b);
	// }
// }

// 3.求10 个整数中最大值。
// public class day02{
	// public static void main(String[] args){
		// int[] a= {1,7,0,45,67,33,88,21,67,8};
		// int max=a[0];
		// for(int i=1;i<a.length;i++){
			// if(a[i] > max){
				// max=a[i];
			// }
		// }
		// System.out.print(max);
	// }
// }


// 4.将三个数按从大到小输出。
// import java.util.Scanner;
// public class day02{
	// public static void main(String[] args){
		// Scanner input = new Scanner(System.in);
		// int a=input.nextInt();
	    // int b=input.nextInt();	
		// int c=input.nextInt();	
		// int max;
		// int min;
		// if(a > b){
			// max = a;
			// min = b;
		// } else{
			// max = b;
			// min = a;
		// }
		// if(c > max){
			// System.out.printf("%d %d %d%n",c,max,min);
		// }else if(c < min){
			// System.out.printf("%d %d %d%n",max,min,c);
		// }else{
			// System.out.printf("%d %d %d%n",max,c,min);
		// }	
	// }
// }

// 5.求两个数的最大公约数。
// import java.util.Scanner;
// public class day02{
	// public static void main(String[] args){
		// Scanner input = new Scanner(System.in);
		// int a=input.nextInt();
	    // int b=input.nextInt();
		// int com = 0;
		// //辗转相除
		// while(a%b !=0){
			// com=a%b;
			// a=b;
			// b=com;
		// }
		// if(a%b == 0){
			// com=b;
		// }
		// //累乘
		// // for(int i=2;i<=a&&i<=b;i++){
			// // while(a%i==0&&b%i==0){
				// // com=com*i;
				// // a/=i;
			    // // b/=i;
			// // }
		// // }
		// System.out.println(com);
	// }
// }

//6.编写程序数一下 1到 100 的所有整数中出现多少次数字9
public class day02{
	public static void main(String[] args){
		int count = 0;
	for(int i = 1; i <= 100;i++){
		if(i % 10 == 9){
			count++;
		}
		if(i / 10 == 9){
			count++;
		}
	}	
	System.out.println(count);
	}
}









