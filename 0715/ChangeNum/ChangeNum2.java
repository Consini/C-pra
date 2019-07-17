import java.util.Scanner;
public class ChangeNum2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" " +b);
	}
}