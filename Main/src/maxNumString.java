import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/10 8:36
 **/
public class maxNumString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer s = new StringBuffer();
        for(int i = 0;i < str.length();){
            int j = i;
            while(j < str.length() && str.charAt(j) >= '0' && str.charAt(j) <= '9'){
                j++;
            }
            j--;
            if( i != j && (j - i + 1) > s.length()){
                s.delete(0,s.length());
                if(j == s.length() - 1){
                    s.append(str.substring(i,j));
                    s.append(str.charAt(j));
                }
                s.append(str.substring(i,j+1));
            }
            if(j > i + 1){
                i = j+1;
            }else{
                i++;
            }
        }
        System.out.println(s);
    }
}
