package com.calculator.tester;


	
	import java.util.Scanner;
    import com.calculator.app.calculator;
    import static com.calculator.app.calculator.addtion;
    import static com.calculator.app.calculator.substraction;
    import static com.calculator.app.calculator.multification;
    import static com.calculator.app.calculator.division;
    

    public class tester {
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
				addtion(sc.nextInt(), sc.nextInt());
				
				
				
			}else if(choice==2) {
				System.out.println("enter two number :");
				substraction(sc.nextInt(), sc.nextInt());
				
			}else if (choice==3) {
				System.out.println("enter two number :");
				multification(sc.nextInt(), sc.nextInt());
				
			}else if (choice==4) {
				System.out.println("enter two number :");
				division(sc.nextInt(), sc.nextInt());
				
				
			}else if(choice==5) {
				System.out.println("Thanks for ushing Skills it academy calculator :");
				break;
				
			}	
			System.out.println("_____________________________________________________________________________________________");
			
			
			
}
	}
    }
		
		