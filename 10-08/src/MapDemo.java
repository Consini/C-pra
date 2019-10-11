import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName MapDemo
 * @Author: K
 * @create: 2019/10/10-17:38
 **/
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        System.out.println(map.get("老大"));
        System.out.println(map.getOrDefault("老大", "查无此人"));
        String oldValue = map.put("老大", "123456");
        System.out.println(oldValue);
        oldValue = map.put("老大", "9999999");
        System.out.println(oldValue);
        map.put("老二", "1212121");
        map.put("老三", "2222222");
        map.put("老四", "333333");
        System.out.println(map.keySet());
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.values());
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println(map.entrySet());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
        System.out.println(map.containsKey("大大"));
        System.out.println(map.containsKey("老大"));
        System.out.println(map.containsValue("2222222"));
    }
}
