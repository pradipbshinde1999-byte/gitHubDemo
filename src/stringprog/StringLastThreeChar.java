package stringprog;

public class StringLastThreeChar 
{

	public static void main(String[] args) 
	{
		String s1="Friday";
		String s2=s1.substring(0, 3);
		String s3=s1.substring(3, 6);
		String s4=s3+s2;
		System.out.println(s4);		

	}

}
