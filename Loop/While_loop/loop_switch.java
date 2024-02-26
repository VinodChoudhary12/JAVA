//choice_switch.java

import java.util.Scanner;
class Test
{
	public static void main(String args[])
{	
	Scanner sc = new  Scanner(System.in);
	System.out.println("Press 1 for Series of !1-!2+!3-!4+!5....");
	System.out.println("Press 2 for Series of Factorial"); 
	System.out.println("Press 3 for Series of n Natural Numbers"); 
	System.out.println("Press 4 for Series of n ODD Numbers"); 
	int ch=sc.nextInt();
	
		char Y='y';
		//System.out.println(Y);
	switch(ch){
	
	case 1:{
	System.out.println("Enter The line");
	int n=sc.nextInt();
	int i=1;
	int j=0;
	int fact=1;
	int sum=0;
	
	while(i<=n)
{
	
	fact=fact*i;
	if(i%2==0){
	System.out.print("-!"+i);
	sum=sum-fact;}
	 else{
	 System.out.print("+!"+i);
	     sum=sum+fact;}
	     i++;
	     
}
	System.out.println("\n Do You want to print only series press Y ");
	 Y=sc.next().charAt(0);
	if(Y=='y')
		
		System.out.print("The Sum of This series is:="+sum);
			
}
	break;
	
	case 2:{
	
	System.out.println("Enter The Number ");
	int n=sc.nextInt();
	int i=1;
	int fact=1;
	int sum=0;
	System.out.println("\nPress Y if You Want to Get Factorail with series ");
	 Y=sc.next().charAt(0);
	if(Y=='y'){	
	
	while(i<=n)
       {
	fact=fact*i;
	System.out.print("!"+i);
	sum=sum+fact;
	i++;
	if(i<=n)
	System.out.print("+");
	}	
	System.out.print("="+fact);}
	
	else {
		while(i<=n)
      		{
		fact=fact*i;
		//System.out.print(i);
		i++;
		}
}
	System.out.print("\nThe Fatorial of is:"+fact);
		
		
	break;
}	
	case 3:{
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int i=1;
	int sum=0;
	System.out.println("The first "+ n +" Natural Number is:");
	while(i<=n)
{	
	 int j=2*i;
	System.out.print( j+" ");
	i++;		
}
	System.out.println("\nPress Y If You want to Sum of N natural Numbers");
	 Y=sc.next().charAt(0);
	 i=1;
	if(Y=='y')
	{	
	
		while(i<=n)
		{	
		 int j=2*i; 
		System.out.print( j+" ");
		sum=sum+j;
		i++;		
		}
	
	}
	System.out.print("\nThe sum of Ntural number is:="+sum);
	break;	
	}   
	case 4:{
	System.out.println("Enter The line");
	int n=sc.nextInt();
	int i=1;
	System.out.println("The first "+ n +" ODD Number is:");
	while(i<=n)
{	
 	
	 int j=2*i-1;
	System.out.print( j+" ");
	i++;	
}
	System.out.println("\nPress Y If You want to Sum of N ODD Numbers");
	Y=sc.next().charAt(0);
	i=1;
	if(Y=='y')
	{	int sum=0;
		while(i<=n)
		{	
		 int j=2*i-1; 
		System.out.print( j+" ");
		sum=sum+j;
		i++;		
		}
		System.out.print("\nThe sum of ODD number is:="+sum);
	}
		break;

}	
	default:
		System.out.print("You Entred Wrong input");
		
}
}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
