package functions;
import java.util.Scanner;
public class Leap_orNot {

	public static void main(String[] args) {

		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year:");
		
		year=sc.nextInt();
		if(((year % 4==0) && (year % 100!=0)) || (year % 400==0))
			System.out.println("the specific year is leap ");
		else
            System.out.println("the specific year is not leap");
	
	}
	
}