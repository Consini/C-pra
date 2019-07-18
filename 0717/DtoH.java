//十进制转为十六进制
import java.util.Scanner;
public class DtoH{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		System.out.println(decToHex(value));
	}
	public static char changeToChar(int n){
		if(n < 10){
			return (char)(n+'0');
		}
		else{
			return (char)((n-10)+'A');
		}
	}
	public static String decToHex(int n){
		String c = "";
		int num=0;
		while(n != 0){
			num = n%16;
			c = changeToChar(num) + c;
			n = n >> 4;//位运算较快
			// n = n / 16;
		}
		return c;
	}
}