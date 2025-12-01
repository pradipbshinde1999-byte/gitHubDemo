package inheitance;
class Employee
{
	int Eno,Bsal,HRA,TA,DA,PF,GS;
	public Employee(int Eno,int bsal)
	{
		this.Eno=Eno;
		this.Bsal=bsal;
		
	}
	public void calc()
	{
		HRA=Bsal*40/100;
		TA=Bsal*30/100;
		DA=Bsal*20/100;
		PF=Bsal*10/100;
		GS=Bsal+HRA+TA+DA-PF;
	}
	
	public void output()
	
	{
		System.out.println("employee number:="+Eno);
		System.out.println("employee basic salary:="+Bsal);
		System.out.println("house rent allwance:="+HRA);
		System.out.println("travel allowance:="+TA);
		System.out.println("dearnesw allowance:="+DA);
		System.out.println("providance fund:="+PF);
		System.out.println("gross salary :="+GS);
	}
	
}
class Manager extends Employee
{
	int mallow;
	public Manager(int Eno, int bsal, int mallow)
	{
		super(Eno,bsal);
		this.mallow=mallow;
	}
	public void cal()
	{
		super.calc();
	}
	public void output()
	{
		super.output();
		System.out.println("manager allowance:"+mallow);
	}
}

public class EmpManMtdOverEx
{

	public static void main(String[] args) 
	{
		Manager m1=new Manager(1223,60000,30000);
		m1.cal();
		m1.output();

	}

}
