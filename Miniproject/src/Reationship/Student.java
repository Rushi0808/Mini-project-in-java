package Reationship;

public class Student {
	private String name;
	private int id;
	private int marks;
	private adharcard adhar;
	private adrees add;
	
	
	public Student(String name, int id, int marks, adharcard adhar, adrees add) {
	
	
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.adhar = adhar;
		this.add = add;
	}
	
	
	public String getname() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getmarks() {
		return marks;
	}
	public adharcard getAdhar() {
		return adhar;
	}
	public void setStudent(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setmarks(int marks) {
		this.marks = marks;
	}
	public void setAdhar(adharcard adhar) {
		this.adhar = adhar;
	}
	public adrees getAdd() {
		return add;
	}
	public void setAdd(adrees add) {
		this.add = add;
	}

	
	void displayditails() {
		System.out.println("Student id :"+id);
		  System.out.println("Student name :"+name);
		  System.out.println("student marks :"+marks);
		  System.out.println("Student addhar number :"+adhar);
		  System.out.println("Student address :"+add);
		
		  
	}
	

}
