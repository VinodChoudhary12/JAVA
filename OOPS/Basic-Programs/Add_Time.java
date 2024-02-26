class Time
{
	private int ho,min,sec;	
	public void setData(int ho,int min,int sec)
	{
		this.ho=ho;
		this.min=min;
		this.sec=sec;
	}
	public void show()
	{
		System.out.println("Hour: "+this.ho+" Minitues:"+this.min+" Seconds:"+this.sec);
	}
	public void addTime(Time t1,Time t2)
	{
		this.ho=t1.ho+t2.ho;
		this.min=t1.min+t2.min;
		this.sec=t1.sec+t2.sec;
		if(this.sec>59||this.min>59)
		{
			this.min+=this.sec/60;
			this.sec=this.sec%60;
			this.ho+=this.min/60;
			this.min=this.min%60;
		}
	
	}
	//second Type:
	//public void sum()
	//{
		//int total = k1.ho*3600+k1.min*60+k1.sec+k2.ho*3600+k2.min*60+k2.sec+;
		//this.ho=total/3600;
		//this.min=(total%3600)/60;
		//this.sec=(total%3600)%60;
	//}
}
class Test
{
	public static void main(String args[])
	{
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		t1.setData(23,498,23);
		t2.setData(43,444,2);
		t1.show();
		t2.show();
		System.out.println("Addition of Time IS:");
		t3.addTime(t1,t2);
		t3.show();
	}
}
	
	
	
	
	
	
	
	
