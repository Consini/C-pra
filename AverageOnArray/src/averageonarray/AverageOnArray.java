package averageonarray;
import java.util.Scanner;
public class AverageOnArray {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.print("输入10个double数据：");
       double []a=new double[10];
       for(int i=0;i<a.length;i++){
           a[i]=input.nextDouble();
       }
       System.out.println(average(a));
    }
    public static int average(int []array){
        int sum=0;
        int av=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        av=sum/array.length;
        return av;
    }
     public static double average(double []array){
         double sum=0;
        double av=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        av=sum/array.length;
        return av;
     }
}
