public class CountNum{
	public static void main(String[] args){
		double d=0.0;
		int flag=-1;
		double m=0;
		for(double i=1;i<=3;i++){
			flag=-flag;
			m=2*i-1;
			d+=flag*(1/m);
		}
		System.out.println(d);
		System.out.println(d*4);
	}
}