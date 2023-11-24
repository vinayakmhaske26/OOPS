package Polymorphism;

class Degree
{
	public void getdegree()
	{
		System.out.println("I am graduated");
	}
}
class UGraduate extends Degree
{
	public void getdegree()
	{
		System.out.println("I am under graduate");
	}
}
class PGraduate extends Degree
{
	public void getdegree()
	{
		System.out.println("I am post graduate");
	}
}
public class function_overriding {

	public static void main(String[] args) {
		
		Degree d = new Degree();
		d.getdegree();
		
		d = new UGraduate();
		d.getdegree();
		
		d = new PGraduate();
		d.getdegree();
		

		
	}

}
