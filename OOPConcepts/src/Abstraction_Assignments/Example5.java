package Abstraction_Assignments;

abstract class Student
{
	abstract void getMarks();
}
class Student11 extends Student
{
	int num1,num2,num3;
	 void getMarks()
	{
		
	}
	public Student11(int num1,int num2,int num3)
	{
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	void show()
	{
		System.out.println("The addition of the marks are "+(num1+num2+num3));
	}
	
}
class Student22 extends Student
{
	int num1,num2,num3;
	void getMarks()
	{
		
	}
	public Student22(int num1,int num2,int num3)
	{
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	void show()
	{
		System.out.println("The Multiplicatyion of marks is "+(num1*num2*num3));
	}
}

public class Example5 {

	public static void main(String[] args) {

		
		Student11 s1=new Student11(12,23,34);
		Student22 s2=new Student22(12,12,12);
		
		s1.show();
		s2.show();

		
	}

}
