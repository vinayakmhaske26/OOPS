package classes_objects;

public class Rectangle {

	String type;
	int vertices;
	int edges;
	String properties;
	String formula;
	
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		
		r1.type="parellelogram";
		r1.vertices=4;
		r1.edges=4;
		r1.properties="convex polygon";
		r1.formula="2*l*b";
		
		System.out.println("the type of rectangle is="+r1.type);
		System.out.println("the vertices of rectangle is="+r1.vertices);
		System.out.println("the edges of rectangle is="+r1.edges);
		System.out.println("the properties of rectangle is="+r1.properties);
		System.out.println("the formula of rectangle is="+r1.formula);
	}

}
