/**
 * @ClassName ReplaceString
 * @Description:
 * @Author: 寇明珠
 * @Date: 2019/8/5
 * @Time: 13:36
 * @Version 1.0
 **/
public class ReplaceString {
    //求字符串中空格个数
    public static int spaceNum(char[] s){
        int count = 0;
        for(int i = 0;i < s.length;i++){
            if(s[i] == ' '){
                count++;
            }
        }
        return count;
    }

    //打印字符串
    public static void print(char[] s){
        for(int i = 0;i < s.length;i++){
            System.out.print(s[i]);
        }
        System.out.println();
    }

    //替换空格
    public static char[] replace(char[] s,char[] d){
        int j = 0;
        for(int i = 0;i < s.length;i++){
            if(s[i] != ' '){
                d[j] = s[i];
                j++;
            }else{
                d[j++] = '%';
                d[j++] = '2';
                d[j++] = '0';
            }
        }
        return d;
    }
    public static void main(String[] args) {
        char[] str = {'a','b','c',' ','d','e','f','g','x',' ','y','z'};
//        char[] str = null;
//        if(str == null){
//            return ;
//        }
        print(str);
        int newLength = str.length + spaceNum(str) * 2;
        char[] result = new char[newLength];
        print(replace(str,result));
    }
}
