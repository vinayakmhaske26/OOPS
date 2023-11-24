package Abstraction_Assignments;

abstract class Parent
{
	void massage()
	{
		System.out.println("this is the parent class");
	}
}
class A extends Parent
{
	void massage()
	{
		System.out.println("this is the first subclass");
	}
}
class B extends Parent
{
	void massage()
	{
		System.out.println("this is the second subclass");
	}
}
class C extends Parent
{
	void message()
	{
		System.out.println("This is the third sub class");
	}
}

public class Example1 {

	public static void main(String[] args) {

		A aa=new A();
		aa.massage();
		
		B bb=new B();
		bb.massage();
		
		C cc=new C();
		cc.massage();
		

		
	}

}
