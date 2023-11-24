package Inheritance;

class Rectangle_
{
	int length, breadth;
	
	public Rectangle_(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
    void RectArea()
    {
    	System.out.println("the area of rectangle is "+(this.length*this.breadth));
    }
    void Rectperi()
    {
    	System.out.println("the perimeter of rectangle is "+2*(this.length+this.breadth));
    }
}

class Square_ extends Rectangle_
{
	int side;
	
	public Square_(int length,int breadth,int side)
	{
		super(length,breadth);
		this.side=side;
	}
	void SquareArea()
	{
		System.out.println("the area of square is "+(this.side*this.side));
	}
	void SquarePeri()
	{
		System.out.println("the perimeter of square is "+(4*(this.side)));
	}
	
}

public class Example2 {

	public static void main(String[] args) {

		Square_ s1=new Square_(2,3,5);
		s1.RectArea();
		s1.Rectperi();
		s1.SquareArea();
		s1.SquarePeri();
		
	}

}
