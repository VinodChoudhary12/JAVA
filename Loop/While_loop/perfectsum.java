import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int i=1;
	int sum=0;
	if(n%2!=0)
		System.out.println("This is not a Perfect Number");
	else{
	while(i<n){
	
	if(n%i==0){
	sum=sum+i;
	System.out.print(i+" ");
	}
	i++;
	}
	
}	
	if(n==sum)
		System.out.println("The number is perfect");
	else
		System.out.println("This Is Not A Perfect Number");
		

      System.out.println("\nThe Sum is "+sum);
}	
}

	
