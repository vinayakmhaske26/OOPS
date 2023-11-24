package Inheritance;

class Member {
	
	String name;
	int age;
	int phone_number;
	String address;
	double salary;
	
	void SetDetails(String name,int number,int phone_number,String address,double salary)
	{
		this.name=name;
		this.age=age;
		this.address=address;
		this.phone_number=phone_number;
		this.salary=salary;
	}

	void showinfo()
	{
		System.out.println(this.name+"\n"+this.age+"\n"+this.address+"\n"+this.phone_number+"\n"+this.salary); 
	}
}
	class Employee extends Member
	{
		String specialization;
	}
	class Manager extends Member
	{
		String department;
	}
public class Example3 {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.SetDetails("vinayak",21,12345678,"pune",32000);
		e1.showinfo();
		
		Manager m1=new Manager();
		m1.SetDetails("shubham",23,87654321, "pune", 32000);
		m1.showinfo();
		
	}

		
	}


