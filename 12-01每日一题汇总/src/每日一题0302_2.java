import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/3/3 18:09
 **/
public class 每日一题0302_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // while(sc.hasNext()){
            int peopleNum = Integer.parseInt(sc.nextLine());
            Map<String,Integer> map = new LinkedHashMap<>();
            String[] strings = sc.nextLine().split(" ");
            for(int i = 0;i < peopleNum;i++){
                map.put(strings[i],0);
            }
            map.put("Invalid",0);
            peopleNum = Integer.parseInt(sc.nextLine());
            String[] people = sc.nextLine().split(" ");
            for(int i = 0;i < peopleNum;i++){
                if(map.containsKey(people[i])){
                    map.put(people[i],map.get(people[i])+1);
                }else{
                    map.put("Invalid",map.get("Invalid")+1);
                }
            }
            int i = 0;
//            for(Map.Entry<String,Integer> entry : map.entrySet()){
//                System.out.println(entry.getKey()+" : "+entry.getValue());
//            }
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        // }
    }
}
