package Interface_Assignments;

public class Assign4 {
	
	interface A
	{
		public void display();  // public methods are allows to declare only in interface
		static void display1()  // static member fun are allows to define in interface..
		{
			
		}
		
		default void display2()  // default member fun are allows to define in interface..
		{
			
		}
		private void display3()  // private member fun are allows to define in interface..
		{
			
		}
		
	}
	

	class B implements A
	{

		@Override
		public void display() {
			

			
		}
		
		
	
	}
	public static void main(String[] args) {
		
		
			
	}

}
