import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int hour = scanner.nextInt();
            int minutes = scanner.nextInt();
            if(hour > 24){
                hour%=24;
            }
            if(minutes>60){
                minutes%=60;
            }
            String[] strings =  {"zero", "one", "two", "three", "four",
                    "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                    "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                    "nineteen", "twenty","thirty","forty","fifty"};
            if(minutes == 0){
                if(hour < 21){
                    System.out.println(strings[hour]+" o'clock");
                }else{
                    System.out.println(strings[20]+" "+strings[hour-20]+" o'clock");
                }
            }else{
                if(hour < 21){
                    System.out.print(strings[hour]+" ");
                }else{
                    System.out.print(strings[20]+" "+strings[hour-20]+" ");
                }
                if(minutes < 21){
                    System.out.println(strings[minutes]);
                }else{
                    int front = minutes/10 - 2;
                    int behind = minutes%10;
                    System.out.println(strings[20+front]+" "+strings[behind]);
                }
            }
        }
    }
}
