/**
 * @Description TODO
 * @Author K
 * @Date 2020/2/2 22:45
 **/
public class 压缩字符串 {
    /*输入：["a","b","b","b","b","b","b","b","b","b","b","b","b"]
      输出：返回4，输入数组的前4个字符应该是：["a","b","1","2"]。
      输入：["a","a","b","b","c","c","c"]
      输出：返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]*/
    public static int compress(char[] chars) {
        int i = 0,j = 0,len = 0;
        while(j < chars.length){
            if(chars[i] == chars[j]){
                j++;
            }
            if(j == chars.length || chars[i] != chars[j]){
                int count = j - i;
                chars[len++] = chars[i];
                if(count > 1) {// 出现一次以上才会将次数添加进去
                    int div = 1000;// 确认该字母出现次数的数量级
                    while (count / div == 0) {
                        div /= 10;
                    }
                    while (div > 0) {
                        chars[len++] = (char) (count / div + '0');
                        count = count % div;
                        div /= 10;
                    }
                }
                i = j;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        char[] arr = {'a','a','a','a','a','a','a','a','a','a'};
        System.out.println(compress(arr));
    }
}
