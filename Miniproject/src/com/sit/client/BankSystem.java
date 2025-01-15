package com.sit.client;

import java.util.Scanner;

import com.sit.controller.BankAccount;

public class BankSystem {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
		System.out.println("1.Check Balance ");
		System.out.println("2.Deposit Money ");
		System.out.println("3.Withdraw Money ");
		System.out.println("4.Exit ");
		
		System.out.println("Enter your choice:" );
		int choice=sc.nextInt();
		
		 if(choice==1)
		 {
			 BankAccount.checkbalance();
		 }
		 else if(choice==2) {
			 BankAccount.deposite();

			 
		 }
		 else if(choice==3) {
			 BankAccount.withdraw();

			 
		 }
		 else if(choice ==4){
			 System.out.println("Exit");
			 break;
		}
		 else {
			 System.out.println("Invalid Choice");
		 }
		
		}
		
		
	}

}
