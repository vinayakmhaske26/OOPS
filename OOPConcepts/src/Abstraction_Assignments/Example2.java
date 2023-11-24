package Abstraction_Assignments;

abstract class Bank
{
	abstract void getbalance();
}
class BankA extends Bank
{
	void getbalance() 
	{	
		System.out.println("the deposite of bankA is $1000");
	}
		
}
class BankB extends Bank
{
	void getbalance() 
	{
		System.out.println("the deposite of bankA is $1500");
	}
	
}
class BankC extends Bank
{
	void getbalance() 
	{
		System.out.println("the deposite of bankA is $2000");
	}
	
}

public class Example2 {

	public static void main(String[] args) {

		BankA a=new BankA();
		BankB b=new BankB();
		BankC c=new BankC();
		
		a.getbalance();
		b.getbalance();
		c.getbalance();
		
	}

}
