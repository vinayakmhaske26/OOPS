package Inheritance;

class Person
{
	
}
class Employee12 extends Person
{
	private int id;
	private double hourlypay;
	
	public Employee12(int id,double hourlypay)
	{
		super();
		this.id=id;
		this.hourlypay=hourlypay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getHourlypay() {
		return hourlypay;
	}

	public void setHourlypay(double hourlypay) {
		this.hourlypay = hourlypay;
	}
	
	
}

public class Example7 {

	public static void main(String[] args) {

		
	}

}
