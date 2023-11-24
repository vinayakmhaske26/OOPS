package functions;
import java.util.Scanner;
public class demo_function {
	
	public static void Animal(String name) {
		System.out.println(name);

	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		
		
		Animal(name);
	}

}
