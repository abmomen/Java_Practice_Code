package MinPakage;

import Student.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student=new Student();
		student.setStudentId(1);
		student.setStudentName("Abdul Momen");
		student.setStudentAddress("Alipur, Durgapur ,Rajshahi");
		
		
		System.out.println("Student Id: "+student.getStudentId());
		System.out.println("Student Name: "+student.getStudentName());
		System.out.println("Student Id: "+student.getStudentAddress());

	}

}
