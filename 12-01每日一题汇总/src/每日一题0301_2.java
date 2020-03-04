import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/3/3 14:55
 **/
public class 每日一题0301_2 {
    //2010  二千零一拾元   2 0020 两万零二十元
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String money = sc.nextLine();
            String[] jine = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
            String[] danwei = {"元","拾","佰","仟","万","拾","佰","仟","亿"};
            String[] xiaoshu = {"分","角"};
            StringBuffer ret = new StringBuffer("人民币");
            int index = money.lastIndexOf(".");
            int yushu = index % 4;
            int len = (index==-1) ? money.length()-1 : index-1;
            int right = len;
            index = 0;
            while(index <= right){
                int num = Character.digit(money.charAt(index),10);
                if(index != 0 && index == right && num == 0){
                    ret.append(danwei[len]);
                    break;
                }
                ret.append(jine[num]);
                if (num != 0) {
                    ret.append(danwei[len]);
                }
                len--;
                index++;
            }
            if(index == money.length() || money.substring(index,money.length()).equals(".00")
                    || money.substring(index,money.length()).equals(".0")){
                ret.append("整");
            }else {
                index++;
                while (index < money.length()) {
                    int num = Character.digit(money.charAt(index), 10);
                    if(index != money.length()-1 || num != 0) {
                        ret.append(jine[num]);
                    }
                    if (num != 0) {
                        ret.append(xiaoshu[money.length() - index - 1]);
                    }
                    index++;
                }
            }
            System.out.println(ret);
        }
    }
}
