package commandline;

public class FibonesisSeries 
{

	public static void main(String[] args) 
	{
         int num=Integer.parseInt(args[0]);
		
		int f1=0;
		int f2=1;
		System.out.println(f1+"\n"+f2);
		int f3;
		for(int i=1; i<num;i++);
		{
			f3=f1+f2;
			System.out.println("fibonesis series:="+f3);
			f1=f2;
			f2=f3;
			}
	}
}
