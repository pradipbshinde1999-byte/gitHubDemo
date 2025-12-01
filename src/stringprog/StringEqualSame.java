package stringprog;

public class StringEqualSame 
{

	public static void main(String[] args) 
	{
	  String s1="Swarget Pune";
	  String s2="swarget pune";
	  
	  if(s1.equals(s2))
	  {
		  System.out.println("strings are equal:");
		  }
	  else
	  {
		   System.out.println("strings are not equal:");
	  }
	  
	  if(s1.equalsIgnoreCase(s2))
	  {
		  System.out.println("strings are same:");
	  }
	  
	  else
	  {
		  System.out.println("strings are not same:");
	  }
	}

}
