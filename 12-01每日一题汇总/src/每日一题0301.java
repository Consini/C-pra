/**
 * @Description TODO
 * @Author K
 * @Date 2020/3/3 14:46
 **/
import java.util.*;
public class 每日一题0301{
    private static double fun(int n){
        double ret = 0;
        if(n >= 90){
            ret = 4;
        }else if(n >= 85){
            ret = 3.7;
        }else if(n >= 82){
            ret = 3.3;
        }else if(n >= 78){
            ret = 3.0;
        }else if(n >= 75){
            ret = 2.7;
        }else if(n >= 72){
            ret = 2.3;
        }else if(n >= 68){
            ret = 2.0;
        }else if(n >= 64){
            ret = 1.5;
        }else if(n >= 60){
            ret = 1.0;
        }else{
            ret = 0;
        }
        return ret;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int courseNum = sc.nextInt();
            int[] xuefen = new int[courseNum];
            int zongfen = 0;
            for(int i = 0;i < courseNum;i++){
                xuefen[i] = sc.nextInt();
                zongfen += xuefen[i];
            }
            double ret = 0;
            for(int i = 0;i < courseNum;i++){
                double num = xuefen[i] * fun(sc.nextInt());
                ret += num;
            }
            ret = ret / zongfen;
            System.out.printf("%.2f\n",ret);
        }
    }
}
