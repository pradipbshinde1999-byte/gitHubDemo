package javaprog;
class First
{
	public void print() //method-1
	{
		System.out.println("this is new core java langauge:");
		
	}
}

public class MultipleClassEx 
{
 public void show()  //method-2
 {
	 System.out.println("this is offline session:");
 }
 
	public static void main(String[] args) //run time block here
	{
		MultipleClassEx p1=new MultipleClassEx();
		p1.show();
		First f1=new First();// JVM run inside the main method only
		f1.print();
		
		}

}
