package javaprog;

public class SecondEx
{
  public void show()
  {
	  System.out.println("this is online session here:");
  }
  
	public static void main(String[] args)
	{
		SecondEx s1=new SecondEx();  //  object calling
		s1.show();
		FirstEx1 f1=new FirstEx1();  //JVM
		f1.print();

	}

}
