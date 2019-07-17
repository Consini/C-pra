// class IntDemo {
// public int a ;
// }
public class Test {
	public static void main(String[] args) {
		int line = 10;
for (int x = 0; x < line; x++) { //控制⾏行行数
for (int y = 0; y < line -x ; y++) {//控制空格
System.out.print(" ");
}
for (int z = 0; z < x ; z++ ) {
System.out.print("* ");
}
System.out.println();
}
		
		// System.out.println("5" + 2); 
		
		// char a = '哈';
		// int num = 10;
		// System.out.println(a>num);
		
		// int x = 3;
		// int y = 4;
		// int z = 3>4?x+y:x-y;
		// System.out.println(z);
		
		// int x = 3;
		// int y = 4;
		// int result = x++ * y;
		// System.out.println(x);
		// System.out.println(result);
		
		// System.out.println("比特科技\n\t第一节\"Java\"课开班啦");
		// int numA = 10 ;
		// double numB = 10.5 ;
		// String result = "计算结果:" +numA + numB ; // 此时“+”不不是数学运算⽽而是字符连接。
		// System.out.println(result) ;
		// char c = 'A' ;
        // int num = c ;
		// System.out.println(num) ;
		// System.out.println(1.1*1.1);
		// int num = 300 ; // int型变量量
		// byte data = (byte) num ;
		
		// byte data = 10 ; // 10是int类型，在byte范围内
		// System.out.println(data) ;
		
		// int a;
		// System.out.print(a);
		
		// IntDemo test = new IntDemo() ;
		// System.out.println(test.a);
		}
}
