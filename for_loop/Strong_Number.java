//145
// 1*1+1 *2*3*4+ 1*2*3*4*5=145

import java.util.Scanner;
class Strong
{
	public static void main(String[]args)
	{
		int rev=0,sum=0,fact=1,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		int c=n;
		int j=1;
		for(j=1;n>0;j++)
		{
		   int rem=n%10;
		   n=n/10;
		
		     for(i=1,fact=1;i<=rem;i++)
		   {
	
		   fact=fact*i;
		   
		   }
		   sum=sum+fact;
	       }
	       
	          if(c==sum)	   
		     System.out.println("The Number is Strong Number");
		   else
		     System.out.println("The Number is not  Strong Number");
		    
	}
}
		 
		   			
		
		
