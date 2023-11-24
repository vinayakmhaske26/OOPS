package git_Hub;

public class Overloading_1 {

	


		private String function(String temp, int data) {
			return "Hi";
		}
		public final static String function(int data, String temp) {
			return "Hello";
		}
		
		public static void main(String[] args) {
			
			Overloading_1 obj=new Overloading_1();
			System.out.println(obj.function("Time",3));// 1st function calling..
			System.out.println(obj.function(2,"Java"));// 2nd function calling...
		
			
	}

}
