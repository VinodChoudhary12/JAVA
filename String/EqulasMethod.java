public class EqulasMethod
{
	public static void main(String []args)
	{
		EqulasMethod ob = new EqulasMethod();
		System.out.println(ob.equal());
	}	
	public boolean equal()
	{
		String s1 = new String("poorvi");
		String s2 = "poorvi";
		int count=0;
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s2.length();i++)
				{
					if(s1.charAt(i)==s2.charAt(i))
					count++;
				}
		}
		else
			System.out.println("Both are diffrent ");
		
		
		if(count==s1.length())
		return true;			
		else
		return false;
	}
	
}