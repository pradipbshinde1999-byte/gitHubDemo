package inheitance;

public class ParamConsEx1 
{
	int rlno;
	String name;
	char grade;
	
	private ParamConsEx1 (int rlno,String nm,char g) //paramater here
	{
		this.rlno=rlno;
		name=nm;
		grade=g;
		
	}
    public void display()
    {
    	System.out.println("roll number:"+rlno);
    	System.out.println("name:"+name);
    	System.out.println("grade:"+grade);
    }
    
	public static void main(String[] args)
	{
		ParamConsEx1 pp=new ParamConsEx1 (12,"pradip",'A');
		pp.display();

	}

}
