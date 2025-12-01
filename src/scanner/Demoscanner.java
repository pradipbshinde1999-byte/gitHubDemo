package scanner;

import java.util.Scanner;

public class Demoscanner {

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("enter student roll number:");
	 int rolno=sc.nextInt();	
	 System.out.println("enter studen name:");
	 String name=sc.next();
	 System.out.println("enter student grade:");
	 char grade=sc.next().charAt(0);
	 System.out.println("enter student percentage:");
	 float per=sc.nextFloat();
	 System.out.println("enter student mobile number:");
	 long mbno=sc.nextLong();
	 
	 System.out.println("   ");
	 
	 System.out.println("student roll number:="+rolno);
	 System.out.println("student name:="+name);
	 System.out.println("student grade:="+grade);
	 System.out.println("student percentage:="+per);
	 System.out.println("student mobile number:="+mbno);
	 
	 
	  }

}
