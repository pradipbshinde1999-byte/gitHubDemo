package stringprog;

import java.util.Scanner;

public class VowelsString 
{

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the string here..");
	 String s1=sc.next();
	 int count=0; //garbage value arent in the variable here..
	 for(int i=0;i<s1.length();i++)
	 {
		 char ch=s1.charAt(i);
		 if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
		 {
			 count=count+1;
		 }
	
		
		 }
		 System.out.println("Vowels are exist in the string:"+count);
		 }
	 }

	//in two way we can solve string programs..


