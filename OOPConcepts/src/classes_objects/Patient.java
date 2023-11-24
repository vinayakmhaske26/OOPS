package classes_objects;

public class Patient {

	String patientname;
	String patientid;
	String disease;
	int age;
	String gender;
	
	
	public static void main(String[] args) {

		Patient p1=new Patient();
		p1.patientname="Prathamesh";
		p1.patientid="PS1234";
		p1.disease="Omitting";
		p1.age=1234;
		p1.gender="M";
		
		System.out.println("the patient name is ="+p1.patientname);
		System.out.println("the patient id is ="+p1.patientid);
		System.out.println("the patient disease is ="+p1.disease);
		System.out.println("the patient age is ="+p1.age);
		System.out.println("the patient gender is ="+p1.gender);

		
	}

}
