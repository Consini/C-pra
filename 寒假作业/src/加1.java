/**
 * @Description TODO
 * @Author K
 * @Date 2020/1/14 19:30
 **/
public class 加1 {
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1]+=1;
            return digits;
        }
        digits[digits.length-1]=10;
        int i ;
        for(i = digits.length-1;i>=0;i--){
            if(digits[i]==10){
                digits[i]=0;
                if(i!=0) {
                    digits[i - 1] += 1;
                }
            }else{
                break;
            }
        }
        int[] ret;
        if(i==-1){
            ret = new int[digits.length+1];
            ret[0]=1;
            System.arraycopy(digits,0,ret,1,digits.length);
            return ret;
        }else{
            return digits;
        }
    }
    public static void main(String[] args) {
        int[] a = {9,1,9};
        int[] ret=plusOne(a);
        for(int i=0;i<ret.length;i++){
            System.out.println(ret[i]);
        }
    }
}
