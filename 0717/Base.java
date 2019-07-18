public class Base{
	public static void main(String[] args){
		System.out.println(calcE(4));
	}
	//递归
	public static long recu(int n){
		if(n == 1 || n == 0){
			return 1;
		}else{
			return n*recu(n-1);
		}
	}
	//非递归（迭代）
	public stativ long recu2(int n){
		int r=1;
		for(int i=1;i<=n;i++){
			r*=i;
		}
		return r;
	}
	public static double calcE(int num){
		double e=0;
		for(int i=0;i< num;i++){
			e+=(1.0/recu(i));//注意：用1.0除
		}
		return e;
	}
}