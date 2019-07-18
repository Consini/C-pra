public class CountNum{
	public static void main(String[] args){
		double d=clcePi(100);
		System.out.println(d);
		System.out.println(d*4);
	}
	public static double clcePi(int n){
		int flag=-1;
		double m=0;
		for(double i=1;i<=n;i++){
			flag=-flag;
			m+=flag*(1/(2*i-1));
		}
		return m;
	}
}