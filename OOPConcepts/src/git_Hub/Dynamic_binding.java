package git_Hub;

public class Dynamic_binding {
	
	public static class Superclass
	{
		void print ()
		{
			System.out.println("The super class");	
		}
	}
	
	public static class Subclass
	{
		void print ()
		{
			System.out.println("The sub class");
		}
	}

	public static void main(String[] args) {
		
		Superclass s=new Superclass();
		
		Subclass s1=new Subclass();
		
		s.print();
		s1.print();
		


		
	}

}
