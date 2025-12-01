package abstraction;
interface Taxable //interface
{
	int trate=20;
	public void caltax();//empty--blank--declared
}
class Book implements Taxable
{
	int bprice;
	Book(int bprice)
	{
		this.bprice=bprice;
	}
	@Override
	public void caltax() //define here
	{
	 System.out.println("book price before applying tax:"+bprice);	
	 bprice=bprice+bprice*trate/100;
	 System.out.println("book prise after applying tax:"+bprice);
		
	}
}


public class BookInterfaceEx //object creation
{
     public static void main(String[] args) 
     {

    	 Book b1=new Book(60);
    	 b1.caltax();
     }
}
