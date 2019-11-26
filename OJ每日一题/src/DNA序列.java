import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/25 16:42
 **/
public class DNA序列 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while ((sc.hasNext())) {
                String s = sc.nextLine();
                int n = sc.nextInt();
                int count = 0;
                int[] max = new int[s.length() - n + 1];
                for(int i = 0;i <= s.length() - n;i++){
                    count = 0;
                    for(int j = i ;j <= i + n - 1;j++){
                        char c = s.charAt(j);
                        if(c == 'C' || c == 'G'){
                            count++;
                        }
                    }
                    max[i] = count;
                }
                int maxIndex = 0;
                for(int i = 0;i < max.length;i++){
                    if(max[i] > max[maxIndex]){
                        maxIndex = i;
                    }
                }
                System.out.println(s.substring(maxIndex,maxIndex+n));
            }
        }
}
