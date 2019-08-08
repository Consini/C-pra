/**
 * @ClassName CountOneBits
 * @Description:
 * @Author: 寇明珠
 * @Date: 2019/8/8
 * @Time: 22:29
 * @Version 1.0
 **/
import com.sun.jmx.snmp.SnmpUnsignedInt;

import java.util.Scanner;
public class CountOneBits {
    //化为二进制求1的个数
    public static int count1(int n){
        int count = 0;
        while(n != 0){
            if(n%2 == 1){
                count++;
            }
            n /= 2;
        }
        return count;
    }
    //位运算
    public static int count2(int n){
        int count = 0;
        for(int i = 1;i <= 32;i++){
            if((n >> i & 1)== 1){
                count++;
            }
        }
        return count;
    }
    //位运算
    public static int count3(int n){
        int count = 0;
        while(n != 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(count1(n));
        System.out.println(count2(n));
        System.out.println(count3(n));
    }
}
