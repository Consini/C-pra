public class Base{
	public static void main(String[] args){
		System.out.println(calcE(4));
	}
	public static int recu(int n){
		if(n == 1){
			return 1;
		}else{
			return n*recu(n-1);
		}
	}
	public static double calcE(int num){
		double e=1.0;
		if(num == 1){
			return e;
		}else{
		for(int i=2;i< (num+1);i++){
			e+=(1.0/recu(i-1));
		}
		}
		return e;
	}
}