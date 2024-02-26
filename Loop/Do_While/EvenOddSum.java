import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int i=1,osum=0,esum=0;
   do
   {
   	if(i%2==0){
   		esum=esum+i;
   		//System.out.println(esum);
   		}
   	else{
   		osum=osum+i;
   		//System.out.println(osum);
   		}
   		i++;
   }
   while(i<=n);
   	System.out.println("Even sum is= "+esum);
   	System.out.println("Even Odd is= "+osum);
   }
   }
   
   		
   		
