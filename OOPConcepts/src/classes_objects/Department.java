package classes_objects;

public class Department {
	String name;
	String id;
	String location;
	String facilities;
	int number;

	public static void main(String[] args) {

		Department d1=new Department();
		d1.name="technical";
		d1.id="DEP123";
		d1.location="Pune";
		d1.facilities="good";
		d1.number=1234555;
		
		System.out.println("the name of department is="+d1.name);
		System.out.println("the name of id is="+d1.id);
		System.out.println("the name of location is="+d1.location);
		System.out.println("the name of facilities is="+d1.facilities);
		System.out.println("the name of number is="+d1.number);
		
	}

}
