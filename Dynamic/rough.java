	
import java.util.Scanner;

class Test
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter physics number:   ");
int p = sc.nextInt(); 

System.out.println("Enter chemistry number:   "); 
int c = sc.nextInt(); 

System.out.println("Enter math number:   ");
int m = sc.nextInt(); 

System.out.println("Enter hindi number:   ");
int h = sc.nextInt();

System.out.println("Enter english number:   ");
int e = sc.nextInt();


if(p<33)	
{    
	if(c<33)
	{
		if(m<33)
		{
			
			if(h<33) 
			 {
				if(e<33) 
				{
					System.out.println("....Fail in all.....");
				}
				else
				{
					System.out.println("....Fail in four.....");
				}
			 }
			 else
			 {
				if(e<33) 
				{
					System.out.println("....Fail in four.....");
				}
				else
				{
					System.out.println("....Fail in three.....");
				}
			 }
			 
			 
			 
		}	
		else
		{
			if(h<33)
			{
				if(e<33)
				  System.out.println("....Fail in four.....");
			    else
				{
					System.out.println("....Fail in three.....");
				}
			}
			else
			{
				if(e<33)
					System.out.println("....Fail in three.....");
				else
				{
					System.out.println("....Fail in two.....");
				}
			}
		}
	}
	
	
	
	
	
   else
	{
	  if(m<33)
		{
			
			if(h<33) 
			 {
				if(e<33) 
				{
					System.out.println("....Fail in four.....");
				}
				else
				{
					System.out.println("....Fail in three.....");
				}
			 }
			 else
			 {
				if(e<33) 
				{
					System.out.println("....Fail in three.....");
				}
				else
				{
					System.out.println("....Fail in two.....");
				}
			 }
			 
			 
			 
		}	
		else
		{
			if(h<33)
			{
				if(e<33)
				  System.out.println("....Fail in three.....");
			    else
				{
					System.out.println("....Fail in tewo.....");
				}
			}
			else
			{
				if(e<33)
					System.out.println("....Fail in two.....");
				else
				{
					System.out.println("....Fail in one.....");
				}
			}
		}
	}  
    
    }
                       int Total=(p+c+m+e+h);
                              System.out.println("TOTAL NUMBER ARE" +Total);
}
	 

		
}	 	
