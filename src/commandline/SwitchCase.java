package commandline;

public class SwitchCase 
{

	public static void main(String[] args)
	{
	 int num1=Integer.parseInt(args[0]);
	 int num2=Integer.parseInt(args[0]);
	 int result=0; //garbage value arent enter in the variable here..
	 char ch=args[2].charAt(0);
	  
	 switch(ch)
	 {
	 case '+': result=num1+num2;
	           System.out.println("addition of number is:="+result);
	           break;
	           
	 case '-': result=num1-num2;
               System.out.println("sunstraction of number is:="+result);
               break; 
     
	 case '*': result=num1*num2;
               System.out.println("multiplication of number is:="+result);
                break;
	         
	 case '/': result=num1/num2;
               System.out.println("division of number is:="+result);
               break;
     
	 case '%': result=num1%num2;
               System.out.println("moduls of number is:="+result);
               break;
     
	 default: System.out.println("wrong operator/invalid operator enter write once");
	 }
	 
	}

	}
