import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/1 21:12
 **/
public class 最高分是多少 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String[] s1 = scanner.nextLine().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            String[] s2 = scanner.nextLine().split(" ");
            int[] score = new int[n+1];
            for(int i = 1;i < n+1;i++){
                score[i] = Integer.parseInt(s2[i-1]);
            }
            while(m-- != 0){
                String s = scanner.nextLine();
                String[] sTmp = s.split(" ");
                int a = Integer.parseInt(sTmp[1]);
                int b = Integer.parseInt(sTmp[2]);
                if(s.charAt(0) == 'Q'){
                    int max = score[a];
                    for(int j = Math.min(a, b); j <= Math.max(a, b); j++) {
                        max = Math.max(max, score[j]);
                    }
                    System.out.println(max);
                }else {
                    score[a] = b;
                }
            }
        }
    }
}
