/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Date;
/**
 *
 * @author 寇明珠
 */
public class JavaApplication9 {
private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	JavaApplication9(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		//dateCreated.getDate();
		//dateCreated.toGMTString();
	}
	/**
	 * @param uId 用户ID
	 * @param initBalance 初始余额
	 * */
	JavaApplication9(int uId, double initBalance){
		id = uId;
		balance = initBalance;
                dateCreated=new Date();
	}
	public void setId(int newId){
		id = newId;
	}
	public int getId(){
		return id;
	}
	
	public void setBalance(int newBalance){
		balance = newBalance;
	}
	public double getBalance(){
		return balance;
	}
	public void setInterestAnnualRate
      (double newAnnualRate){
		annualInterestRate = newAnnualRate;
	}
	public double getInterestAnnualRate(){
		return annualInterestRate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return balance * annualInterestRate / 100 / 12;
	}
	public void withDraw(double withDrawBalance){
		balance -= withDrawBalance;
	}
	public void deposit(double depositBalance){
		balance += depositBalance;
	}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		JavaApplication9 account1 = new JavaApplication9(1122, 20000);
		account1.setInterestAnnualRate(4.5);
		account1.withDraw(2500);
		account1.deposit(3000);
                System.out.println("The balance of " +account1.getBalance() );
                System.out.println("Month interest is "+account1.getMonthlyInterestRate() );
                System.out.println("Open date is "+account1.getDateCreated());
//		System.out.println(account1.getBalance() + "\n" +
//				account1.getMonthlyInterestRate() + "\n" + 
//				account1.getDateCreated());    // TODO code application logic here
    }  
}

	
