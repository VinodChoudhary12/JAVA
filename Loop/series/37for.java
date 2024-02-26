//x^1/!1+x^3/!3+x^5/5=9.525



import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,y,i=1;
		int j=1;
		double fact=1,pow=1,sum=0;
		System.out.println("Enter The Number");
		n=sc.nextInt();
		System.out.println("Enter The Power");
		y=sc.nextInt();

	  for(i=1;i<=y;)
	  {	
	  	fact=fact*j;
	  	pow=pow*n;
	  	if(j%2!=0)
	  	{
	  	  sum=sum+(pow/fact);
		  System.out.print(n+"^"+j+"/!"+j);
		  if(j<n)
		    System.out.print("+");
		  i++;
		}
	           j++;
	   }
	         System.out.print("="+sum);
	}
}
	           	  	  	
