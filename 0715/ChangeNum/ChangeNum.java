import java.util.Scanner;
public class ChangeNum{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int tmp=0;
		tmp=a;
		a=b;
		b=tmp;
		System.out.println(a+"  " +b);
	}
}