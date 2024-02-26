import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int i=1;
	int j=1;
	
	/*while(i<=n)
	{
	 i=1;
		i++;
	
	while(j<=n)
	{
	 j=1;
	if(j==1||i==j||i==n)
		System.out.print("*");
		else
			System.out.print(" ");
			j++;
			}
			}
			}
			}*/
			
			
		for(i=1;i<=n;i++)
		{
		for(j=1;i<=n;j++)
		{
		if(j==1||i==j||i==n)
		System.out.print("*");
		else
			System.out.print(" ");		
		}
		System.out.print("\n");
		}
		}
		}	
			
			
			
			
			
			
	
			
	
