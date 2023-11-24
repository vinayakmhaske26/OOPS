package classes_objects;

public class AnimalCon {
	
	String type;
	String food;
	String name;
	
	public AnimalCon()
	{
		this.type="mammal";
		this.food="pedigree";
		this.name="jonny";
	}
	void display()
	{
		System.out.println(this.type+"\n"+this.food+"\n"+this.name);
	}

	public static void main(String[] args) {
		AnimalCon a=new AnimalCon();
				a.display();
		
	}

}
