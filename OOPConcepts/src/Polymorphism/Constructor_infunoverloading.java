package Polymorphism;

class Shape1
{
	int length,breadth,side;float height;float radius;

public Shape1(int length,int breadth)
{
	this.length=length;
	this.breadth=breadth;
}
public Shape1(int side)
{
    this.side=side;
}
public Shape1(float radius)
{
	this.radius=radius;
}
void calculateArea()
{
	int area=this.length*this.breadth;
	System.out.println("the Area of rectangle is "+area);
}
void calculateAreaofSquare()
{
	int areasq=this.side*this.side;
	System.out.println("the Area of Square is "+areasq);
}
void calculateAreaofCircle()
{
	float AreaCircle=3.14f*this.radius;
	System.out.println("the area of circle is "+AreaCircle);
}

}
public class Constructor_infunoverloading {

	public static void main(String[] args) {

		Shape1 s=new Shape1(4,5);
		Shape1 s1=new Shape1(8);
		Shape1 s2=new Shape1(3.23f);
		s.calculateArea();
		s1.calculateAreaofSquare();
		s2.calculateAreaofCircle();
		
	}

}
