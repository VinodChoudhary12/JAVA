//2, 3, 5, 7, 11, 13, 17, 19.

import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int j=2;
		int i=2,a;
	  
		
	   for(i=2;i<=n;i++)
	   {
         	a=0;
         
            for(j=1;j<=i;j++)
            {
            	if(i%j==0)
               a++;
               
            }
         if(a==2)
         System.out.print(i+" ");
      }
   
 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	   }
	}

