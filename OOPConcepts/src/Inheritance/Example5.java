package Inheritance;

class Circle1
{
	void show()
	{
		System.out.println("this is circlar shape");
	}
}
class Cylinder extends Circle1
{
	void show1()
	{
		System.out.println("this is cylindrical shape");
	}
}

public class Example5 {

	public static void main(String[] args) {

		Cylinder sc=new Cylinder();
		sc.show();
		sc.show1();
	}

}
