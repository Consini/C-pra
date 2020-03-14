import java.util.*;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/3/6 19:35
 **/
public class 每日一题0306_2_大整数排序 {
    private static void fun(String[] strings){
        for (int i = 1; i < strings.length; i++) {
            String k = strings[i];
            int j = i - 1;
            for (; j >= 0 && ((Comparable<String>)strings[j]).compareTo(k) > 0; j--) {
                strings[j + 1] = strings[j];
            }
            strings[j + 1] = k;
        }
        for(int i = 0;i < strings.length;i++){
            System.out.println(strings[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            Map<Integer,List<String>> map = new TreeMap<>();
            for(int i = 0;i < n;i++){
                String s = sc.nextLine();
                List<String> list = new ArrayList<>();
                if(map.containsKey(s.length())){
                    list = map.get(s.length());
                }
                list.add(s);
                map.put(s.length(),list);
            }
            
            for(Map.Entry<Integer,List<String>> entry : map.entrySet()){
                List<String> list = entry.getValue();
                String[] strings1 = new String[list.size()];
                for(int j = 0;j < strings1.length;j++){
                    strings1[j] = list.get(j);
                }
                fun(strings1);
            }

        }
    }
}
