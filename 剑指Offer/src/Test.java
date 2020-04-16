import java.util.ArrayList;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/26 18:47
 **/
public class Test {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int ret = 0;
        int pos = 0;
        for(int i = 0;i < array.length;i++){
            ret = ret^array[i];
        }
        for( pos = 0;pos < 32;pos++){
            if((ret>>pos & 1) == 1){
                break;
            }
        }
        for(int i = 0;i < array.length;i++){
            if((array[i]>>pos & 1) == 1){
                num1[0] = num1[0]^array[i];
            }
        }
        num2[0] = num1[0]^ret;
    }
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        for(int i = 0;i <= n;i++){
            int k=i;
            while(k!=0){
                if(k%10 == 1){
                    count++;
                }
                k/=10;
            }
        }
        return count;
    }
    public static int LastRemaining_Solution(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            list.add(i);
        }
        int index = 0;
        while(list.size() > 1){
            index = (index+m-1)%list.size();
            list.remove(index);
        }
        return list.size() == 1 ? list.get(0) : -1;
//        int n = sc.nextInt(),m = sc.nextInt();
//        System.out.println(LastRemaining_Solution(n,m));
    }
    public static String LeftRotateString(String str,int n) {
        if(str.isEmpty() || n == 0 || n%str.length()==0){
            return str;
        }
        n = n%str.length();
        return  str.substring(n,str.length()).concat(str.substring(0,n));
    }

    public static void main(String[] args) {
        //System.out.println(LeftRotateString("12",1));
//        while(sc.hasNext()){
//            int n = sc.nextInt();
//            System.out.println(NumberOf1Between1AndN_Solution(n));
//        }
//        int[] a = {1,2,3,4,1,2};
//        int[] n1=new int[1];
//        int[] n2=new int[1];
//        FindNumsAppearOnce(a,n1,n2);
//        System.out.println(n1[0]);
//        System.out.println(n2[0]);
    }
}
