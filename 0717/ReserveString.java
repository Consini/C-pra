public class ReserveString{
	public static void main(String[] args){
		String s = "!olleh";
		System.out.println(rese(s));
	}
	public static String rese(String s){
		int len =  s.length();
		String r="";
		for(int i = len-1;i >=0 ;i--){
			r+=s.charAt(i);
		}
		return r;
	}
}