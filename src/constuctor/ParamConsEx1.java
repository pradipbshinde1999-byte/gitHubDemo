package constuctor;

public class ParamConsEx1 
{
	int rlno;
	String name;
	char grade;
	
	private  ParamConsEx1(int rlno, String name,char grade)
	{
		this.rlno=rlno;
		this.name=name;
		this.grade=grade;

	
	}

	public void display()
	{
		System.out.println("roll name:"+rlno);
		System.out.println("name:"+name);
		System.out.println("grade:"+grade);
		
	}
	
	public static void main(String[] args)
	{
		 ParamConsEx1 pp=new  ParamConsEx1(12,"pradip",'A');
		 pp.display();
		 
		

	}

}
