package Inheritance;

class Parent
{
	void showparent()
	{
		System.out.println("this is parent class");
	}
	void showchild()
	{
		System.out.println("this is child class");
	}
	
}
class Child 
{
	void showchild()
	{
		System.out.println("this is child class");
	}
}

public class Example1 {

	public static void main(String[] args) {

		Parent p=new  Parent();
		Child c=new Child();
		p.showparent();
		c.showchild();
		p.showchild();

	}

}
