package Interface_Assignments;

interface Simple
{
	void show();
}

class Simple1 implements Simple
{

	@Override
	public void show() {

		System.out.println("this is an simple interface ");
		
	}
	
}

class Simple2 implements  Simple
{

	@Override
	public void show() {


		System.out.println("this is an 2nd class interface ");
	}
	
}

public class Assign2 {

	public static void main(String[] args) {

		Simple1 ss=new Simple1();
		
		ss.show();
		
		Simple2 s = new Simple2();
		
		s.show();
		
	}

}
