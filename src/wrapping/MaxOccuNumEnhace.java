
package wrapping;

public class MaxOccuNumEnhace
{

	public static void main(String[] args) 
	{
		
       int a[]= {5,2,1,4,1,6,5,1,3,7,2,6,1}; //array syntax
       int count[]=new int[100];
       
       for(int x:a)
       {
    	   count[x]=count[x]+1; //count[x]++;
    	   
       }
       int max=0;
       int v=0;
       
       for(int x:a)
       {
    	   if(count[x]>max)
    	   {
    		   max=count[x];
    		   v=x;
    	   }
       }
       System.out.println("maximum occurance of number is:="+v);
	}

}
