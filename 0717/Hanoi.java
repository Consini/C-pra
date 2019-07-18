public class Hanoi{
	public static void main(String[] args){
		Han(3,'A','B','C');
	}
	public static void move(char pos1,char pos2){
		System.out.printf("%c-->%c%n",pos1,pos2);
	}
	public static void Han(int n,char pos1,char pos2,char pos3){
		if(1 == n){
			move(pos1,pos3);
		}else{
			Han(n-1,pos1,pos3,pos2);
			move(pos1,pos3);
			Han(n-1,pos2,pos1,pos3);
		}
	}
}