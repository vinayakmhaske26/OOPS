package classes_objects;

public class Student {

	String fullname;
	int contactnumber;
	String adress;
	String studentid;
	String gender;
	
	public static void main(String[] args) {

		Student s1=new Student();
		s1.fullname="Vinayak";
		s1.contactnumber=123233434;
		s1.adress="pune";
		s1.studentid="STD91";
		s1.gender="M";
		
		System.out.println("Full name is="+s1.fullname);
		System.out.println("Contact number is="+s1.contactnumber);
		System.out.println("adress is ="+s1.adress);
		System.out.println("student id is="+s1.studentid);
		System.out.println("gender is="+s1.gender);
		
	}

}
