package Reationship;

import java.util.Scanner;





public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student[]arr=new Student[10];
		int index=0;
		
		
		arr[index++]=new Student("rushi", 11, 71, new adharcard(999999), new adrees("maharastra","ambad"));
		arr[index++]=new Student("om", 12, 72, new adharcard(8888888), new adrees("maharastra",""));
		arr[index++]=new Student("jay", 13, 73, new adharcard(77777777), new adrees("maharastra","ambad"));
		arr[index++]=new Student("harry", 14, 74, new adharcard(66666666), new adrees("maharastra","ambad"));
		
		
	

		while(true) {
			System.out.println("****** Wel come ********");
			System.out.println("\t 1:add student ");
			System.out.println("\t 2 :Show  all student details ");
			System.out.println("\t 2: Exit");
			
			System.out.println("choose an option ===>");
			
			int choice =sc.nextInt();
			

			if (choice==1) {
				System.out.println("enter student id");
				int idcheck=sc.nextInt();
				boolean idexists=false;
				
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]!=null)
					{
						if(arr[i].getId()==idcheck)
						{
							idexists=true;
							System.out.println("ID Already Exists");
							break;
						}
					}
				}
			if(!idexists) {
				System.out.println("enter student details like--> name,marks,adharcardnumber,address city name, state");
				if(index<arr.length) {
				
					
				
					String name=sc.next();
					int marks=sc.nextInt();
					int adharnumber=sc.nextInt();
					String cityname=sc.next();
					String state=sc.next();
					
					arr[index++]=new Student(name,marks,adharnumber, new adharcard(adharnumber),new adrees( cityname, state));
					
					
					
				    System.out.println(" Student added succsesfully Done.........");
				    
				}
				else {
					System.out.println("Array is full cannot add new student");
				}
				}
			
             }else if(choice==2) {
	     System.out.println("display all student");
	     
	      for(Student aa :arr ) {
		  if(aa !=null) {
			  System.out.println("Student id :"+aa.getId());
			  System.out.println("Student name :"+aa.getname());
			  System.out.println("student marks :"+aa.getmarks());
			  System.out.println("Student addhar number :"+aa.getAdhar().getAdharcardnumber());
			  System.out.println("Student address :"+aa.getAdd().getCityname());
			  System.out.println(aa.getAdd().getState());
			  
			  
		}
	}
             }
		}
	}
}
			
		
