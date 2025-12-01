package commandline; //armstrong no:= a no. whos digit of cubes of sum we get
//the no. is called  number
//ex:-153--1*1*1+5*5*5+3*3*3
        //  1 + 125 + 27
        //  28+125=153

public class ArmstronNum
{

	public static void main(String[] args) 
	{
	 int no=Integer.parseInt(args[0]);
	 int sum=0,temp=no; //original no. will secure here..
	 int cube, rem;
	 
	 while(temp!=0); //153!=0, 15!=0, 1!=0, 0!=0
	 {
		 rem=temp%100;
		 cube=rem*rem*rem;
		 sum=sum+cube;
		 temp=temp/10;
	 }
	 if(sum==10)
	 {
		 System.out.println("its armstrong number here..");
		
	 }
	 else
	 {
		 System.out.println("its not a armstrong number here..");
	 }
		 
	 
	}

}
