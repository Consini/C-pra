// 1. 打印100~200 之间的素数
public class day01{
	public static void main(String[] args){
		int i=0;
		for(i = 101;i <= 200;i+=2){
			int j = 0;
			for(j = 2;j <= i/2;j++){
				if(i % j == 0){
					break;
				}
			}
			if(j > i/2){
				System.out.print(i+" ");
			}
		}
	}
}
// 3. 判断1000年---2000年之间的闰年
// public class day01{
	// public static void main(String[] args){
		// for(int i = 1000;i <= 2000;i++){
			// if(( i%4 == 0 && i%100 != 0)||(i%400 == 0)){
				// System.out.print(i+" ");
			// }
		// }
	// }
// }