package commandline;  //the no. we read from any direction after that we got
//same no. that no. we can say its palindrom number.
//ex:-121,454,515,etc.

public class PalindromNum 
{

	public static void main(String[] args) 
	{
	  int num=Integer.parseInt(args[0]);
	  int tem=num; //original number will secure here.
	  int rem,rev=0;
	  
	  while(tem!=0) //121!=0, 12!=0, 1!=0, 0!=0,
	  {
		  rem=tem%10; //121%10=1, 12%10=2, 1%1=1
		  rev=rev*10+rem; //0*10+1=1, 1*10+2=12, 12*10+1=121
	       tem=tem/10; //121/10=12, 12/10=1, 1/10=0
	  }
	  if(rev==num)
	  {
		  System.out.println("the no. is palindrom number..");
	  }
	  else
	  {
		  System.out.println("the no. is not palindrom number..");
	  }
	}

}
