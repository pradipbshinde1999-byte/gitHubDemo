package scanner;

import java.util.Scanner;

public class ScannerClsObj 
{
	int id;
	float salary;
	String address;
	long mbno;
	char grade;
	
	Scanner sc=new Scanner(System.in);
	public void input()  //method 1
	{
		System.out.println("enter employee id:");
		id=sc.nextInt();
		System.out.println("enter the employee salary:");
		salary=sc.nextFloat();
		System.out.println("enter the employee address:");
		address=sc.next();
		System.out.println("enter the employee mbno:");
		mbno=sc.nextLong();
		System.out.println("enter the employee grade:");
		grade=sc.next().charAt(0);
	}
	public void output() //method 2
	{
		System.out.println("employee id:"+id);
		System.out.println("employee salary:"+salary);
		System.out.println("employee address:"+address);
		System.out.println("employee mbno:"+mbno);
		System.out.println("employee grade:"+grade);
	}
	
		

    public static void main(String[] args) 
    {
    	ScannerClsObj s1=new ScannerClsObj();
    	s1.input();
    	s1.output();
    }
	
		
			
}
		

	


