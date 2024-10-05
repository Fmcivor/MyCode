package mycode;

public class Student {
	
	private int studentId;
	private String name;
	private String course;
	private char faculty;
	
	public Student(int id, String sname,String scourse, char fac) {
		this.studentId = id;
		this.name = sname;
		this.course= scourse;
		this.faculty = fac;
		
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCourse() {
		return course;
	}
	
	public char getFaculty() {
		return faculty;
	}
	
	
	public String toString() {
		String data = "Number: " + getStudentId() + "\n";
		
		data+= "Name: " + getName() + "\n";
		data+= "Course: " + getCourse() + "\n";
		data+= "Faculty: " + getFaculty() + "\n";
		
		return data;
	}

}
