// Parent class
class Device 
{
    	String brand;

    	public Device(String brand) 
	{
        	this.brand = brand;
    	}

    	public void displayInfo() 
	{
        	System.out.println("Device : " + brand);
    	}
}

class  Speaker extends  Device 
{
    	String driverSize;

    	public Speaker(String brand, String driverSize) 
	{
        	super(brand);
        	this.driverSize = driverSize;
    	}

    	public void displayInfo() 
	{
        	super.displayInfo();
        	System.out.println("Driver Size: " + this.driverSize);
    	}
}

class Camera extends Device 
{
    	int pixelSize;
	String resolution;

    	public Camera(String relolution, int pixelSize, String brand) 
		{
        	super(brand);
        	this.pixelSize = pixelSize;
			this.resolution = resolution;
    	}

    	public void displayInfo() 
	{
        	super.displayInfo();
        	System.out.println("Pixel Size: " + this.pixelSize);
		System.out.println("Camera resolution: " + this.resolution);
    	}
}


class Main 
{
    	public static void main(String[] args) 
	{
        	Speaker ob = new Speaker("JBL","15.cm X 10.2cm");
        	Camera ob1 = new Camera("India", 150000000,"NIKON");
        	

        	System.out.println("\t\tDevice information:");
        	ob.displayInfo();
        	System.out.println();
        	ob1.displayInfo();
    }
}
