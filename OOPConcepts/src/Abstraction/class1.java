package Abstraction;

abstract class Bike
{
	abstract void run();
}

class Honda4 extends Bike 
	{
	void run() 
	{
		System.out.println("running safely");
	}

	public class class1 {
		public static void main(String[] args) {

			Bike obj = new Honda4();
			obj.run();

		}
	}
}
