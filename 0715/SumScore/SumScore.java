public class SumScore{
	public static void main(String[] args){
		double sum=0;
		double i=0;
		int flag=-1;
		for(i=1;i<=100;i++){
			flag=-flag;
			sum=flag*(1/i)+sum;
		}
		System.out.println(sum);
	}
}