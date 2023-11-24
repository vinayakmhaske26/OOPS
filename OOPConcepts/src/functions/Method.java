package functions;
import java.util.Scanner;
public class Method {
	
	void greet()// function which does not return any value and does not accept any parameter..
	{
		System.out.println("Welcome java");
	}
	
	void getName(String name) // function which does not return any value but accept any parameter..
	{
		System.out.println(name);
	}
	
	int age() // function which returns any value but not accept any parameter...
	{
		int year;
		Scanner sc=new Scanner(System.in);		
		System.out.println("the birth year is");
		year =sc.nextInt();

		return(year);
	}
	
	int area(int l,int b)  // function which returns value and accept parameters...
	{
		return(l*b);
	}

	public static void main(String[] args) {

		Method m=new Method();
		m.greet();
		m.getName("vinayak");
		m.age();
		m.area(10,20);
		
		System.out.println("Area of rectangle is "+m.area(10,20));
	}

}
