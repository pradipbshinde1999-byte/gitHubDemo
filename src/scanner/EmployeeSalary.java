package scanner;

import java.util.Scanner;

public class EmployeeSalary 
{
  int Empno;
  float Bs,GS,HRA,TA,DA,PF;
  
  Scanner sc=new Scanner(System.in);
  
  public void input()
  {
	  System.out.println("enetr employee number:");
	  Empno=sc.nextInt();
	  System.out.println("enter employee basic salary:");
	  Bs=sc.nextFloat();
  }

  public void calc()
  {
	  HRA=Bs*0.4f;
	  TA=Bs*0.3f;
	  DA=Bs*0.2f;
	  PF=Bs*0.1f;
	  GS=Bs+HRA+TA+DA-PF;
  }
  public void output()
  {
	  System.out.println("employee number:"+Empno);
	  System.out.println("employee basic salary:"+Bs);
	  System.out.println("employee house rent allowance:"+HRA);
	  System.out.println("employee travel allowance:"+TA);
	  System.out.println("employee dearness allowance:"+DA);
	  System.out.println("employee providance fund:"+PF);
	  System.out.println("Gross salary:"+GS);
	  
  }
  public static void main(String[] args) 
	{
	  EmployeeSalary ee=new EmployeeSalary();
	  ee.input();
	  ee.calc();
	  ee.output();
	  
      
	}

}
