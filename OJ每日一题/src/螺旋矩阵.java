import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/17 15:49
 **/
public class 螺旋矩阵 {
    private static volatile int num = 1;
    private static void fun(int[][] a, int n, int m,int start){
        int x = m - 1 - start;
        int y = n - 1 - start;
        for(int j = start;j <= x;j++){
            a[start][j] = num++;
        }
        if(y > start){
            for(int i = start + 1;i <= y;i++){
                a[i][x] = num++;
            }
        }
        if(x > start && y >start){
            for(int j = x-1;j >= start;j--){
                a[y][j] = num++;
            }
        }
        if((x+2) > y && y > start){
            for(int i = y-1;i >= start+1;i--){
                a[i][start] = num++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] a = new int[n][m];
            int start = 0;
            while(start*2 < n && start*2 < m){
                fun(a,n,m,start);
                start++;
            }
            System.out.println(a[r-1][c-1]);
        }
    }
}
