 package Association;

class Country
{
	String name;
	Sportperson sp;
	
	 public Country(String name,Sportperson sp)
	 {
		 this.name=name;
		 this.sp=sp;
	 }
	 
	 void showdetails()
	 {
		 System.out.println("country name is "+this.name);
		 System.out.println("player name is "+this.sp.playername);
		 System.out.println("captainname is "+this.sp.captainname);
		 System.out.println("sportname is "+this.sp.sportname);
		 System.out.println("player review is "+this.sp.review+"\n\n");
		
	 }	
	
}
class Country1
{
	String name;
	Sportperson1 s1;
	
	Country1(String name,Sportperson1 s1)
	{
		this.name=name;
		this.s1=s1;
	}
	void display()
	{
		System.out.println("country1 name is "+this.name);
		System.out.println("player name is "+this.s1.pname);
		System.out.println("captain name is "+this.s1.cname);
		System.out.println("sport name is "+this.s1.sname);
		System.out.println("team review is "+this.s1.review);
	}
}

class Sportperson
{
	String playername;
	String captainname;
	String sportname;
	String review;
	
	public Sportperson(String playername,String captainname,String sportname,String review )
	{
		this.playername=playername;
		this.captainname=captainname;
		this.sportname=sportname;
		this.review=review;
	}
		
}
class Sportperson1
{
	String pname;
	String cname;
	String sname;
	String review;
	
 public Sportperson1(String pname,String cname,String sname,String review)
{
	this.pname=pname;
	this.cname=cname;
	this.sname=sname;
	this.review=review;
}

}
public class Aggregation {

	public static void main(String[] args) {
			
		Sportperson ss=new Sportperson("MSdhoni","Virat","Cricket","Good");
		Country c=new Country("India",ss);	
		c.showdetails();
		
		Sportperson1 s1=new Sportperson1("ronaldo","messi","football","good");
		Country1 c1=new Country1("Brazil",s1);
		c1.display();
	}

}

