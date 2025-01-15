package studenthosteldetails;

import java.util.Scanner;

public class Textstudentdetails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		name[] stu = new name[10];
		int index=0;
		
		stu[index++]=new name(1,"rushi",101,9325456048l,"b tech");
		stu[index++]=new name(2,"om",101,9325456447l,"bsc");
		stu[index++]=new name(3,"nitin",102,9874653427l,"b com");
		stu[index++]=new name(4,"harry",103,8736547893l," b pharm");
		stu[index++]=new name(5,"shiv",104,9876543567l,"m com");
		
		while(true) {
			System.out.println("****** Wel come to boys hostel ******");
			System.out.println("\t 1:  fill the addmistion form boys hostel ");
			System.out.println("\t 2: Display all student");
			System.out.println("\t 3: find student by id");
			System.out.println("\t 4: find student by roomno");
			System.out.println("\t 5:  Exits");
			System.out.println("-------------------------------------------------------");
			
			System.out.println("choose an option ===>");
			
			int choice =sc.nextInt();
			
			if (choice==1) {
				System.out.println("enter student id");
				int idcheck=sc.nextInt();
				boolean idexists=false;
				
				for(int i=0;i<stu.length;i++)
				{
					if(stu[i]!=null)
					{
						if(stu[i].studentid==idcheck)
						{
							idexists=true;
							System.out.println("ID Already Exists");
							break;
						}
					}
				}
			if(!idexists) {
				System.out.println("enter student details like--> name,roomno,mono,stream");
				if(index<stu.length) {
				
					stu[index++]=new name(idcheck,sc.next(),sc.nextInt(),sc.nextLong(),sc.next());
				    System.out.println(" addmission succsesfully Done.........");
				    
				}
				else {
					System.out.println("Array is full cannot add new student");
				}
				}
			}else if(choice==2) {
				System.out.println("display all student");
				for(name aa : stu) {
					if(aa !=null) {
						System.out.println(" enter student id :"+aa.studentid);
						System.out.println(" enter student name :"+aa.studentname);
						System.out.println(" enter student roomno :"+aa.studentroomno);
						System.out.println("enter student mono :"+aa.studentmono);
						System.out.println("enter student stream :"+aa.studentstream);
						System.out.println("  Exits");
						System.out.println("-------------------------------------------------------");
						
						
					}
				}
			}else if(choice==3) {
				System.out.println("find student by id");
				int studentid=sc.nextInt();
				boolean found =true;
				System.out.println("enter student id");
				for(name aa: stu) {
					if(aa!=null && aa.studentid==studentid) {
						System.out.println(" enter student id  :"+aa.studentid);
						System.out.println(" enter student name :"+aa.studentname);
						System.out.println(" enter student roomno :"+aa.studentroomno);
						System.out.println("enter student mono :"+aa.studentmono);
						System.out.println("enter student stream :"+aa.studentstream);
						System.out.println("  Exits");
						System.out.println("-------------------------------------------------------");
						
					}
					if(!found) {
						System.out.println("id not found");
					}
					
				}
			}
				else if(choice==4) {
					System.out.println(" find student by roomno");
					int studentroomno=sc.nextInt();
					boolean found=true;
					System.out.println("enter student roomno");
					for(name aa:stu) {
						if(aa !=null && aa.studentroomno==studentroomno) {
							System.out.println(" enter student id :"+aa.studentid);
							System.out.println(" enter student name :"+aa.studentname);
							System.out.println(" enter student roomno :"+aa.studentroomno);
							System.out.println("enter student mono :"+aa.studentmono);
							System.out.println("enter student stream :"+aa.studentstream);
							System.out.println("  Exits");
							System.out.println("-------------------------------------------------------");
							
						}
						if(!found) {
							System.out.println("id not found");
						}
						}
				}else if (choice == 6) {
						System.out.println("Exits ");
						break;
					}
					
				}
			}
			
			
			
			
		}
		
		
		
		
		
		
		
	


