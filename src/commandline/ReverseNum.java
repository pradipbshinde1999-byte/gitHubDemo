package commandline;

public class ReverseNum 
{

	public static void main(String[] args)
	{
	  int num=Integer.parseInt(args[0]);
	  int rev=0;
	  int rem;
	  
	  while(num!=0)
	  {
		  rem=num%10;
		  rev=rev*10+rem;
		  num=num/10;
		  
	  }
       System.out.println("reverse number is:="+rev);
	}

}
