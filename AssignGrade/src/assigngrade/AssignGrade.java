package assigngrade;
import java.util.Scanner;
public class AssignGrade {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the number of students:");
       int stu=input.nextInt();
       System.out.print("Enter "+stu+" scores:");
       int []score=new int[stu];
       for(int i=0;i<stu;i++){
           score[i]=input.nextInt();
       }
       int maxgrade=0;
       for(int i=0;i<stu;i++){
           if(score[i]>maxgrade){
               maxgrade=score[i];
           }
       }
       for(int i=0;i<score.length;i++){
           char result=0;
           if(score[i]>=maxgrade-10){ result='A'; }
           else if(score[i]>=maxgrade-20){ result='B'; }
           else if(score[i]>=maxgrade-30){ result='C'; }
             else if(score[i]>=maxgrade-40){ result='D'; }
               else{ result='E'; }
 System.out.println("Student "+i+" score is "+score[i]+" and grade is "+result);
       }
    }    
}
