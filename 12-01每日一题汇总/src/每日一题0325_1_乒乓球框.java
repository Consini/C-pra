/**
 * @Description TODO
 * @Author K
 * @Date 2020/3/26 21:05
 **/

import java.util.*;
public class 每日一题0325_1_乒乓球框 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String string = sc.nextLine();
            TreeMap<Character,Integer> aMap = new TreeMap<>();
            TreeMap<Character,Integer> bMap = new TreeMap<>();
            int i = 0;
            while (string.charAt(i) != ' '){
                if(aMap.containsKey(string.charAt(i))){
                    aMap.put(string.charAt(i),aMap.get(string.charAt(i))+1);
                }else{
                    aMap.put(string.charAt(i),1);
                }
                i++;
            }
            i++;
            while(i < string.length()){
                if(bMap.containsKey(string.charAt(i))){
                    bMap.put(string.charAt(i),bMap.get(string.charAt(i))+1);
                }else{
                    bMap.put(string.charAt(i),1);
                }
                i++;
            }
            boolean f = true;
            for(Map.Entry<Character,Integer> entry : bMap.entrySet()){
                char c = entry.getKey();
                int n = entry.getValue();
                if(!aMap.containsKey(c) || aMap.get(c) < n ){
                    f = false;
                    System.out.println("No");
                    break;
                }
            }
            if(f){
                System.out.println("Yes");
            }
        }
    }
}