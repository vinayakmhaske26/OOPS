package Polymorphism;

public class Finalconstructor {
	
	final int a;
	public Finalconstructor()
	{
		a=100;
		System.out.println("Default Constructor");
	}
	
	public Finalconstructor(String msg)
	{
		a=200;
		System.out.println(msg);
	}
	public static void main(String[] args) {

		Finalconstructor fc=new Finalconstructor();
		System.out.println("the final value of a is "+fc.a);
		
		Finalconstructor fc1=new Finalconstructor("Parameterized Constructor");
		System.out.println("the final value of a is "+fc1.a);
		
	}

}
