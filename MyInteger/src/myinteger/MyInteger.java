/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinteger;

/**
 *
 * @author 寇明珠
 */
public class MyInteger {
int value ;
     String valuel;
     public MyInteger(int value){
         this.value = value;
     }
     public MyInteger(String valuel){
         this.valuel = valuel;
     }
    public int getValue(){
         return value;
     }
    public boolean isEven(){
         return value % 2 == 0 ? true : false;
     }
     public boolean isOdd(){
         return value % 2 != 0 ? true : false;
     }
     public boolean isPrime(){
         for(int i = 2 ; i < value / 2 ; i++)
             if(value % i == 0)
                 return false;
         return true;
     }
     public boolean isEven(int value){
         this.value = value;
         return value % 2 == 0 ? true : false;
     }
     public boolean isOdd(int value){
         this.value = value;
         return value % 2 != 0 ? true : false;
     }
     public boolean isprime(int value){
         this.value = value;
         for(int i = 2 ; i < value / 2  ; i ++)
             if(value % 2 == 0)
                 return false;
         return true;
     }
     public boolean isEven(MyInteger value){
         return value.isEven();
     }
     public boolean isOdd(MyInteger value){
         return value.isOdd();
     }
     public boolean isprime(MyInteger value){
         return value.isPrime();
     }
     public boolean equals(int value){
         return this.value == value;
     }
     public boolean equals(MyInteger value){
         return value.equals(this.value);
     }
     public int parseInt(char[] cs){
         String s = new String(cs);
         return parseInt(s);
     }
     public int parseInt(String s){
         return Integer.valueOf(s);
     }
    public static void main(String[] args) {
        MyInteger m1 = new MyInteger(11);
        System.out.println("是偶数吗 ？" + m1.isEven() + "\n 是奇数吗 ？ " + m1.isOdd() + "\n 是素数吗 ？" + m1.isPrime());
        System.out.println("是偶数吗 ？" + m1.isEven(11) + "\n 是奇数吗 ？" + m1.isOdd(11) + "\n 是素数吗 ？" + m1.isprime(11));
        System.out.println("是偶数吗 ？" + m1.isEven(12) + "\n 是奇数吗 ？" + m1.isOdd(12) + "\n 是素数吗 ？" + m1.isprime(12));
        System.out.println("是否相等 ？ " + m1.equals(11) + "\n是否相等  ？" + m1.equals(12));
        System.out.println("\n" + m1.parseInt("129"));
        System.out.println("\n" + m1.parseInt("459"));
        System.out.println("\n" + Integer.parseInt("459")); 
    }
    
}
