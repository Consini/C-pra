import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MapDemo
 * @Author: K
 * @create: 2019/9/8-10:47
 **/
/*      V get(Object k) 根据指定的 k 查找对应的 v
        V getOrDefault(Object k, V defaultValue) 根据指定的 k 查找对应的 v，没有找到用默认值代替
        V put(K key, V value) 将指定的 k-v 放入 Map
        boolean containsKey(Object key) 判断是否包含 key
        boolean containsValue(Object value) 判断是否包含 value
        Set<Map.Entry<K, V>> entrySet() 将所有键值对返回
        boolean isEmpty() 判断是否为空
        int size() 返回键值对的数量*/
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者","佚名"));
        System.out.println(map.containsKey("作者"));
        System.out.println(map);
        map.put("作者","鲁迅");
        map.put("时间","1234");
        map.put("书名","狂人日记");
        System.out.println(map.entrySet());
        System.out.println(map.containsKey("作者"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        for(Map.Entry<String,String> e : map.entrySet()){
            System.out.println(e);
        }
        System.out.println("======");
        for(Map.Entry<String,String> e : map.entrySet()){
            System.out.println(e.getKey() + "是" + e.getValue());
        }
    }
}
