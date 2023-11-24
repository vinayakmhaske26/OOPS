package Interface_Assignments;

interface Data
{
	public String F_name = "Vinayak";
	static String L_name = "Mhaske";
	final String Address = "A_nagar";

	
	// in interface we can gives the public static and final data members....

void show();

}

class PersonData implements Data
{

	@Override
	public void show() {
		System.out.println(" \n "+F_name+" \n "+L_name+" \n "+Address);
		
	}
	
}
public class Assign3 {

	public static void main(String[] args) {
		
		PersonData d=new PersonData();
		
		d.show();

	}

}
