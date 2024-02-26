
class Building 
{
    	String type;

    	public Building(String type) 
	{
        	this.type = type;
    	}

    	public void displayInfo() 
	{
        	System.out.println("Building Type: " + type);
    	}
}
class House extends Building 
{
    	int numberOfRooms;

    	public House(String type, int numberOfRooms) 
		{
        	super(type);
        	this.numberOfRooms = numberOfRooms;
    	}

    	public void displayInfo() 
	{
        	super.displayInfo();
        	System.out.println("Number of Rooms: " + numberOfRooms);
    	}
}
class Office extends Building 
{
    	String companyName;

    	public Office(String type, String companyName) 
	{
        	super(type);
        	this.companyName = companyName;
    	}

    	public void displayInfo() 
	{
        	super.displayInfo();
        	System.out.println("Company Name: " + companyName);
    	}
}
class Test 
{
    	public static void main(String[] args) 
	{
        	House ob = new House("Residential", 3);
        	Office ob1 = new Office("Commercial", "Infobeans");
        
	        System.out.println("Building Information:");
        	ob.displayInfo();
        	System.out.println();
        	ob1.displayInfo();
    	}
}
