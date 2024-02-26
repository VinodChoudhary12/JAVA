class Test {

    public static void main(String[] args) 
	{
        int hours=0;
        int minutes=0;
        int seconds=0;

        while(true) 
		{
			System.out.print(hours+":"+minutes+":"+seconds);
			System.out.flush();
            try 
			{
				Thread.sleep(1000);
			} 
			catch(InterruptedException e) 
			{
				e.printStackTrace();
			}
				seconds++;				
				if(seconds == 60) 
				{
					seconds = 0;
					minutes++;
				}
				if (minutes == 60) 
				{
					minutes = 0;
					hours++;
				}
				if (hours == 24) 
				{
					hours = 0;
				}
				System.out.print("\r");
        }
    }

}