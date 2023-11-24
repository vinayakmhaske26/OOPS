package classes_objects;

public class Doctor {
	
	String name;
	int number;
	String qualification;
	String experiance;
	String id;

	public static void main(String[] args) {

		Doctor d1=new Doctor();
		d1.name="vinayak";
		d1.number=12345678;
		d1.qualification="MBBS";
		d1.experiance="5 years";
		d1.id="DOC 234";
		
		System.out.println("the name of doctor is="+d1.name);
		System.out.println("the number of doctor is="+d1.number);
		System.out.println("the qualification of doctor is="+d1.qualification);
		System.out.println("the exeperiance  of doctor is="+d1.experiance);
		System.out.println("the id of doctor is="+d1.id);
	}

}
