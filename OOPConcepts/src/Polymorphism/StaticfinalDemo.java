package Polymorphism;

public class StaticfinalDemo {
	
	static final String name="Shubham";   // static final variable
	
	static final int count;   // static blank final variable
	static
	{
		count=25;
	}

	public static void main(String[] args) {

		StaticfinalDemo sfd=new StaticfinalDemo();
		System.out.println(sfd.name);
		System.out.println(sfd.count);
		
	}

}
