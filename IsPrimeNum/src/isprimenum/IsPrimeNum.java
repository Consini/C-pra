package isprimenum;
public class IsPrimeNum {
    public static void main(String[] args) {
       int count=0;
       for(int i=0;i<=10000;i++){
           if(isPrime(i)){
               count++;
           }
       }
       System.out.println(count);
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i+=2 ){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
