public class LeapYear{
	public static void main (String[] args){
		int i=0;
		int count=0;
		for(i=1000;i<=2000;i++){
			if((i%4==0 && i%100!=0) ^(i%400==0)){
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println(count);
	}
}