import com.sun.deploy.util.SyncAccess;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/26 17:28
 **/
public class N皇后问题 {
    public static int totalNQueens(int n) {
        if(n < 1){
            return 0;
        }
        // i表示行数，record[i] 表示列数
        int[] record = new int[n];
        return getCount(0,record,n);
    }
    private static int getCount(int i,int[] record,int n){
        if(i == n){
            return 1;
        }
        int ret = 0;//记录数量
        for(int j = 0;j < n;j++){
            if(isValiable(i,j,record)){
                record[i] = j;// 第j列可以放
                ret += getCount(i+1,record,n);
            }
        }
        return ret;
    }
    // 判断第 i 行，第 j 列是否可以放置
    private static boolean isValiable(int i,int j,int[] record){
        int k = 0;
        for(k = 0; k < i;k++){
            if(record[k]==j || (Math.abs(record[k]-j)==Math.abs(k-i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(totalNQueens(n));
    }
}
