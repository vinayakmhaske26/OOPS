package functions;

public class Smallest_threenum {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int gretest;
		int smallest;
		if(a<b && a<c)
		{
			smallest= a;
		}
		else if(b<c)
		{
			smallest= b;
		}
		else
		{
			smallest =c;
		}	
		if(a>b && a>c)
		{
			gretest= a;
		}
		else if(b>c)
		{
			gretest= b;
		}
		else
		{
			gretest=c;
		}	
		System.out.println("the smallest number is="+smallest);
		System.out.println("the gretest number is="+gretest);


	}

}
