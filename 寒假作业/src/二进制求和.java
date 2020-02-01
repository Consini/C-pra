/**
 * @Description TODO
 * @Author K
 * @Date 2020/2/1 12:36
 **/
public class 二进制求和 {
    /* a = "11", b = "1"
输出: "100"
输入: a = "1010", b = "1011"
输出: "10101"*/
    public static String addBinary(String a, String b) {
        StringBuilder string = new StringBuilder();
        int i = a.length() - 1,j = b.length() - 1,add,flag = 0;
        while(i >= 0 || j >= 0){
            if(i < 0){
                add = b.charAt(j) - '0'+flag;
            }else if(j < 0){
                add = a.charAt(i) - '0'+flag;
            }else{
                add = a.charAt(i) - '0'+b.charAt(j) - '0'+flag;
            }
            flag = add>=2 ? 1 : 0;
            string.append(flag==1 ? add-2 : add);
            i--;
            j--;
        }
        if(flag == 1){
            string.append(1);
        }
        return string.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "1010";
        String b = "00";
        System.out.println(addBinary(a,b));
    }
}
