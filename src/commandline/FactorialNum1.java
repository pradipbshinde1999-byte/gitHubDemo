package commandline;

public class FactorialNum1 
{

	public static void main(String[] args) //string array args
	{
		int no=Integer.parseInt(args[0]);
		int fact=1;
		while(no>=1)
		
		{
			fact=fact*no;
			no--;
			//System.out.println("factorial of number is:="+fact);
		}
			
		System.out.println("factorial of no is:="+fact);

	}

}

