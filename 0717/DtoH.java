//十进制转为二进制
public class DtoH{
	public static void main(String[] args){
		System.out.println(decToHex(1958));
	}
	public static String decToHex(int n){
		char c;
		while(n > 16){
			n/=16;
			c = (char)(n%16);
			decToHex(n);
		}
		System.out.printf("%s%n",n);
		return;
	}
}