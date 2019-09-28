import java.util.Comparator;
import java.util.List;

/**
 * @ClassName Sort
 * @Author: K
 * @create: 2019/9/28-17:09
 **/
public class Sort {
    public static void sort(List<Book> b){
        for(int i = 1;i < b.size();i++){
            Book k = b.get(i);
            int j = i - 1;
            for(; j >= 0 && b.get(j).compareTo(k) > 0;j--){
                b.set(j + 1,b.get(j));
            }
            b.set(j + 1,k);
        }
    }
    public static void sort(List<Book> b,Comparator comparator){
        for(int i = 1;i < b.size();i++){
            Book k = b.get(i);
            int j = i - 1;
            for(; j >= 0 && comparator.compare(b.get(j),k) > 0;j--){
                b.set(j + 1,b.get(j));
            }
            b.set(j + 1,k);
        }
    }
    }
