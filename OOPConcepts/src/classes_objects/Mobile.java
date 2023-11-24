package classes_objects;

public class Mobile {
	
	String model;
	String brand;
	String camera;
	String features;
	String colour;

	public static void main(String[] args) {

		Mobile m1 = new Mobile();
		m1.model="samsung A21";
		m1.brand="samsung";
		m1.camera="64 mega pixel";
		m1.features="Android 11";
		m1.colour="blue";
		
		System.out.println("the model of mobile is="+m1.model);
		System.out.println("the brand of mobile is="+m1.brand);
		System.out.println("the camera of mobile is="+m1.camera);
		System.out.println("the features of mobile is="+m1.features);
		System.out.println("the colour of mobile is="+m1.colour);
		
				
				
	}

}
