import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/26 10:32
 **/
public class 删数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            if(n > 1000){
                n = 999;
            }
            for(int i = 0;i < n;i++){
                list.add(i);
            }
            int index = 0;
            while(list.size() > 1){
                index = (index + 2)%list.size();
                list.remove(index);
            }
            System.out.println(list.get(0));
        }
    }
}
