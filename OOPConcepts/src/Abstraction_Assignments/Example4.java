package Abstraction_Assignments;

abstract class Type
{
	abstract void show();
}
class Rectangle extends Type
{
	void show()
	{
		System.out.println("This is a rectangular shape");
	}
}
class Square extends Type
{
	void show()
	{
		System.out.println("This is a square shape");
	}
}
class Circle extends Type
{
	void show()
	{
		System.out.println("This is the circular shape");
	}
}

public class Example4 {

	public static void main(String[] args) {
	
		Rectangle s=new Rectangle();
		Square s1 =new Square();
		Circle s3=new Circle();
		
		s.show();
		s1.show();
		s3.show();
	}

}
