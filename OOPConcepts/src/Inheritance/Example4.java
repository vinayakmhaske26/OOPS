package Inheritance;

class Shape1
{
	void show()
	{
		System.out.println("this is shape");
	}
}
class Rectangle11 extends Shape1
{
	void showrect()
	{
		System.out.println("this is rectangular shape");
	}
}
class Circle11
{
	void showcircle()
	{
		System.out.println("this is circular shape");
	}
}
class Square1 extends Rectangle
{
	void squarerect()
	{
		System.out.println("the square is a rectangle");
	}
}

public class Example4 {

	public static void main(String[] args) {
	
		Square1 s=new Square1();
		s.show();
		s.showrect();
		s.squarerect();
		
	}

}
