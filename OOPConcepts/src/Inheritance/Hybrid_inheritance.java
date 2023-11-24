package Inheritance;

class Shape
{
	void show()
	{
		System.out.println("this is shape");
	}
}
class Rectangle extends Shape
{
	void showrect()
	{
		System.out.println("this is rectangular shape");
	}
}
class Circle extends Shape
{
	void showcircle()
	{
		System.out.println("this is circular shape");
	}
}
class Square extends Rectangle
{
	void showrectsquare()
	{
		System.out.println("Square is a rectangle");
	}
}

public class Hybrid_inheritance {

	public static void main(String[] args) {
		
		Square sc=new Square();
		sc.show();
		sc.showrect();
		sc.showrectsquare();
		Rectangle rc=new Rectangle();
		rc.showrect();
	}

}
