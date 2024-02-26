import java .util.Scanner;
class Test
{
	public static void main(String args[])
	{

		Test ob = new Test();
		ob.age(45,63,78,48);
	}

	public void age(int ram,int mohan,int raj,int kamal)
	{
		if((ram>raj)&&(ram>mohan)&&(ram>kamal))
        		System.out.println ("Ram's Age is Greater"); 
        		
		else if((mohan>raj)&&(mohan>ram)&&(mohan>kamal))
        		System.out.println ("Mohan's Age is Greater");
        		
		else if((raj>ram)&&(raj>mohan)&&(raj>kamal))
        		System.out.println ("Raj's Age is Greater");
        		 
		else 
        		System.out.println ("Kamal's Age is Greater");
        		
        		

 	}       
 }
 
 
