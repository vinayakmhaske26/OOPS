package Polymorphism;

class Bike {
	void run() {
		System.out.println("Bike is running");
	}
}

class Splendor extends Bike {
	void run() {
		System.out.println("the bike is running safely at 60km/hr");
	}
}

class Hero extends Bike
{
	void run()
	{
		System.out.println("The bike is type of hero");
	}
}

public class overriding__1 {

	public static void main(String[] args) {

		Bike b = new Bike(); // object of parent class..
		Splendor p = new Splendor(); // object of child class...
		Hero h=new Hero(); // object of the 2nd child class....
		
		Bike bike; // create reference variable of the parent class........
		
		bike=b;
		bike.run();
		
		bike=p;
		bike.run();
		
		bike=h;
		bike.run();
		
		
	}

}
