package Interface_Assignments;

interface multiple {
	
	 void display(); // public , static , default , private allows..................
}

class class1 implements multiple {

			// member function are public , static , private , default
	
	
	@Override
	public void display() {

		System.out.println("this is class 1");
	}

}

class class2 implements multiple
{

	@Override
	public void display() {


		System.out.println("this is class 2");
	}
	
}

class class3 implements multiple
{

	@Override
	public void display() {


		System.out.println("this is class 3");
	}
	
}

public class Multiple_method {

	public static void main(String[] args) {


		class1 c1=new class1();
		class2 c2=new class2();
		class3 c3=new class3();
		
		c1.display();
		c2.display();
		c3.display();
	}

}
