package classes_objects;

public class Animal {
	String type;
	String colour;
	String food;
	String gender;
	String name;

	public static void main(String[] args) {

		Animal q1 =new Animal();
		
		q1.name="doggy";
		q1.type="german shefard";
		q1.colour="brownish black";
		q1.food="fish and chicken";
		q1.gender="M";
		
		System.out.println("the name of animal is="+q1.name);
		System.out.println("the type of animal is="+q1.type);
		System.out.println("the colour of animal is="+q1.colour);
		System.out.println("the food of animal is="+q1.food);
		System.out.println("the gender of animal is="+q1.gender);
		
		
	}

}
