package Polymorphism;

public class FinalvariableDemo {
	
	// final int a=100;    // final variable declaration and defination.
	
	final int a;  //blank final variable
	{
		a=100;
		System.out.println("instance initiolizer block");
	}

	public static void main(String[] args) {


		FinalvariableDemo f=new FinalvariableDemo();
		System.out.println("the value of a is "+f.a);
		
	}

}
