package studenthosteldetails;

public class name {

	int studentid;
	String studentname;
	int studentroomno;
	long studentmono;
	String studentstream;
	
	
	public name(int studentid, String studentname, int studentroomno, long studentmono , String studentstream) {
		
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentroomno = studentroomno;
		this.studentmono = studentmono;
		this.studentstream = studentstream;
	
	}


	public int getStudentid() {
		return studentid;
	}


	public String getStudentname() {
		return studentname;
	}


	public int getStudentroomno() {
		return studentroomno;
	}


	public long getStudentmono() {
		return studentmono;
	}


	public String getStream() {
		return studentstream;
	}

public String toString() {
	return "studentid"+studentid+"studentname"+studentname+"studentroomno"+studentroomno+"studentmono"+studentmono+"studentstrem"+studentstream;
	
}
public name() {
	
}
	
	
	
}
