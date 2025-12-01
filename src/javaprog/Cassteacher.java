package javaprog;
class teacher
{
	int tno=10;
	String tname="sonal patil";
	char tgrade='A';
	
	public void output()
	{
		System.out.println("teacher number:"+tno);
		System.out.println("teacher name:"+tname);
		System.out.println("teacher grade:"+tgrade);
	}
}

public class Cassteacher
{
	
	public static void main(String[] args)
	{
	
		teacher t1=new teacher(); //memory allocate for above class
		t1.output();
	}

}
