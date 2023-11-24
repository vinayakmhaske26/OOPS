package classes_objects;

public class Person_twoObj {

	int Adharnumber;
	String Fullname;
	String contactnumber;
	String pannumber;
	String bloodgroup;
	int voternumber;
	String Address;
	int age;
	public static void main(String[] args) {
		Person_twoObj p1=new Person_twoObj();
		p1.Adharnumber=12345678;
		p1.Fullname="Vinayak Sanjay Mhaske";
		p1.contactnumber ="9822084556";
		p1.pannumber="PAN-23434356";
		p1.bloodgroup="Ab+";
		
		System.out.println("Adhar number is="+p1.Adharnumber+"Contact number is ="+p1.contactnumber+"Full name is ="+p1.Fullname);
		System.out.println("Pan number is ="+p1.pannumber+"Blood group is ="+p1.bloodgroup);
		
		Person_twoObj p2=new Person_twoObj();
		p2.voternumber=1233434;
		p2.Address="Maharastra";
		p2.age=18;
		
		System.out.println("Voter id is="+p2.voternumber+"Address is="+p2.Address+"Age is="+p2.age);
		

		
	}

}
