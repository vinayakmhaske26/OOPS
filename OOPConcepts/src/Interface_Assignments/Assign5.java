package Interface_Assignments;

interface Firstname
{
	void show();
}

interface Lastname
{
	 void show1();
}

interface Lastname1
{
	void show2();
}

class name implements Firstname,Lastname,Lastname1
{

	@Override
	public void show() {
		System.out.println(" interface 1 ");
		
	}

	@Override
	public void show1() {
		System.out.println(" interface 2 ");
		
	}

	@Override
	public void show2() {
		System.out.println(" interface 3 ");
		
	}

	
}
public class Assign5 {

	public static void main(String[] args) {


		name n=new name();
		
		n.show();
		n.show1();
		n.show2();
		
	}

}
