import java.util.ArrayList;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/25 22:31
 **/
public class 和为S的两个整数序列 {
    /*利用等差数列求和公式 Sn = (a0+an)*2/n,
    假设从 1 开始累加，S = (1 + n) * n / 2，由该式可知 n² < 2*S

    */
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        int k = (int)(Math.sqrt(2*sum));
        for(int i = k-1;i >= 2;i--){//i表示当前多少个数字相加和可以为S
            int ans = sum/i - i/2;//i个数字的起始数字，之所以从 sum/i - i开始，
            // 是为了避免漏掉某个数字，也可以思考换成其他的
            //if(ans < 0) continue;//若起始数字小于 0，下面的相加就没有意义
            int sum1 = (ans+ans+i-1)*i;//i个数字的和
            while(sum1 < sum*2){//一开始这个条件一定成立，里面要做的就是让起始数字每次加1，
                //再次判断是否符合条件
                ans++;
                sum1 = sum1 + 2*i;
            }
            // 退出循环后如果两个数相等，表示这几个数字就是符合条件的
            if(sum1 == sum*2){
                ArrayList<Integer> list = new ArrayList<>();
                for(int j = ans;j < ans+i;j++){
                    list.add(j);
                }
                ret.add(list);
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(FindContinuousSequence(9));
    }
}
