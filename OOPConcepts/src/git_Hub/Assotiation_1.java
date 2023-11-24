package git_Hub;


	class Bank{
		
		private String name;
		
		Bank(String name)
		{
			this.name=name;
			
		}
		
		public String getBank()
		{
			return this.name;
		}
	}
	
	class Employee
	{
		private String name;
		
		Employee(String name)
		{
			this.name=name;
		}
		public String getEmployee() 
		{
			return this.name;
		}
	}
	

public class Assotiation_1 {

	public static void main(String[] args) {


		Bank a=new Bank("MAHARASTRA");
		Employee e=new Employee("Rushi");
		System.out.println("The name bank is "+a.getBank()+"\n The Employye name is "+e.getEmployee());
	}

}
