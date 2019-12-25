import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/25 20:53
 **/
public class 翻转单词列 {
    //“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
    // 正确的句子应该是“I am a student.”。
    public static String ReverseSentence(String str) {
        if(str == null){ return null;}
        if(str.trim().equals("")){//去掉首尾空格后依旧是空格，表示该字符串全是空格
            return str;
        }
        String[] strings = str.split(" ");
        StringBuilder s = new StringBuilder();
        for(int i = strings.length-1;i >= 0;i--){
            s.append(i==0?strings[i]:strings[i]+" ");
        }
        return s.toString();
    }
    public static void main(String[] args) {
        System.out.println(ReverseSentence("  "));
        List<Integer> list = new ArrayList<>();
        list.size();
    }
}
