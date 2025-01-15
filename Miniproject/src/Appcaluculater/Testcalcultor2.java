package Appcaluculater;

import java.util.Scanner;

public class Testcalcultor2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("**** WELCOME TO SKILLS IT ACADEMY CALCULATER ****");

		while (true) {
			System.out.println("\t :1 add \n " + "\t :2 sub \n" + "\t :3 mul\n " + "\t :4 div \n");
			System.out.println(
					"----------------------------------------------------------------------------------------");
			System.out.println("Enter choice :");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.println("enter two number :");

				calucultor2.add(sc.nextInt(), sc.nextInt());

			} else if (num == 2) {
				System.out.println("enter two number :");
				calucultor2.sub(sc.nextInt(), sc.nextInt());

			} else if (num == 3) {
				System.out.println("enter two number :");
				calucultor2.mul(sc.nextInt(), sc.nextInt());

			} else if (num == 4) {
				System.out.println("enter two number :");
				calucultor2.div(sc.nextInt(), sc.nextInt());

			} else if (num == 5) {
				System.out.println("Thanks for ushing Skills it academy calculator :");
				break;

			}

			System.out.println(
					"_____________________________________________________________________________________________");

		}
	}
}
		
		
		
		