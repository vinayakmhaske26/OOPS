package Interface_Assignments;

interface AdvanceArithmatic
{
	int division_sum(int n);
}

class Mycalculator implements AdvanceArithmatic
{
	
	int A=0;

	@Override
	public int division_sum(int n) {
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				A=A+i;
			}
		}
		
		return A;
	}
	
}

public class Assign1 {

	public static void main(String[] args) {


		Mycalculator cc=new Mycalculator();
		
		System.out.println(cc.division_sum(600));
		
	}

}
