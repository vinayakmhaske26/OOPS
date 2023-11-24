package Polymorphism;


class A1
{
	static void show()
	{
		System.out.println("Parent");
	}
}
class A2 extends A1
{
	static void show()
	{
		A1.show();
		System.out.println("Child");
	}
}
public class function_overriding3 {

	public static void main(String[] args) {
		
		A1 obj=new A2();

		obj.show();

		
	}

}
