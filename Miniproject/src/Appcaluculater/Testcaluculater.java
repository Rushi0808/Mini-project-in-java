package Appcaluculater;

import java.util.Scanner;

public class Testcaluculater {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println( "**** WELCOME TO SKILLS IT ACADEMY CALCULATER ****");
	
	while(true) {
		System.out.println("\t :1 addition \n "+"\t :2 substraction \n"+"\t :3 multification \n "+"\t :4 division \n");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("Enter choice :");
		int choice=sc.nextInt();
		
		if(choice==1) {
			System.out.println("enter two number :");
			SkillItCaluculater.addtion(sc.nextInt(), sc.nextInt());
			
			
		}else if(choice==2) {
			System.out.println("enter two number :");
			SkillItCaluculater.substraction(sc.nextInt(), sc.nextInt());
			
		}else if (choice==3) {
			System.out.println("enter two number :");
			SkillItCaluculater.multification(sc.nextInt(), sc.nextInt());
			
		}else if (choice==4) {
			System.out.println("enter two number :");
			SkillItCaluculater.division(sc.nextInt(), sc.nextInt());
			
			
		}else if(choice==5) {
			System.out.println("Thanks for ushing Skills it academy calculator :");
			break;
			
		}	
		System.out.println("_____________________________________________________________________________________________");
		
		
		
		
	}
	
	
	
	
	
	
	
}
}
