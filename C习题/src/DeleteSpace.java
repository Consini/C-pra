import java.util.concurrent.RecursiveTask;

/**
 * @ClassName DeleteSpace
 * 删除字符串首位空格，中间空格只留一个
 * @Author: K
 * @create: 2019/8/20-20:34
 **/
public class DeleteSpace {
    /*delete1 : 这是我自己想这个问题是刚开始的思路以及代码，解决问题的同时也暴露出我思路上的问题。虽然比较麻烦，但还是保留下来。
    *不用tirm（）方法，去除前后空格
    *再处理中间字符串：若该字符不为空格，直接存入 ret 中
    *若该字符的下一个字符是空格，先存入空格，保证中间有一个空格。
    * 令指针指向该空格，指针向后移找到下一个不为空格的字符。
    * 需要注意的是遍历字符串时已经设置了 i++，在找到下一个不为空格的字符后，若直接继续循环，会使 i 指向该字符的下一个，
    * 所以在找到不为空格的字符后让指针先往后移动一个，避免因为指针增加失误导致结果错误
    * 因为为了避免溢出问题，遍历的结束条件是遍历到倒数第二个字符，当退出循环时指针指向最后一个字符，
    * 因为该字符串已经首尾没有空格，所以直接将最后一个字符存入 ret 中
    */
    public static String delete1(String s){
        int i = 0;
        int j = s.length() - 1 ;
        while(s.charAt(i) == ' '){//找到第一个不为空格字符的位置
            i++;
        }
        while(s.charAt(j) == ' '){//找到最后一个不为空格的位置
            j--;
        }
        s = s.substring(i,j + 1);//substring（int beginIndex, int endIndex）方法：返回一个字符串，该字符串是此字符串的子字符串。
                                 //返回从beginIndex到endIndex的内容，但是endIndex不包含在内，所以要加 1
        StringBuilder ret = new StringBuilder();
        i = 0;
        for(i = 0;i < s.length() - 1;i++){
            if(s.charAt(i) != ' '){
                ret.append(s.charAt(i));
            }
            if(s.charAt(i + 1) == ' '){
//                ret.append(' ');
//                i = i + 1;
                ret.append(s.charAt(++i));
                while(s.charAt(i) == ' '){
                    i++;
                }
                i--;
            }
        }
        ret.append(s.charAt(i));
        return ret.toString();
    }

    public static String delete2(String s){
        s = s.trim();//s.trim()方法的作用是去除首尾空格
        StringBuilder ret = new StringBuilder();
        int i = 0;
        for( i = 0;i < s.length() - 1;i++){
            if(s.charAt(i) != ' '){
                ret.append(s.charAt(i));
            }
            if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' '){
                ret.append(s.charAt(i));
            }
        }
        ret.append(s.charAt(i));
        return ret.toString();
    }
    public static void main(String[] args) {
        String s = "  add dwq wd       fed    j       ";
        System.out.println(delete1(s));
        System.out.println(delete2(s));
    }
}
