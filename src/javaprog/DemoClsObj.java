package javaprog;

public class DemoClsObj 
{
	int p,q,r;
	public void add()
	{
		p=100;q=200;
		r=p+q;
		System.out.println("addition of two numbers:"+r);
	}

	public static void main(String[] args)
	{
		DemoClsObj dd=new DemoClsObj();
		dd.add();
     
	}

}
