import java.util.*;

/**
 * @ClassName test
 * @Author: K
 * @create: 2019/10/31-15:23
 **/
public class test {
    // 递归判断 num 中是否包含数字 key
    private static int checkNum(int num,int key){
        if(num == 0){
            return 0;// 不包含
        }
        if(num % 10 == key){
            return 1;// 包含
        }
        return checkNum(num/10,key);
    }
    // 数列求值
    public static int getNum(int n){
        int a = 1;
        int b = 1;
        int c = 1;
        int sum = 3;
        n -= 4;
        while(n != 0){
            a = b;
            b = c;
            c = sum;
            sum = (a + b + c) % 10000;
            n--;
        }
        return sum;
    }
    //数的分解
    public static int test2(){
        int n = 2019;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 1;i < 2000;i++){
            if(checkNum(i,2) == 0 && checkNum(i,4) == 0){
                for(int j = 1999;j >= 3;j--){
                    if(i != j &&checkNum(j,2) == 0 && checkNum(j,4) == 0){
                        map.put(i,j);
                        int k = n - i - j;
                        if(k > 0 && i != k && k != j && 0 == checkNum(k,2) && 0 == checkNum(k,4)){
                            if(!map.containsKey(j) && !map.containsValue(i)){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
    // 特别数的和
    public static int test4(int n){
        if(n == 1 ){
            return n;
        }
        if(n == 2){
            return 3;
        }
        if(n == 9){
            return 12;
        }
        int sum = 12;
        for(int i = 10;i <= n ;i++){
            if(checkNum(i,0) == 1 || checkNum(i,1) == 1 || checkNum(i,2) == 1 || checkNum(i,9) == 1 ){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // 外卖店优先级
        // n家外卖，m条订单信息，t时刻优先缓存店家个数
        // 每经过一个时刻，有一单优先级加 2，没有则减 1，最少减到 0
        int n,m,t;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        m = input.nextInt();
        t = input.nextInt();
        int[] a = new int[m*2];
        while(input.hasNext()){
            for(int i = 0;i < a.length;i++){
                a[i] = input.nextInt();
            }
        }



        //System.out.println(test4(100));//100-->2839
        //System.out.println(test2());
        //System.out.println(getNum(20190324));//数据溢出,保留后四位即可
    }
}
