package classes_objects;

public class Employee {

	String name;
	String id;
	float salary;
	String work;
	String exeperiance;
	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		e1.name="Akshay";
		e1.id="EMP0101";
		e1.salary=12354.34f;
		e1.work="technical";
		e1.exeperiance="fresher";
		
		System.out.println("employee name is="+e1.name);
		System.out.println("employee id is="+e1.id);
		System.out.println("employee salary is="+e1.salary);
		System.out.println("employee work is="+e1.work);
		System.out.println("employee exeperiance is="+e1.exeperiance);

		
	}

}
