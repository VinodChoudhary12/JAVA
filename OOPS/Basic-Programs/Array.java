import java.util.Scanner;
class ArrayOpration
{
	private int a[];
	private int len;
	
	public void setData(int len)
	{
		this.a= new int [10];
		this.len=len;
		
	}
	public int [] getA()
	{
		return a;
	}
	public int getN()
	{
		return n;
	}
	
	//public int lengt()
	//{
	//	return a.length;
	//}
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Elemants");
		for(int i=0;i<this.len;i++)		
			a[i]=sc.nextInt();
	}
	public void output()
	{
		System.out.println("\tThe Elements Are:");
		for(int i=0 ; i<this.len ; i++)
			System.out.println("\ta["+i+"]="+a[i]);
	}
	public void reverse()
	{
		int temp;
		for(int i=0;i<(this.len/2);i++)
		{
			temp=a[i];
			a[i]=a[this.len-(i+1)];
			a[this.len-(i+1)]=temp;
		}
		System.out.println("\tReverse Elements Are:");
		for(int i=0 ; i<this.len ; i++)
			System.out.println("\ta["+i+"]="+a[i]);	
	}
	public void sum()
	{
		int sum=0;
		//if(len==0)
			//sum= 0;
		//return sum(a,(len-1))+a[len];
		for(int i=0;i<this.len;i++)
			sum=sum+a[i];
		System.out.println("SUM ="+sum);
	}
	public void max()
	{
		int max=0;
		for(int i=0;i<this.len;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		System.out.println("The Maximum Element Is:"+max);
		
	}
	public void min()
	{
		int min=a[0];
		for(int i=0;i<this.len;i++)
		{
			if(min>a[i])
				min=a[i];
		}
		System.out.println("The Manimum Element Is:"+min);
	}
	public void secMax()
	{
		int max =0;
		int secmax = 0;
		for(int i =0 ; i<this.len;i++)
		{
			if(max<a[i])
			{	
				secmax=max;
				max=a[i];
			}
			 else if(secmax<a[i]&&max>a[i])
			{
				secmax=a[i];
			}
		}
			System.out.println("The Second Maximum Element Is:"+secmax);
	}

	public void selection()
	{
		for(int i = 0; i < len; i++ )
		{
			int  min=a[i];
			int pos=i;
	    for(int j=i+1;j<len;j++)
	    {
	       if(min>a[j])
	       {
				min=a[j];
				pos =j;
	       }
	    }
			int temp=a[i];
			a[i]=a[pos];
	        a[pos]=temp;
	 }
			System.out.println("The Sorted array is");
	 for(int i=0;i<len;i++) 
	 {
			System.out.println("a["+i+"]="+a[i]);
	 }  
   }
   
	public void buble()
	{
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<len;i++)
			System.out.println("a["+i+"]="+a[i]);
	}
		
}
   
   		
class Test
{
	public static void main(String args[])
	{
		int ch;
		ArrayOpration ob = new ArrayOpration(); 
		Scanner sc = new Scanner(System.in);
		//int b=ob.lengt();
		//System.out.println("\tThe lenght of Array Is:"+b);
	do
	{
		System.out.println("\tPress 1 for Reverse The Array:\n\tPress 2 for Sum of Array Elements:");
		System.out.println("\tPress 3 for Maximum value in The Array:\n\tPress 4 for minium value in The Array::");
		System.out.println("\tPress 5 for Second Maximum In Array");
		System.out.println("\tPress 6 for Second Minimum In Array");
		System.out.println("\tPress 7 for Selection Sort inThe Array:");
		System.out.println("\tPress 8 for Bubble Sort in The Array:");
		System.out.println("\tPress 9 for Incersion Sort inThe Array:");
		System.out.println("\tPress 10 for EXIT:");
		System.out.println("Enter your Choice");
		ch = sc.nextInt();
		System.out.println("\tHow Many Elements Do You Want To Enter:");
		int k= sc.nextInt();
		ob.setData(k);
		ob.input();
		ob.output();
		switch(ch)
		{
			case 1:
					ob.reverse();
					break;
			case 2:
					ob.sum();
					break;
			case 3:
					ob.min();
					break;
			case 4:
					ob.max();
					break;
			case 5:
					ob.min();
					break;
			case 6:
					ob.secMax();
					break;
			case 7:
					ob.selection();
					break;
			case 8:
					ob.buble();
					break;		
		}
	}while(ch!=11);
									
	}
}
		
		
		
		
		
		
		
		
