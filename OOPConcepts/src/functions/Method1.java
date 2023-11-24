package functions;
import java.util.Scanner;
public class Method1 {

	int smallest(int num1,int num2)
	{
		if(num1<num2)
		{
			return num1;
		}
		else
		{
			return num2;
		}
	}
	void gretest(int num1,int num2)
	{
		if(num1<num2)
		{
			System.out.println("the greatest number is="+num1);
		}
		else
		{
			System.out.println("the gratest number is ="+num2);
		}
	}
public static void main(String[] args) {

		
		int num1,num2;
		Method1 m1=new Method1();

		Scanner sc=new Scanner(System.in);
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println("the smallest number is="+m1.smallest(num1,num2));
	}

}
