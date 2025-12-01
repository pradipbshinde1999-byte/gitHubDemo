package abstraction;
interface Taxable1
{
	int trate1=30;
	public void caltax();
	
}
class Book1 implements Taxable1
{
	int bprice;
	Book1(int p)
	{
		bprice=p;
	
	}
	@Override
	public void caltax() 
	{
		System.out.println("before applying tax of book price:="+bprice);
		bprice=bprice+bprice*trate1/100;
		System.out.println("after applying tax of book price:="+bprice);
	
		
	}
}
class Publication extends Book implements Taxable1
{
	String pname;
	Publication(int p, String pname)
	{
		super(p);
		this.pname=pname;
	}
	public void caltax()
	{
		super.caltax();
		System.out.println("publication name of the book is:="+pname);
	}
}
public class BookPubInterfEx 
{

	public static void main(String[] args)
	{
	  Publication p=new Publication(180,"vision");
	  p.caltax();
	  Publication p1=new  Publication(195,"techmax");
	  p1.caltax();
	}

}
