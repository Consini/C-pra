import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/17 16:35
 **/
public class 空地种草 {
    private static void fun(char[][] c,int i,int j){
        if(j-1 >= 0){
            c[i][j-1] = 'g';
        }
        if(j+1 < c[0].length){
            c[i][j+1] = 'g';
        }
        if(i-1 >= 0){
            c[i-1][j] = 'g';
        }
        if(i+1 < c.length){
            c[i+1][j] = 'g';
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n =sc.nextInt();
            int m = sc.nextInt();
            String[] aTmp = new String[n];
            for(int i = 0;i <n;i++){
                aTmp[i] = sc.next();
            }
            int k = sc.nextInt();
            char[][] ch = new char[n][m];
            for(int i = 0;i < n;i++){
                for(int j = 0;j < m;j++){
                    ch[i][j] = aTmp[i].charAt(j);
                }
            }
            while(k != 0){
                k--;
                char[][] tmp = new char[n][m];
                for(int i = 0;i < n;i++){
                    for(int j = 0;j <m;j++){
                        tmp[i][j] = ch[i][j];
                    }
                }
                for(int i = 0;i < n;i++){
                    for(int j = 0;j < m;j++){
                        if(tmp[i][j] == 'g'){
                            fun(ch,i,j);
                        }
                    }
                }
            }
            for(int i = 0;i < n;i++){
                for(int j = 0;j <m;j++){
                    System.out.print(ch[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
