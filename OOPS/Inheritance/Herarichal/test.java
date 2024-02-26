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
	int a;
    public TwoD(int a) 
    {

        this.a=a;
    }

    public abstract double area();

    public abstract double perimeter();
}

abstract class ThreeD extends Shape 
{
	protected int a;
    public ThreeD(int a) 
	{
       this.a=a;
    }

    public abstract double surfaceArea();

    public abstract double volume();
}

class Square extends TwoD 
{


    public Square(int  a) 
    {
        super(a);
        //super.a = a;
    }

    public double area()
	{
        return super.a * super.a;
    }

    public double perimeter()
	{
        return 4 * super.a;
    }
}

class Rectangle extends TwoD {
    //private double length;
    private int width;

    public Rectangle(int length, int width) {
        //super(a);
        super.a = a;
        this.width = width;
    }

    public double area() 
    {
        return super.a * width;
    }

    public double perimeter() 
    {
        return 2 * (super.a + width);
    }
}

class Triangle extends TwoD 
{
    //private double base;
    private double height;

    public Triangle(int a, int height) 
	{
 
        super(a);
        //super.a = a;
        this.height = height;
    }

    public double area() {
        return 0.5 * super.a * height;
    }

    public double perimeter() {
        return 3 * super.a;
    }
}

class Circle extends TwoD {
    //private double radius;

    public Circle(int a) {
        // Constructor for the Circle class
        super(a);
        //super.a = a;
    }

    public double area() {
        return 3.14 * super.a * super.a;
    }

    public double perimeter() {
        return 2 * 3.14 * super.a;
    }
}

class Cube extends ThreeD {
    //private double a;

    public Cube(int a) {
        
        super(a);
        //super.a = a;
    }

    public double surfaceArea() {
        return 6 * super.a * super.a;
    }

    public double volume() {
        return super.a * super.a * super.a;
    }
}

class Cylinder extends ThreeD {
    //private double radius;
    private int height;

    public Cylinder(int a, int height) {
        
        super(a);
        //super.radius = radius;
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * 3.14 * super.a * (super.a + height);
    }

    public double volume() {
        return 3.14 * super.a * super.a * height;
    }
}

class Cone extends ThreeD {
    //private double radius;
    private int height;

    public Cone(int a, int height) {
        // Constructor for the Cone class
        super(a);
        //super.a = a;
        this.height = height;
    }

    public double surfaceArea() {
        double baseArea = 3.14 * super.a * super.a;
        double aArea = 3.14 * super.a * (super.a + Math.sqrt(height * height + super.a * super.a));
        return baseArea + aArea;
    }

    public double volume() {
        return 3.14 * super.a * super.a * (height / 3);
    }
}

class Volume extends ThreeD 
{
    //private double length;
	
    private double width;
    private double height;

    public Volume(int a, int width, int  height) 
	{
        
        super(a);
		//super.a=a;
        this.width = width;
        this.height = height;
    }

    public double surfaceArea() 
	{
        return 2 * (super.a* width + super.a * height + width * height);
    }

    public double volume() 
	{
        return super.a * width * height;
    }
}

 class Test 
 {
	
    public static void main(String[] args) 
	{
	    
		int d;
		do
		{
	  
			int ch,e,p,z,x,w;
			Scanner sc = new Scanner(System.in);
			System.out.println("\t_________________________________________________________________________");
			System.out.println("\t|\t    <<<<<<<<<<<<<<<                          	                 |");
			System.out.println("\t|\t << YOUR CHOICE ARE >>                    	                 |");
			System.out.println("\t|\t    >>>>>>>>>>>>>>>                            		         |");
			System.out.println("\t|\t                                                                 |");
			System.out.println("\t|\t|***********************|   :  |***********************|         |");
			System.out.println("\t|\t| Press 1.for 1D Shapes |   :  | Press 2 for 2D Shapes |         |");
			System.out.println("\t|\t|***********************|   :  |***********************|         |");
			System.out.println("\t|\t                                                                 |");
			System.out.println("\t|\t|***********************|   :  |*************************|       |");                        
			System.out.println("\t|\t| Press 3 for 3D Shapes |   :  | Press 4 for Exit (<-)|  |       |");                         
			System.out.println("\t|\t|***********************|   :  |*************************|       |");
			System.out.println("\t|\t                                                                 |");
			System.out.println("\t|\t                              		   >>>>>>>>>>>>>>>>>     |");
			System.out.println("\t|\t                              		<< ENTER YOUR CHOICE >>  |");
			System.out.println("\t|\t                                 	   <<<<<<<<<<<<<<<<<     |");
			System.out.println("\t|________________________________________________________________________|");	
			d = sc.nextInt();
			switch(d)
			{
				case 1:
					System.out.println("No Formula is Avaible in 1D:");
					break;
			
				case 2 ://Case 2 of Main Switch:
					
					do
					{
						System.out.println("\t___________________________________________________________________");
						System.out.println("\t|\t    <<<<<<<<<<<<<<<                          	           |");
						System.out.println("\t|\t << YOUR CHOICE ARE >>                    	           |");
						System.out.println("\t|\t    >>>>>>>>>>>>>>>                         	           |");
						System.out.println("\t|\t                                                           |");
						System.out.println("\t|\t|******************|    : |***********************|        |");
						System.out.println("\t|\t| Press 1 for Area |    : | Press 2 for Parameter |        |");
						System.out.println("\t|\t|******************|    : |***********************|        |");
						System.out.println("\t|\t                                                           |");
						System.out.println("\t|\t|*********************| : |*************************|      |");                         
						System.out.println("\t|\t|Press 3 for Exit (<-)| : | Press 4 for Continue(..)|      |");                         
						System.out.println("\t|\t|*********************| : |*************************|      |");
						System.out.println("\t|\t                                                           |");
						System.out.println("\t|\t                                 >>>>>>>>>>>>>>>>>         |");
						System.out.println("\t|\t                              << ENTER YOUR CHOICE >>      |");
						System.out.println("\t|\t                                 <<<<<<<<<<<<<<<<<         |");
						System.out.println("\t|__________________________________________________________________|");
						ch = sc.nextInt();
						switch(ch)
						{
							case 1:
							    								
							System.out.println("\t_____________________________________________________________________________________");
							System.out.println("\t|\t    <<<<<<<<<<<<<<<                          	                             |");
							System.out.println("\t|\t << YOUR CHOICE ARE >>                    	                             |");
							System.out.println("\t|\t    >>>>>>>>>>>>>>>                            		      	   	     |");
							System.out.println("\t|\t                                                       		             |");
							System.out.println("\t|\t|****************************|    :  |*******************************|       |");
							System.out.println("\t|\t| Press 1 for Area of Square |    :  | Press 2 for Area of Ractangle |       |");
							System.out.println("\t|\t|****************************|    :  |*******************************|       |");
							System.out.println("\t|\t      _________                              ____________________            |");
							System.out.println("\t|\t     |         |                            |                    |           |");
							System.out.println("\t|\t     |         |                            |                    |           |");
							System.out.println("\t|\t     | SQUARE  |                            |      RECTANGLE     |           |");
							System.out.println("\t|\t     |         |                            |                    |           |");
							System.out.println("\t|\t     |_________|                            |____________________|           |");
							System.out.println("\t|\t                                                                             |");
							System.out.println("\t|\t                                                                             |");
							System.out.println("\t|\t                                                                             |");
							System.out.println("\t|\t|*****************************|   :  |*******************************|       |");                          
							System.out.println("\t|\t| Press 3 for Area of Tringle |   :  |  Press 4 for Area of Circle   |       |");                         
							System.out.println("\t|\t|*****************************|   :  |*******************************|       |");
							System.out.println("\t|\t             *                                                               |");
							System.out.println("\t|\t            * *                                                              |");
							System.out.println("\t|\t           *   *                                  * * *  *                   |");
							System.out.println("\t|\t          *     *                               *          *                 |");
							System.out.println("\t|\t         *       *                              *  CIRCLE  *                 |");
							System.out.println("\t|\t        *         *                              *        *                  |");
							System.out.println("\t|\t       * TRIANGLE  *                               * * * *                   |");
							System.out.println("\t|\t      *_____________*              		                             |");
							System.out.println("\t|\t                    		                                             |");
							System.out.println("\t|\t                    		                                             |");
							System.out.println("\t|\t|***************************|     :  |*******************************|       |");
							System.out.println("\t|\t|   Press 5 for Exit (<-)   |     :  |   Press 6 for Continue(....)  |       |");
							System.out.println("\t|\t|***************************|     :  |*******************************|       |");
							System.out.println("\t|\t                    		                                             |");
							System.out.println("\t|\t                    		                                             |");
							System.out.println("\t|\t                                		   >>>>>>>>>>>>>>>>>         |");
							System.out.println("\t|\t                              		        << ENTER YOUR CHOICE >>      |");
							System.out.println("\t|\t                                 	           <<<<<<<<<<<<<<<<<         |");
							System.out.println("\t|____________________________________________________________________________________|");				
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
										
                                        case 5:	System.exit(0);									
										
										case 6: continue;
                                              										
									}
							        break;
					 	 	case 2://Case 2 of 2D Shape
								
								
						    System.out.println("\t______________________________________________________________________________________________");
							System.out.println("\t|\t    <<<<<<<<<<<<<<<                          	                                     |");
							System.out.println("\t|\t << YOUR CHOICE ARE >>                    	                       		     |");
							System.out.println("\t|\t    >>>>>>>>>>>>>>>                            		      	   		     |");
							System.out.println("\t|\t                                                       		 		     |");
							System.out.println("\t|\t|*********************************|    :  |************************************|     |");
							System.out.println("\t|\t| Press 1 for PERIMETER of Square |    :  | Press 2 for PERIMETER of Ractangle |     |");
							System.out.println("\t|\t|*********************************|    :  |************************************|     |");
							System.out.println("\t|\t      _________                                    ____________________              |");
							System.out.println("\t|\t     |         |                                  |                    |             |");
							System.out.println("\t|\t     |         |                                  |                    |             |");
							System.out.println("\t|\t     | SQUARE  |                                  |      RECTANGLE     |             |");
							System.out.println("\t|\t     |         |                                  |                    |             |");
							System.out.println("\t|\t     |_________|                                  |____________________|             |");
							System.out.println("\t|\t                                                                                     |");
							System.out.println("\t|\t                                                                                     |");
							System.out.println("\t|\t                                                                                     |");
							System.out.println("\t|\t|**********************************|        :  |*********************************|   |");                          
							System.out.println("\t|\t| Press 3 for PERIMETER of Tringle |        :  | Press 4 for PERIMETER of Circle |   |");                         
							System.out.println("\t|\t|**********************************|        :  |*********************************|   |");
							System.out.println("\t|\t             *                                                                       |");
							System.out.println("\t|\t            * *                                        *  *  *                       |");
							System.out.println("\t|\t           *   *                                     *          *                    |");
							System.out.println("\t|\t          *     *                                  *             *                   |");
							System.out.println("\t|\t         *       *                                 *   Circle     *                  |");
							System.out.println("\t|\t        *         *                                 *            *                   |");
							System.out.println("\t|\t       * TRIANGLE  *                                  *         *                    |");
							System.out.println("\t|\t      *_____________*                  	       	       *  *  *                       |");
							System.out.println("\t|\t                    		                                                     |");
							System.out.println("\t|\t                    		                                                     |");
							System.out.println("\t|\t|***************************|          :  |*******************************|          |");
							System.out.println("\t|\t|   Press 5 for Exit (<-)   |          :  |   Press 6 for Continue(....)  |          |");
							System.out.println("\t|\t|***************************|          :  |*******************************|          |");
							System.out.println("\t|\t                    		                                                     |");
							System.out.println("\t|\t                    		                                                     |");
							System.out.println("\t|\t                                		   >>>>>>>>>>>>>>>>>                 |");
							System.out.println("\t|\t                              		        << ENTER YOUR CHOICE >>              |");
							System.out.println("\t|\t                                 	           <<<<<<<<<<<<<<<<<                 |");
							System.out.println("\t|____________________________________________________________________________________________|");				
							
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

									    case 5: System.exit(0);

										case 6: continue;
									}
                                    break;								
							
							case 3: System.exit(0); 	
							
						}	
						
					}while(ch!=4);
					break;
					
				case 3://Case 3 of Main Switch>>>>>>>>>>>>>
	               	do
					{
						System.out.println("\t__________________________________________________________________________");
						System.out.println("\t|\t    <<<<<<<<<<<<<<<                          	                  |");
						System.out.println("\t|\t << YOUR CHOICE ARE >>                    	                  |");
						System.out.println("\t|\t    >>>>>>>>>>>>>>>                            		          |");
						System.out.println("\t|\t                                                                  |");
						System.out.println("\t|\t|**************************|   :  |*************************|     |");
						System.out.println("\t|\t| Press 1.for Surface Area |   :  |   Press 2 for Volume    |     |");
						System.out.println("\t|\t|**************************|   :  |*************************|     |");
						System.out.println("\t|\t                                                                  |");
						System.out.println("\t|\t|***********************|      :  |*************************|     |");               
						System.out.println("\t|\t| Press 3 for Exit (<-) |      :  | Press 4 for Continue(..)|     |");
						System.out.println("\t|\t|***********************|      :  |*************************|     |");
						System.out.println("\t|\t                                                                  |");
						System.out.println("\t|\t                              		   >>>>>>>>>>>>>>>>>      |");
						System.out.println("\t|\t                              		<< ENTER YOUR CHOICE >>   |");
						System.out.println("\t|\t                                 	   <<<<<<<<<<<<<<<<<      |");
						System.out.println("\t|_________________________________________________________________________|");	
						z = sc.nextInt();
						switch(z)
						{
							case 1:
							
                            System.out.println("\t_________________________________________________________________________________________________________");
							System.out.println("\t|\t    <<<<<<<<<<<<<<<                          	                                                 |");
							System.out.println("\t|\t << YOUR CHOICE ARE >>                    	                       		                 |");
							System.out.println("\t|\t    >>>>>>>>>>>>>>>                            		      	   		                 |");
							System.out.println("\t|\t                                                       		 		                 |");
							System.out.println("\t|\t|**********************************|    :          |**************************************|      |");
							System.out.println("\t|\t| Press 1 for Surface of Cube      |    :          | Press 2 for Surface of Cylinder      |      |");
							System.out.println("\t|\t|**********************************|    :          |**************************************|      |");
							System.out.println("\t|\t                                                              ___________                        |");
							System.out.println("\t|\t              __________                                     (           )                       |");
							System.out.println("\t|\t             /*        *|                                    |***********|                       |");
							System.out.println("\t|\t            /__*______*_|                                    |           |                       |");
							System.out.println("\t|\t            |   |    |  |                                    | cylinder  |                       |");
							System.out.println("\t|\t            |   |cube|  |                                    |           |                       |");
							System.out.println("\t|\t            |___|____|__|                                    (***********)                       |");
							System.out.println("\t|\t                                                              ***********                        |");
							System.out.println("\t|\t                                                                                                 |");
					     	System.out.println("\t|\t                                                                                                 |");
							System.out.println("\t|\t                                                                                                 |");
							System.out.println("\t|\t|**********************************|         :     |***************************************|     |");                          
							System.out.println("\t|\t| Press 3 for Surface of Cone      |         :     |  Press 4 for Surface of Volume        |     |");                         
							System.out.println("\t|\t|**********************************|         :     |***************************************|     |");
							System.out.println("\t|\t                  *                                                                              |");
							System.out.println("\t|\t                 * *                                             *             *                 |");
							System.out.println("\t|\t                *   *                                             *           *                  |");
							System.out.println("\t|\t               *     *                                             * volume  *                   |");
							System.out.println("\t|\t              * cone  *                                             *       *                    |");
							System.out.println("\t|\t             *         *                                             *     *                     |");
							System.out.println("\t|\t            (***********)                                             *   *                      |");
							System.out.println("\t|\t            (___________)     		                               * *                       |");
							System.out.println("\t|\t                    		                                        *                        |");
							System.out.println("\t|\t                    		                                                                 |");
							System.out.println("\t|\t|*********************************|          :     |*******************************|             |");
							System.out.println("\t|\t|   Press 5 for Exit (<-)         |          :     |   Press 6 for Continue(....)  |             |");
							System.out.println("\t|\t|*********************************|          :     |*******************************|             |");
							System.out.println("\t|\t                    		                                                                 |");
							System.out.println("\t|\t                    		                                                                 |");
							System.out.println("\t|\t                                		                      >>>>>>>>>>>>>>>>>          |");
							System.out.println("\t|\t                              		                           << ENTER YOUR CHOICE >>       |");
							System.out.println("\t|\t                                 	                              <<<<<<<<<<<<<<<<<          |");
							System.out.println("\t|________________________________________________________________________________________________________|");							
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
								
										case 5: System.exit(0);								
									
										case 6: continue;
									}
								
					
							break;
						case 2:
			                    			
								
							System.out.println("\t_________________________________________________________________________________________________________");
							System.out.println("\t|\t    <<<<<<<<<<<<<<<                          	                                                 |");
							System.out.println("\t|\t << YOUR CHOICE ARE >>                    	                       		                 |");
							System.out.println("\t|\t    >>>>>>>>>>>>>>>                            		      	   		                 |");
							System.out.println("\t|\t                                                       		 		                 |");
							System.out.println("\t|\t|**********************************|    :          |**************************************|      |");
							System.out.println("\t|\t| Press 1 for Volume of Cube       |    :          | Press 2 for Volume of Cylinder       |      |");
							System.out.println("\t|\t|**********************************|    :          |**************************************|      |");
							System.out.println("\t|\t                                                              ___________                        |");
							System.out.println("\t|\t              __________                                     (           )                       |");
							System.out.println("\t|\t             **        *|                                    |***********|                       |");
							System.out.println("\t|\t            *__*______*_|                                    |           |                       |");
							System.out.println("\t|\t            |   |    |  |                                    | cylinder  |                       |");
							System.out.println("\t|\t            |   |cube|  |                                    |           |                       |");
							System.out.println("\t|\t            |___|____|__|                                    (***********)                       |");
							System.out.println("\t|\t                                                              ***********                        |");
							System.out.println("\t|\t                                                                                                 |");
					     	System.out.println("\t|\t                                                                                                 |");
							System.out.println("\t|\t                                                                                                 |");
							System.out.println("\t|\t|**********************************|         :     |***************************************|     |");                          
							System.out.println("\t|\t| Press 3 for Volume of Cone       |         :     |  Press 4 for Volume of Volume         |     |");                         
							System.out.println("\t|\t|**********************************|         :     |***************************************|     |");
							System.out.println("\t|\t                  *                                                                              |");
							System.out.println("\t|\t                 * *                                              *             *                |");
							System.out.println("\t|\t                *   *                                              *           *                 |");
							System.out.println("\t|\t               *     *                                              * volume  *                  |");
							System.out.println("\t|\t              * cone  *                                              *       *                   |");
							System.out.println("\t|\t             *         *                                              *     *                    |");
							System.out.println("\t|\t            (***********)                                              *   *                     |");
							System.out.println("\t|\t            (___________)     		                                * *                      |");
							System.out.println("\t|\t                    		                                         *                       |");
							System.out.println("\t|\t                    		                                                                 |");
							System.out.println("\t|\t|*********************************|          :     |*******************************|             |");
							System.out.println("\t|\t|   Press 5 for Exit (<-)         |          :     |   Press 6 for Continue(....)  |             |");
							System.out.println("\t|\t|*********************************|          :     |*******************************|             |");
							System.out.println("\t|\t                    		                                                                 |");
							System.out.println("\t|\t                    		                                                                 |");
							System.out.println("\t|\t                                		                      >>>>>>>>>>>>>>>>>          |");
							System.out.println("\t|\t                              		                           << ENTER YOUR CHOICE >>       |");
							System.out.println("\t|\t                                 	                              <<<<<<<<<<<<<<<<<          |");
							System.out.println("\t|________________________________________________________________________________________________________|");				
							
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
												
										case 5: System.exit(0);
						
										case 6: continue;
										
									}
									break;
								
							case 3: System.exit(0); 								
	                    }
					}while(z!=4);
                    break;					
		case 4:
				System.exit(0);
						
		    }			
						
		}while(d!=5);	
		
       
    }
}