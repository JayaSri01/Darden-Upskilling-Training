package basicPrograms;

import java.util.Scanner;

public class BankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to the bank of RBI");
	
		long balance=800;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Pin number");
		int i=0;
		int pin=obj.nextInt();
	
		if(pin==12345){
		System.out.println("Please enter Your option");
		System.out.println("1.Withdraw \t 2.balance Inquiry 3. deposite \t ");
		int num=obj.nextInt();
		switch(num) {
		case 1:  
			System.out.println("Your bank number 80908987868");
			System.out.println("Enter the amount you want to withdraw");
			long withdraw=obj.nextInt();
			long remainbalance;
			remainbalance=balance-withdraw;
			System.out.println("withdraw is successful your balance is "+remainbalance);
			break;
			
		case 2:
			System.out.println("Your bank number 80908987868");
			System.out.println(+balance+" is your balance");
			break;
			
		case 3:
			System.out.println("Your bank number 80908987868");
			System.out.println("Enter the amount you want to deposite");
			long deposite=obj.nextInt();
			long remainingbalance;
			remainingbalance=balance+deposite;
			System.out.println("Deposite is Sucessfull the balances is " +remainingbalance);
			break;
		
		}
		}
		else {
		System.out.println("your entered a wrong pin");
		}
		

	}

}
