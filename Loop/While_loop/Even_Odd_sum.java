import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The line");
	int n=sc.nextInt();
	int i=1;
	int Evensum=0;
	int Oddsum=0;
	while(i<=n){

	if(i%2==0){
		Evensum=Evensum+i;
	
}	 else
	 	Oddsum=Oddsum+i;
	 
	 	i++;	 
}	
	System.out.println("Even sum="+Evensum);
	System.out.println("Odd sum="+Oddsum);
	
} 
}

	
	
