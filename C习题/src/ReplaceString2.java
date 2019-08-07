///**
// * @ClassName ReplaceString2
// * @Description:
// * @Author: 寇明珠
// * @Date: 2019/8/5
// * @Time: 14:22
// * @Version 1.0
// **/
//import java.lang.StringBuffer;
//public class ReplaceString2 {
//
//    //
//    public static int spaceNum(StringBuffer s){
//        int count = 0;
//        for(int i = 0;i < s.length();i++){
//            if(s.charAt(i) == ' '){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static String replace(StringBuffer s){
//        int len = s.length();
//        int newLength = spaceNum(s) * 2 + s.length();
//        s.setLength(newLength);
//        while(len != 0){
//            if(s.charAt(len) ==  ' '){
//                len--;
//                s.setCharAt(newLength,'0') ;
//                s.setCharAt();
//            }
//        }
//    }
//    public static void main(String[] args) {
//        String str = "abc defgx yz";
//        System.out.println(str);
//        replace(StringBuffer str);
//        System.out.println(str);
//    }
//}
