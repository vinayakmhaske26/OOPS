package Inheritance;

class Rectangle1
{
	void show()
	{
		System.out.println("this is rectangle");
	}
}
class Cuboid extends Rectangle1
{
	int length;
	int width;
	int height;
	
	void Cuboid(int length,int width,int height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	void show1()
	{
		System.out.println("area of cuboid is "+2*(this.length*this.width+this.length*this.height+this.height*this.width));
	}
	void show2()
	{
		System.out.println("volume of cuboid is "+(this.length*this.width*this.height));
	}
}  

public class Example6 {

	public static void main(String[] args) {
		
		Cuboid c=new Cuboid();
		
		c.Cuboid(2,3,4);
		c.show();
		c.show1();
		c.show2();

	}

}
