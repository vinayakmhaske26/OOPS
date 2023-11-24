package Polymorphism;

class A
{
	int i;
	void Printnum(int i) 
	{
		System.out.println("the value of number i is "+i);
	}
	
}
class B extends A
{
	int j;
	void Printnum(int i,int j)
	{
		super.Printnum(i);
		System.out.println("the value of number j is "+j);
	}
}

public class function_overriding2 {

	public static void main(String[] args) {
		
		B o=new B();
		o.Printnum(3,4);
		
	}

}
