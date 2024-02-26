import java .util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println ("ENTER RAM AGE");
	 int ram=sc.nextInt();
	System.out.println ("ENTER MOHAN AGE");
	 int mohan=sc.nextInt();
	System.out.println ("ENTER KAMAL AGE");
	 int kamal=sc.nextInt();
	System.out.println ("ENTER RAJ AGE");
	 int raj=sc.nextInt();

	if((ram>raj)&&(ram>mohan)&&(ram>kamal))
        	System.out.println ("Ram's Age is Greater"); 
	else if((mohan>raj)&&(mohan>ram)&&(mohan>kamal))
        	System.out.println ("Mohan's Age is Greater");
	else if((raj>ram)&&(raj>mohan)&&(raj>kamal))
        	System.out.println ("Raj's Age is Greater");
	//if((kamal>raj)&&(kamal>mohan)&&(kamal>ram))	
	else 
        	System.out.println ("Kamal's Age is Greater");

 }       
 }
 
 
