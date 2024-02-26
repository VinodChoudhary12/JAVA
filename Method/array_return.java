import java.util.Scanner;
class Test
{	
	public static void main(String args[])
	{
		Test ob=new Test();
		
		//System.out.println("The sum is "+);
		int sum[]=new int[5];
		sum=ob.sum();
		for(int i=0; i<5; i++)
		{
		    
		    	System.out.println("sum["+i+"]="+sum[i]);
		    	 		
	    	} 
	    	 
	 	 
	 }
	 
	 public int[] sum()
	 {
	 	
	 	//Scanner sc = new Scanner(System.in);
		//int a[]= new int[5];
		//int b[]= new int[5];
		int sum[]=new int[5];
		//System.out.println("The First Array is");	
	        //for(int i=0; i<5; i++)
	    	//	a[i]=sc.nextInt();
	    	//System.out.println("The second Array is");	
	   	//for(int i=0; i<5; i++)
	    	//	b[i]=sc.nextInt();
	      	//System.out.println("The First Array is");
	    	//for(int i=0; i<5; i++)
	    	//	System.out.println("a["+i+"]="+a[i]);
   	      	//System.out.println("The Second Array is");
	    	//for(int i=0; i<5; i++)	
	    	//	System.out.println("b["+i+"]="+b[i]);		
	      	//System.out.println("The Sum Array is");
	    	//for(int i=0; i<5; i++)
		//{
		    	//sum[i]=a[i]+b[i];
		    	//System.out.println("sum["+i+"]="+sum[i]);
		    	 		
	    	//} 
	    	       sum=this.sub();
	    	 	return sum;
	    						 
	 
	 
	 }
	 public int[] sub()
	 {
	 	
	 	Scanner sc = new Scanner(System.in);
		int a[]= new int[5];
		int b[]= new int[5];
		int sum[]=new int[5];
		System.out.println("The First Array is");	
	        for(int i=0; i<5; i++)
	    		a[i]=sc.nextInt();
	    	System.out.println("The second Array is");	
	   	for(int i=0; i<5; i++)
	    		b[i]=sc.nextInt();
	      	System.out.println("The First Array is");
	    	for(int i=0; i<5; i++)
	    		System.out.println("a["+i+"]="+a[i]);
   	      	System.out.println("The Second Array is");
	    	for(int i=0; i<5; i++)	
	    		System.out.println("b["+i+"]="+b[i]);		
	      	System.out.println("The Sum Array is");
	    	for(int i=0; i<5; i++)
		{
		    	sum[i]=a[i]-b[i];
		    	//System.out.println("sum["+i+"]="+sum[i]);
		    	 		
	    	} 
	    	 	return sum;
	    	 	}
}
