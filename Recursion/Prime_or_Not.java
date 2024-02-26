//Prime or not
//2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 .
class Test
{
	int i=2;	  	
	public  boolean prime(int n,int i)
	{
		
		if(n==i){
		System.out.println("The Number is  Prime");
		return true;}
		
		else 
		{
			if(n%i==0||n==1){
			System.out.println("The Number is Not Prime");
				return false;}
			else 	
				return prime(n,i+1);	
		}
	}	
	public static void main(String args [])	
	{
		Test ob = new Test();
		System.out.println(ob.prime(15,2));
	
	}	
		
	
	
	
	
	}
