class Test
{
	public static void main(String args[])
	{
		int i=1,j=1,k;
	 for(i=1;i<=4;i++)
	{ 
	k=1;
	  for(j=1;j<=7;j++)
	  {
	   if(j>=5-i&&j<=3+i)
	   {
	     System.out.print(k);
	     int x=(j<4?k++:k--);
	     }
	     else 
	      System.out.print(" ");
	      }
	      System.out.println();
	  }
	}
}
	  
