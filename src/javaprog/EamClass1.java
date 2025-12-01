package javaprog;

public class EamClass1
{
    int age=24;  //initialization
    String add="Mumbai";
    float sal=45000.0f;
    long mbno=995735783;
      
    public void display()
    {
    	System.out.println("age is:"+age+"\nAddress:="+add);
    	System.out.println("salary:"+sal);
    	System.out.println("mobile number:"+mbno);
    }
	public static void main(String[] args) 
	{
		EamClass1 ee=new EamClass1();
		ee.display();
		
		
	}

}
