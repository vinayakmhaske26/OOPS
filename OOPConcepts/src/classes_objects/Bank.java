package classes_objects;

public class Bank {
	
	String name;
	String id;
	String branch;
	String place;
	int employee;

	public static void main(String[] args) {
		
		Bank a1 = new Bank();
		a1.name="Bank of Maharastra";
		a1.id="MB101";
		a1.branch="pune";
		a1.place="shivaji nagar";
		a1.employee=32;
		
		System.out.println("the name of bank is="+a1.name);
		System.out.println("the id of bank is="+a1.id);
		System.out.println("the branch of bank is="+a1.branch);
		System.out.println("the place of bank is="+a1.place);
		System.out.println("the employee of bank is="+a1.employee);

		
	}

}
