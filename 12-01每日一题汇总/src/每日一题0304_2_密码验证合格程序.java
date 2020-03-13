import java.util.Scanner;
/**
 * @Description TODO
 * @Author K
 * @Date 2020/3/4 20:16
 **/
/*
021Abc9000   OK
021Abc9Abc1  NG
021ABC9000   NG
021$bc9000   OK
abcabc
*/
public class 每日一题0304_2_密码验证合格程序 {
    private static boolean isMoreThree(int n1,StringBuilder stringBuilder,int n4){
        int count = 0;
        if(n1 > 0){
            count++;
        }
        if(n4 > 0){
            count++;
        }
        boolean upper = true;
        boolean lower = true;
        for(int i = 0;i < stringBuilder.length();i++){
            char c = stringBuilder.charAt(i);
            if(upper && c >= 'A' && c <= 'Z'){
                count++;
                upper = false;
            }
            if(lower && c >= 'a' && c <= 'z'){
                count++;
                lower = false;
            }
        }
        return count >= 3;
    }
    private static boolean isRepeat(StringBuilder stringBuilder){
        String string = stringBuilder.toString();
        for(int i = 0;i <= string.length() - 2;i++){
            int index = string.indexOf(string.charAt(i),i+2);
            if(index != -1 && index <= string.length()/2){
                if(string.substring(i,index).equals(string.substring(index,index+index-i))){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String password = sc.nextLine();
            if (password.length() < 8) {
                System.out.println("NG");
            } else {
                StringBuilder nums = new StringBuilder();
                StringBuilder letter = new StringBuilder();
                StringBuilder other = new StringBuilder();
                for (int i = 0; i < password.length(); i++) {
                    char c = password.charAt(i);
                    if (c >= '0' && c <= '9') {
                        if(nums.length() < 2) {
                            nums.append(c);
                        }else{

                        }
                    } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                        letter.append(c);
                    } else {
                        other.append(c);
                    }
                }
                boolean flag = true;
                if (isMoreThree(nums.length(), letter, other.length())) {
                    if (nums.length() > 2) {
                        if (!isRepeat(nums)) {
                            System.out.println("NG");
                            flag = false;
                        }
                    }
                    if (flag && letter.length() > 2) {
                        if (!isRepeat(letter)) {
                            System.out.println("NG");
                            flag = false;
                        }
                    }
                    if (flag && other.length() > 2) {
                        if (!isRepeat(other)) {
                            System.out.println("NG");
                            flag = false;
                        }
                    }
                    if(flag) {
                        System.out.println("OK");
                    }
                } else {
                    System.out.println("NG");
                }
            }
        }
    }
}
