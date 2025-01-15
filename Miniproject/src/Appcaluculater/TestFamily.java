package Appcaluculater;

import java.util.Scanner;

public class TestFamily {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		familydetails[] family = new familydetails[10];
		int index = 0;

		family[index++] = new familydetails("tulshiram jadhav", 80, "NA", 9876543456l, "Grandfather");
		family[index++] = new familydetails("mahadev jadhav", 50, "10", 98767353456l, "big uncal");
		family[index++] = new familydetails("jagannath jadhav", 44, "b.ed", 9284841359l, "father");
		family[index++] = new familydetails("jyoti  jadhav", 40, "12", 92848413234l, "mather");
		family[index++] = new familydetails("dadasaheb jadhav", 41, "10", 8284822359l, "Uncal");
		family[index++] = new familydetails("pruthvi jadhav", 20, "bsc", 8284822359l, "brother");

		while (true) {
			System.out.println("**** WELCOME TO May Jadhav patil family details ****");
			System.out.println("\t :1 add family details.... ");
			System.out.println("\t :2 display all family details");
			System.out.println("\t :3 find family details name");
			System.out.println("\t :4 find family details relestion");
			System.out.println("\t :5 find fimily details education");
			System.out.println("\t :6 Exits");
			System.out.println(
					"----------------------------------------------------------------------------------------");
			System.out.println("Enter choice :");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.println("add family details");

				family[index++] = new familydetails(sc.next(), sc.nextInt(), sc.next(), sc.nextLong(), sc.next());
				System.out.println("added details sucssesfull........");
			}

			else if (choice == 2) {
				System.out.println("display all family details");
				for (familydetails aa : family) {
					if (aa != null) {
						System.out.println("enter name :" + aa.name);
						System.out.println("enter age :" + aa.age);
						System.out.println("enter education :" + aa.education);
						System.out.println("enter mono :" + aa.mono);
						System.out.println("enter releation :" + aa.relestion);
						System.out.println("--------------------------------------------");
					}
				}
			}
			 else if (choice == 3) {
				System.out.println("find family details name");
				String familyname = sc.next();
				for (familydetails aa : family) {
					if (aa != null && aa.name.equalsIgnoreCase(familyname)){
						System.out.println("enter name :" + aa.name);
						System.out.println("enter age :" + aa.age);
						System.out.println("enter education :" + aa.education);
						System.out.println("enter mono :" + aa.mono);
						System.out.println("enter releation :" + aa.relestion);
						System.out.println("------------------------------------------");
					}
				}
			} else if (choice == 4) {
				System.out.println("find family details relestion");
				String familyreletion = sc.next();
				for (familydetails aa : family) {
					if (aa != null && aa.relestion.equalsIgnoreCase(familyreletion)) {
						System.out.println("enter name :" + aa.name);
						System.out.println("enter age :" + aa.age);
						System.out.println("enter education :" + aa.education);
						System.out.println("enter mono :" + aa.mono);
						System.out.println("enter releation :" + aa.relestion);
					    System.out.println("--------------------------------------");
					}
				}

			} else if (choice == 5) {
				System.out.println("find family details education");
				String familyeducation = sc.next();
				for (familydetails aa : family) {
					if (aa != null && aa.education.equalsIgnoreCase(familyeducation)) {
						System.out.println("enter name :" + aa.name);
						System.out.println("enter age :" + aa.age);
						System.out.println("enter education :" + aa.education);
						System.out.println("enter mono :" + aa.mono);
						System.out.println("-----------------------------------------------");
					}
				}
			} else if (choice == 6) {
				System.out.println("Exits");
			}
		}
	}

}
	
		
