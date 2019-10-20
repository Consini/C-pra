import com.sun.prism.shader.AlphaOne_LinearGradient_AlphaTest_Loader;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            String s = input.next();
            String[] array = s.split(" ");
            for(int i = 0;i < array.length;i++){
                set.add(array[i]);
            }
        }
        System.out.println(set.size());
    }
}


















///**
// * @ClassName Main
// * @Author: K
// * @create: 2019/10/20-9:38
// **/
//import javax.sound.midi.Soundbank;
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Set<Integer> set = new TreeSet<>();
//        int a = 0;
//        int b = 1;
//        int c = 1;
//        set.add(a);
//        set.add(b);
//        while(c < 1000000){
//            set.add(c);
//            a = b;
//            b = c;
//            c = a + b;
//        }
//        Scanner input = new Scanner(System.in);
//        int countAdd = 0;
//        int countSub = 0;
//        int n = input.nextInt();
//        int n1 = n;
//        while(!set.contains(n)){
//            countAdd++;
//            n++;
//        }
//        while (!set.contains(n1)){
//            countSub++;
//            n1--;
//        }
//        if(countAdd <= countSub){
//            System.out.println(countAdd);
//        }else{
//            System.out.println(countSub);
//        }
//    }
//}
