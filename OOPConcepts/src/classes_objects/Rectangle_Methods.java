package classes_objects;

import java.util.Scanner;

public class Rectangle_Methods {
	
	int lenghth;
	int width;
	
	public Rectangle_Methods(int lenghth,int width)        // this is constructor
	{
		this.lenghth=lenghth;        // we can write only initiolization code 
		this.width=width;        
	}

	public void CalculateArea_Perimiter()
	{
		System.out.println("Area="+(this.lenghth*this.width));
		System.out.println("Perimeter="+(2*(this.lenghth+this.width)));
	}

	public static void main(String[] args) {
		
		System.out.println("enter the lenghth and width");
		Scanner sc = new Scanner(System.in);
		int lenghth=sc.nextInt();
		int width=sc.nextInt();
		
		Rectangle_Methods r=new Rectangle_Methods(lenghth,width);
		r.CalculateArea_Perimiter()	;	
   }

 }
