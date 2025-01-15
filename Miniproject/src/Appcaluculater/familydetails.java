package Appcaluculater;

public class familydetails {
	String name;
	int age;
	String education;
	long mono;
	String relestion;
	
	 
	public familydetails(String name, int age, String education, long mono, String relestion) {
		
		this.name = name;
		this.age = age;
		this.education = education;
		this.mono  =mono;
		this.relestion = relestion;
		
		
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getEducation() {
		return education;
	}


	public long getMono() {
		return mono;
	}


	public String getRelestion() {
		return relestion;
	}


	
	public String toString() {
		return "familydetails [name=" + name + ", age=" + age + ", education=" + education + ", mono=" + mono
				+ ", relestion=" + relestion + "]";
	}

public void familydetalisdisplay() {
	
}

}