import java.util.Scanner;
abstract class Shape 
{
    public Shape() 
	{
        
    }

    //public abstract double area();

    //public abstract double perimeter();
}

abstract class OneD extends Shape
{
    public OneD() 
    {
        super();
    }

    public abstract double length();
}

abstract class TwoD extends Shape 
{
    public TwoD() 
    {

        super();
    }

    public abstract double area();

    public abstract double perimeter();
}

abstract class ThreeD extends Shape 
{
    public ThreeD() 
	{
        super();
    }

    public abstract double surfaceArea();

    public abstract double volume();
}

class Square extends TwoD 
{
    private double a;

    public Square(double a) 
    {
        super();
        this.a = a;
    }

    public double area()
	{
        return a * a;
    }

    public double perimeter()
	{
        return 4 * a;
    }
}

class Rectangle extends TwoD {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public double area() 
    {
        return length * width;
    }

    public double perimeter() 
    {
        return 2 * (length + width);
    }
}

class Triangle extends TwoD 
{
    private double base;
    private double height;

    public Triangle(double base, double height) 
	{
 
        super();
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }

    public double perimeter() {
        return 3 * base;
    }
}

class Circle extends TwoD {
    private double radius;

    public Circle(double radius) {
        // Constructor for the Circle class
        super();
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Cube extends ThreeD {
    private double a;

    public Cube(double a) {
        
        super();
        this.a = a;
    }

    public double surfaceArea() {
        return 6 * a * a;
    }

    public double volume() {
        return a * a * a;
    }
}

class Cylinder extends ThreeD {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        
        super();
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * 3.14 * radius * (radius + height);
    }

    public double volume() {
        return 3.14 * radius * radius * height;
    }
}

class Cone extends ThreeD {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        // Constructor for the Cone class
        super();
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea() {
        double baseArea = 3.14 * radius * radius;
        double aArea = 3.14 * radius * (radius + Math.sqrt(height * height + radius * radius));
        return baseArea + aArea;
    }

    public double volume() {
        return 3.14 * radius * radius * (height / 3);
    }
}

class Volume extends ThreeD 
{
    private double length;
    private double width;
    private double height;

    public Volume(double length, double width, double height) 
	{
        
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double surfaceArea() 
	{
        return 2 * (length * width + length * height + width * height);
    }

    public double volume() 
	{
        return length * width * height;
    }
}

 class Test 
 {
	
    public static void main(String[] args) 
	{
		 int d,ch,e,p,z,x,w;
		Scanner sc = new Scanner(System.in);
		System.out.println(" ___________________________________");
		System.out.println("|                                   |  
		System.out.println("|      Press 1 for 1D Shapes        |");
		System.out.println("|      Press 2 for 2D Shapes        |");
		System.out.println("|      Press 3 for 3D Shapes        |");
		System.out.println("|      Press 4 For Exit:            |");
		System.out.println("|__________________________________ |");
		System.out.println("Enter Your chioce In 1D We Dont Have Any Formula");
		System.out.println("Enter Your Choice: ");
		d = sc.nextInt();
		switch(d)
		{
			case 1:
					System.out.println("No Formula is Avaible in 1D:");
					break;
			
			case 2 ://Case 2 of Main Switch:
					System.out.println(" _______________________________");
					System.out.println("|                               |
					System.out.println("|     Press 1 for Area          |");
					System.out.println("|     Press 2 for Parameter     |");
					System.out.println("|_______________________________|");
					System.out.println("Enter Your choice");
					ch = sc.nextInt();
		switch(ch)
		{
			case 1:
					System.out.println(" _______________________________________");
					System.out.println("|                                       |");
					System.out.println("|     Press 1 for Area of Square:       |");
					System.out.println("|     Press 2 for Area of Ractangle     |");
					System.out.println("|     Press 3 for Area of Tringle       |");
					System.out.println("|     Press 4 for Area of Circle        |");
					System.out.println("|_______________________________________|");
					System.out.println("Enter Your choice");
					e= sc.nextInt();
		switch(e)
		{
			case 1:
					System.out.println("Enter The Side");
					int a = sc.nextInt();
					Square s= new Square(a);
					System.out.println("Square area: " + s.area());
					break;
			case 2:
					System.out.println("Enter The length");
					a=sc.nextInt();
					System.out.println("Enter The Wirth");
					int b=sc.nextInt();
					Rectangle r = new Rectangle(a, b);
					System.out.println("Rectangle area: " + r.area());
					break;
			case 3:
					System.out.println("Enter The Base");
					a=sc.nextInt();
					System.out.println("Enter The Hieght");
					b=sc.nextInt();
					Triangle t = new Triangle(a,b);
					System.out.println("Triangle area: " + t.area());
					break;
			case 4:
					System.out.println("Enter The Radius");
					a=sc.nextInt();
					Circle c = new Circle(a);
					System.out.println("Circle area: " + c.area());
					break;
							
		}
					break;
			case 2://Case 2 of 2D Shape
					System.out.println(" ________________________________________________");
					System.out.println("|                                                |");  
					System.out.println("|        Press 1 for Perameter  of Square:       |");
					System.out.println("|        Press 2 for Perameter  of Ractangle     |");
					System.out.println("|        Press 3 for Perameter  of Tringle       |");
					System.out.println("|        Press 4 for Perameter  of Circle        |");
					System.out.println("|________________________________________________|");
					System.out.println("Enter Your choice");
					p= sc.nextInt();
		switch(p)
		{
			case 1:
					System.out.println("Enter The Side");
					int a = sc.nextInt();
					Square s= new Square(a);
					System.out.println("Square perimeter: " + s.perimeter());
					break;
			case 2:
					System.out.println("Enter The length");
					a=sc.nextInt();
					System.out.println("Enter The Wirth");
					int b=sc.nextInt();
					Rectangle r = new Rectangle(a, b);
					System.out.println("Rectangle perimeter: "+r.perimeter());
					break;
			case 3:
					System.out.println("Enter The Base");
					a=sc.nextInt();
					System.out.println("Enter The Hieght");
					b=sc.nextInt();
					Triangle t = new Triangle(a,b);
					System.out.println("Triangle perimeter: " + t.perimeter());
					break;
			case 4:
					System.out.println("Enter The Radius");
					a=sc.nextInt();
					Circle c = new Circle(a);
					System.out.println("Circle circumference: " + c.perimeter());
					break;		
		}		
		}
					break;	
			case 3://Case 3 of Main Switch>>>>>>>>>>>>>
			
					System.out.println(" _______________________________________");
					System.out.println("|                                       |");
					System.out.println("|       Press 1 for Surface Area        |");
					System.out.println("|       Press 2 for Volume              |");
					System.out.println("|_______________________________________|");
					System.out.println("Enter your Choice:");
					z = sc.nextInt();
		switch(z)
		{
			case 1:
				System.out.println(" _______________________________________________");
				System.out.println("|                                               |");
				System.out.println("|       Press 1 for Surface Area of Cube:       |");
				System.out.println("|       Press 2 for Surface Area of Cylinder    |");
				System.out.println("|       Press 3 for Surface Area of Cone        |");
				System.out.println("|       Press 4 for Surface Area of Volume      |");
				System.out.println("|_______________________________________________|");
				System.out.println("Enter Your choice");
				x=sc.nextInt();
				switch(x)
				{
								case 1:
										System.out.println("Enter The Edge");
										int a = sc.nextInt();
										Cube cube = new Cube(a);
										System.out.println("Cube surface area: " + cube.surfaceArea());
										break;
								case 2:
										System.out.println("Enter The Radius ");
										a=sc.nextInt();
										System.out.println("Enter The Hieght");
										int b=sc.nextInt();
										Cylinder cy = new Cylinder(a, b);
										System.out.println("Cylinder surface area: " + cy.surfaceArea());
										break;
								case 3:
										System.out.println("Enter The Radius ");
										a=sc.nextInt();
										System.out.println("Enter The Hieght");
										b=sc.nextInt();
										Cone co = new Cone(a,b);
										System.out.println("Cone surface area: " + co.surfaceArea());
										break;
								case 4:
										System.out.println("Enter The Whirth");
										a=sc.nextInt();
										System.out.println("Enter The Hieght");
										b=sc.nextInt();
										System.out.println("Enter The Lenght");
										int len = sc.nextInt();
										Volume vo = new Volume(a, b, len);
										System.out.println("Volume surface area: " + vo.surfaceArea());
										
				}
							break;
						case 2:
								System.out.println(" __________________________________________");
								System.out.println("|                                          |");
								System.out.println("|      Press 1 for Volume of Cube:         |");
								System.out.println("|      Press 2 for Volume of Cylinder      |");
								System.out.println("|      Press 3 for Volume of Cone          |");
								System.out.println("|      Press 4 for Volume of Volume        |");
								System.out.println("|__________________________________________|");
								System.out.println("Enter Your choice");
								w=sc.nextInt();
								switch(w)
								{
									case 1:
											System.out.println("Enter The Edge");
											int a = sc.nextInt();
											Cube cube = new Cube(a);
											System.out.println("Cube volume: " + cube.volume());
											break;
										
									case 2:
											System.out.println("Enter The Hieght ");
											a=sc.nextInt();
											System.out.println("Enter The Radius");
											int b=sc.nextInt();
											Cylinder cy = new Cylinder(a, b);
											System.out.println("Cylinder volume: " + cy.volume());
											break;
									case 3:
											System.out.println("Enter The Radius ");
											a=sc.nextInt();
											System.out.println("Enter The Hieght");
											b=sc.nextInt();
											Cone co = new Cone(a,b);
											System.out.println("Cone volume: " + co.volume());
											break;
									case 4:
											System.out.println("Enter The Whirth");
											a=sc.nextInt();
											System.out.println("Enter The Hieght");
											b=sc.nextInt();
											System.out.println("Enter The Lenght");
											int len = sc.nextInt();
											Volume vo = new Volume(a, b, len);
											System.out.println("Volume: " + vo.volume());
											break;
								}																																																																																																																																																								
							case 4:
									System.exit(0);
									break;				
		}
					
	 
		
		
		
		
       
    }
 }

