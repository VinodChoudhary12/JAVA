class Teacher
{
  	public void teach()
    	{
     		System.out.println("Teacher is teaching");
    	}
 	public void takeAttendance()
    	{
     		System.out.println("Teacher is taking attendance");
     	}
}

class Physics extends Teacher
{
  	public void doProject()
   	{
    		System.out.println("Physics teacher is doing project");
   	}
}

class Chemistry extends Teacher
{
   	public void doProject()
   	{
     		System.out.println("Chemistry project is happening");
   	}
}

class Test
{
 	public static void main(String [] args)
    	{
    		Physics pt = new Physics();
    		pt.teach();
    		pt.takeAttendance();
    		pt.doProject();
    	}
}
