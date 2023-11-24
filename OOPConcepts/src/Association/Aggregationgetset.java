package Association;

class Country_
{
	String name;
	sportperson_ spp;
	
	void Country_(String name,sportperson_ spp)
	{
		this.name=name;
		this.spp=spp;
	}

	void display()
	{
		System.out.println("the country name is "+this.name);
		System.out.println("the sport person name is "+this.spp.pgame);
		System.out.println("the game is "+this.spp.pgame);
		System.out.println("the captain name is "+this.spp.tcaptain);
	}
}

class sportperson_
{
	String pname;
	String pgame;
	String tcaptain;
	
	 void sportperson_(String pname,String pgame,String tcaptain)
	{
		this.pname=pname;
		this.pgame=pgame;
		this.tcaptain=tcaptain;
				
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPgame() {
		return pgame;
	}

	public void setPgame(String pgame) {
		this.pgame = pgame;
	}

	public String getTcaptain() {
		return tcaptain;
	}

	public void setTcaptain(String tcaptain) {
		this.tcaptain = tcaptain;
	}
}

public class Aggregationgetset {

	public static void main(String[] args) {
		
		Country_ ct=new Country_();
		sportperson_ sp=new sportperson_();
		sp.sportperson_("Virat Kohli","Cricket","Rohit Sharma");
		ct.display();
		
			
	}

}
