import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/16 8:43
 **/
public class 最近的斐波那契数 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        set.add(0);
        set.add(1);
        set.add(2);
        int a = 1,b = 2,c = 3;
        while(set.size() < 30){
            set.add(c);
            a = b;
            b = c;
            c = a+b;
        }
        int left = 0,right = 0,tmp = num;
        while(!set.contains(tmp)){
            tmp--;
            left++;
        }
        while(!set.contains(num)){
            num++;
            right++;
        }
        if(left < right){
            right = left;
        }
        System.out.println(right);
    }
}
