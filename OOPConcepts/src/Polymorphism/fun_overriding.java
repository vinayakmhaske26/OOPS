package Polymorphism;

class Parent111
{
	void show() 
	{
		System.out.print("Parent Class");
	}
}
	class Child111 extends Parent111 
	{
	
	void show()
	{
		super.show();
		System.out.println("\nChild Class");
	}
	}

public class fun_overriding {

	public static void main(String[] args) {
		
		Parent111 obj = new Child111();
		
		obj.show();


		
	}

}