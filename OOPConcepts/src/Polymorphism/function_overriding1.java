package Polymorphism;

class Bank
{
	int balance;
	public int getbalance()
	{
		return 0;
	}
}
class BankA extends Bank
{
    public int getbalance()
    {
    	this.balance=1000;
    	System.out.println("the amount of deposite of bankA is "+balance+"$");
    	return 0;
    }
}
class BankB extends Bank
{
	public int getbalance()
	{
		this.balance=1500;
		System.out.println("the amount of deposite in bankB is "+balance+"$");
		return 0;
	}
}
class BankC extends Bank
{
	public int getbalance()
	{
		this.balance=2000;
		System.out.println("the amount of deposite in BankC is "+balance+"$");
		return 0;
	}
}

public class function_overriding1 {

	public static void main(String[] args) {

		Bank b=new Bank();
		b=new BankA();
		b.getbalance();
		b=new BankB();
		b.getbalance();
		b=new BankC();
		b.getbalance();
		
	}

}
