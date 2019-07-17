
public class PrimeNum{
	public static void main(String[] args){
		int i=0;
		for(i=100;i<=200;i++){
			int j=0;
			for(j=2;j<i/2;j+=2){
			if(i%j == 0) break;}
			if(j>i/2){
				System.out.print(i+" ");
			}
		}
	}
}	