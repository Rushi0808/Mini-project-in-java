package com.sit.controller;

import java.util.Scanner;

public class BankAccount {
	static double balance =10000;
	
	
	static Scanner sc=new Scanner(System.in);

	public static void checkbalance() {
		
		System.out.println("Balance is:"+balance);
		
		
	}
	static double result;
	public static void deposite() {
		
		System.out.println("Enter your amount which is deposited : ");
		double depoAmount=sc.nextDouble();
		 result=balance+depoAmount;
		System.out.println("After deposited balance: "+result);
		}

	public static void withdraw() {
		
		System.out.println("Enetr your amount which is withdraw : ");
		double withAmount=sc.nextDouble();
		
		System.out.println("After withdraw balance :"+(result-withAmount));
		
		
	}
	

}
