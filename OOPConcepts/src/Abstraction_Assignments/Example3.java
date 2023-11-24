package Abstraction_Assignments;

import classes_objects.Student;

abstract class Marks
{
	abstract void getpercentage();
}
 class Student1 extends Marks
{
	 float X,Y,Z;
	void getpercentage() 
	{
		
	}
	public Student1(float X,float Y,float Z)
	{
		this.X=X;
		this.Y=Y;
		this.Z=Z;
	}
	void Student1()
	{
		System.out.println("the % of student1 is "+(X+Y+Z)/300*100);
	}
	
}
 class Student2 extends Marks
 {
	 float A,B,C,D;
	void getpercentage() 
	{
		
	}
	 
	public Student2(float A,float B,float C,float D)
	{
		this.A=A;
		this.B=B;
		this.C=C;
		this.D=D;
	}
	
	void Student2()
	{
		System.out.println("the % of student2 is "+(A+B+C+D)/400*100);
	}
 }

public class Example3 {

	public static void main(String[] args) {
	
		Student1 s=new Student1(78,87,67);
		s.Student1();
		Student2 s1=new Student2(89,78,87,78);
		s1.Student2();
		
	}

}
