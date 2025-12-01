package commandline;

public class GreaterNum
{

	public static void main(String[] args)
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		if (num1>num2)
		{
			System.out.println("no. one is greater number:");
		}
		else
		{
			System.out.println("no. two is greater number:");
		}
	}

}
