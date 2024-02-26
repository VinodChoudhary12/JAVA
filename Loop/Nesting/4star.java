class Test
{
	public static void main(String args[])
	{
		int i=1,j=1,k=0;;
	    for(i=1;i<=9;i++)
	  {  
	   	int x=(i<=5?k++:k--);
	   	
	  
	      for(j=1;j<=10;j++)
	     {
	        if(j<=(2*k))
	        System.out.print("* ");
	    
	        else
	        System.out.print(" ");
	     }
	        System.out.println();
	   }
	}
}
