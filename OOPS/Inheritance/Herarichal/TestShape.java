import java.util.Scanner;
abstract class Shape 
{
	private double a;
	//Private String name;
    public Shape(double a) 
	{
        this.a=a;
        
    }
    public abstract double area();
    public double getA()
    {
        return a;
    }

}

abstract class TwoD extends Shape 
{
    public TwoD(double a) 
    {

        super(a);
    }
	public abstract double perimeter();
    
}



abstract class OneSide extends TwoD
{
    public OneSide(double a)
    {
        super(a);
    }
     public abstract double area();
    public abstract double perimeter();

}

class Square extends OneSide
{
    public Square(double a) 
    {
        super(a);
    }

    public double area()
	{
        return super.getA() * super.getA();
    }

    public double perimeter()
	{
        return 4 * getA();
    }
}           

class EquilateralTriangle extends OneSide
{
    public EquilateralTriangle(double a)
    {
        super(a);
    }
    public double area()
    {
        //(√3/4)a²
        return (1.732/4)*super.getA()*super.getA();
    }
    public double perimeter()
    {
        return 3*super.getA();
    }
    
}
class Circle extends OneSide 
{

    public Circle(double a) 
    {
        // Constructor for the Circle class
        super(a);
    }

    public double area() {
        return 3.14 * super.getA() * super.getA();
    }

    public double perimeter() {
        return 2 * 3.14 * super.getA();
    }
}
class Hexagone extends OneSide
{
    public Hexagone(double a)
    {
        super(a);
    }
    public double area()
    {
        
        return ((3*1.732)/2)*super.getA()*super.getA();
    }
    public double perimeter()
    {
        return 6*super.getA();
    }

}
//_______________________________________________________________________________________________________________________________________________
 abstract class Twoside extends TwoD
{
    private double b;
    public Twoside(double a,double b)
    {
        super(a);
        this.b=b;  
    }
    public double getB()
    {
        return this.b;
    }
}
class isosceles extends Twoside
{
    public isosceles(double a,double b)
    {
        super(a,b);
    }
    public double area()
    {
        return (super.getA()*super.getB())/2;
    }
    public double perimeter()
    {
        return 2*super.getA()+super.getB();
    }
}
class Rectangle extends Twoside 
{
    public Rectangle(double a, double b) {
        super(a,b);
        
    }
    public double area() 
    {
        return super.getA() * super.getB();
    }

    public double perimeter() 
    {
        return 2 * (super.getA() + super.getB());
    }
}
class RightTringle extends Twoside
{
    public RightTringle(double a,double b)
    {
        super(a,b);
    }
    public double area()
    {
        return (super.getA()*super.getB())/2;
    }
    public double perimeter()
    {
       // a+b+Square Root of a +Square Root ob B
       //return super.getA()+super.getB()+Math.Sqrt(super.getA()*super.getA())+math.Sqrt(super.getB()*super.getB());
        return 1.0;
    }
}
class Pallerogram extends Twoside
{
    public Pallerogram(double a,double b)
    {
        super(a, b);
    }
    public double area()
    {
        return super.getA()*super.getB();
    }
    public double perimeter() 
    {
        return 2 * (super.getA() + super.getA());
    }
}
class Rombus extends Twoside
{
    public Rombus(double a, double b)
    {
        super(a, b);
    }
    public double area()
    {
        return (super.getA()*super.getB())/2;
    }
    public  double perimeter()
    {
        return 4*super.getA();
    }
}

abstract class ThreeSide extends TwoD
{
    private double d;
    private double c;
    public ThreeSide(double a,double d,double c)
    {
        super(a);
        this.d=d;
        this.c=c;
    }
    public double getC()
    {
        return this.c;
    }
    public double getD()
    {
        return this.d;
    }

}

class Trapezium  extends ThreeSide
{
   public Trapezium (double a,double d,double c)
    {
       super(a, d, c);
    }
    public double area()
    {
       return (super.getA()+super.getD()/2)*super.getC();
    }
   public double perimeter()
    {
       return super.getA();
    }

}

class ScaleneTringle extends ThreeSide
{
    
    public ScaleneTringle(double a,double d,double c)
    {
        super(a,d,c);
    }
    
    public double area()
    {
        return (getA()*getD())/2;
    }
    public double perimeter()
    {
        return getA()+getD()+getC();
    }
    
}
abstract class ThreeD extends Shape 
{
    public ThreeD(double a) 
	{
        super(a);
    }

    public abstract double area();

    public abstract double volume();
}
abstract class OneS extends ThreeD
{
    public OneS(double a)
    {
        super(a);
    }
     public abstract double  area();
    public abstract double volume();

}
class Cube extends OneS
{
    public Cube(double a)
    {
        super(a);
    }
    public double  area()
    {
        return 6*getA()*getA();
    }
    public double volume()
    {
        return getA()*getA()*getA();
    }
    
}
class Sphere extends OneS
{
    public Sphere(double a)
    {
        super(a);
    }
    public double  area()
    {
        return 4*3.14*getA()*getA();
    }
    public double volume()
    {
        return 4/3*(3.14*getA()*getA()*getA());
    }
    
}
class HemiSphere extends OneS
{
    public HemiSphere(double a)
    {
        super(a);
    }
    public double  area()
    {
        return 3*3.14*getA()*getA();
    }
    public double CurvedArea()
    {
        return 2*3.14*getA()*getA();
    }
    public double volume()
    {
        return 2/3*(3.14*getA()*getA()*getA());
    }
    
}
abstract class TwoS extends ThreeD
{
    private double e;
    public TwoS(double a,double e)
    {
        super(a);
        this.e=e;
    }
    public double getE()
    {
        return this.e;
    }
}
class Cylinder extends TwoS
{

    public Cylinder(double a,double e)
    {
        super(a, e);
    }
    public double  area()
    {
        return 2*3.14*getA()*getE()+2*3.14*getA()*getA();
    }
    public double CurvedArea()
    {
        return 2*3.14*getA()*getE();
    }
    public double volume()
    {
        return 3.14*getA()*getA()*getE();
    }
    
}
abstract class ThreeS extends ThreeD
{
    private double f;
    private double g;
    public ThreeS(double a,double f,double g)
    {
        super(a);
        this.f=f;
        this.g=g;
    }
    public double getF()
    {
        return this.f;
    }
    public double getG()
    {
        return this.g;
    }
}

class Cuboid extends ThreeS
{
    public Cuboid(double a,double f,double g)
    {
        super(a, f, g);
    }
    public double  area()
    {
        return 2*getA()*getF()+2*getA()*getG()+2*getF()*getG();
    }
    public double volume()
    {
        return getA()*getF()*getG();
    }

}
// class Cone extends ThreeS
// {
//     public Cone()
// }
//     public double  Area() {
//         double baseArea = 3.14 * radius * radius;
//         double aArea = 3.14 * radius * (radius + Math.sqrt(height * height + radius * radius));
//         return baseArea + aArea;
//     }

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
			System.out.println("\t|\t    <<<<<<<<<<<<<<<                          	                |");
			System.out.println("\t|\t << YOUR CHOICE ARE >>                    	                    |");
			System.out.println("\t|\t    >>>>>>>>>>>>>>>                            		            |");
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
						System.out.println("\t______________________________________________________________");
						System.out.println("\t|\t    <<<<<<<<<<<<<<<                          	          |");
						System.out.println("\t|\t << YOUR CHOICE ARE >>                    	              |");
						System.out.println("\t|\t    >>>>>>>>>>>>>>>                         	              |");
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
						System.out.println("\t|_____________________________________________________________|");
						ch = sc.nextInt();
						switch(ch)
						{
							case 1:
							    								
							System.out.println("\t_____________________________________________________________________________________");
							System.out.println("\t|\t    <<<<<<<<<<<<<<<                          	                            |");
							System.out.println("\t|\t << YOUR CHOICE ARE >>                    	                                   |");
							System.out.println("\t|\t    >>>>>>>>>>>>>>>                            		      	   	               |");
							System.out.println("\t|\t                                                       		                   |");
							System.out.println("\t|\t|****************************|       :  |*******************************|       |");
							System.out.println("\t|\t| Press 1 for Area of Square |       :  | Press 2 for Area of Ractangle |       |");
							System.out.println("\t|\t|****************************|       :  |*******************************|       |");
							System.out.println("\t|\t                                                                                |");
							System.out.println("\t|\t|*****************************|      :  |*******************************|       |");                          
							System.out.println("\t|\t| Press 3 for Area of Tringle |      :  |  Press 4 for Area of Circle   |       |");                         
							System.out.println("\t|\t|*****************************|      :  |*******************************|       |");
							
                            System.out.println("\t|\t|*********************************|  :  |*******************************|       |");                          
							System.out.println("\t|\t| Press 5 for Area of Equatringle |  :  |  Press 6 for Area of Hexagone |       |");                         
							System.out.println("\t|\t|*********************************|  :  |*******************************|       |");
							System.out.println("\t|\t                    		                                                       |");

                            System.out.println("\t|\t|*********************************|  :  |***********************************|   |");                          
							System.out.println("\t|\t| Press 7 for Area of IsoTringle  |  :  |                                   |   |");                         
							System.out.println("\t|\t|*********************************|  :  |***********************************|   |");
							System.out.println("\t|\t                    		                                                       |");
                            System.out.println("\t|\t|*********************************|  :  |***********************************|   |");                          
							System.out.println("\t|\t| Press 9 for Area of Rombus      |  :  |  Press 7 for Area of Paralelogram |   |");                         
							System.out.println("\t|\t|*********************************|  :  |***********************************|   |");
							System.out.println("\t|\t|*********************************|  :  |***********************************|   |");                          
							System.out.println("\t|\t| Press 10 for Area of Trapezium  |  :  |  Press 11 for Area of ScaleneTringle  | ");                         
							System.out.println("\t|\t|*********************************|  :  |***********************************|   |");
							System.out.println("\t|\t                    		                                                       |");
							System.out.println("\t|\t|***************************|        :  |*******************************|       |");
							System.out.println("\t|\t|   Press 12 for Exit (<-)  |        :  |   Press 13 for Continue(....) |       |");
							System.out.println("\t|\t|***************************|        :  |*******************************|       |");
							System.out.println("\t|\t                    		                                                       |");
							System.out.println("\t|\t                    		                                                       |");
							System.out.println("\t|\t                                		            >>>>>>>>>>>>>>>>>              |");
							System.out.println("\t|\t                              		        << ENTER YOUR CHOICE >>            |");
							System.out.println("\t|\t                                 	           <<<<<<<<<<<<<<<<<               |");
							System.out.println("\t|__________________________________________________________________________________|");				
													e= sc.nextInt();
									switch(e)
									{
										case 1:
												System.out.println("Enter The Side");
												double a = sc.nextDouble();
												Square s= new Square(a);
												System.out.println("Square area: " + s.area());
												break;
										case 2:
												System.out.println("Enter The length");
												a=sc.nextDouble();
												System.out.println("Enter The Wirth");
												double b=sc.nextDouble();
												Rectangle r = new Rectangle(a, b);
												System.out.println("Rectangle area: " + r.area());
												break;
										// case 3:
												// System.out.println("Enter The Base");
												// a=sc.nextDouble();
												// System.out.println("Enter The Hieght");
												// b=sc.nextDouble();
												// Triangle t = new Triangle(a,b);
												// System.out.println("Triangle area: " + t.area());
												// break;
										case 4:
												System.out.println("Enter The Radius");
												a=sc.nextDouble();
												Circle c = new Circle(a);
												System.out.println("Circle area: " + c.area());
												break;
                                        case 5:
                                                System.out.println("Enter The Radius");
												a=sc.nextDouble();
                                                EquilateralTriangle eq = new EquilateralTriangle(a);
                                                System.out.println("Equaliter Triangle Area"+eq.area());
                                                break;
                                        case 6:
                                                System.out.println("Enter The Radius");
												a=sc.nextDouble();
                                                Hexagone he = new Hexagone(a);
                                                 System.out.println("Hexagone Area Is: "+he.area());
                                                 break;
                                        case 7:
                                                System.out.println("Enter The Base");
												a=sc.nextDouble();
												System.out.println("Enter The Hieght");
												b=sc.nextDouble();
												isosceles iso = new isosceles(a, b);
												System.out.println("isosceles Area Is :"+iso.area());
										case 8:
												System.out.println("Enter The Base");
												a=sc.nextDouble();
												System.out.println("Enter The Hieght");
												b=sc.nextDouble();
												Rombus ro = new Rombus(a, b);
												System.out.println("Rombus Area is: "+ro.area());
												
										case 9:						
												System.out.println("Enter The Base");
												a=sc.nextDouble();
												System.out.println("Enter The Hieght");
												b=sc.nextDouble();
												Pallerogram pall = new Pallerogram(a, b);
												System.out.println("Pallerogram Area is: "+pall.area());
										case 10:
												System.out.println("Enter The Base");
												a=sc.nextDouble();
												System.out.println("Enter The Hieght");
												b=sc.nextDouble();
												System.out.println("Enter The Wirth");
												double Wirth =sc.nextDouble();
												Trapezium tr =new Trapezium(a, d, Wirth);
												System.out.println("Pallerogram Area is: "+tr.area());
										case 11:
												System.out.println("Enter The Base");
												a=sc.nextDouble();
												System.out.println("Enter The Hieght");
												b=sc.nextDouble();
												System.out.println("Enter The Wirth");
												Wirth =sc.nextDouble();
												ScaleneTringle sca = new ScaleneTringle(a, d, Wirth);
												System.out.println("Scalen Tringle Area is: "+sca.area());
																																												
                                        case 12:	System.exit(0);									
										
										case 13: continue;
                                              										
									}
							        break;
					 	 	case 2://Case 2 of 2D Shape
								
								
						    System.out.println("\t______________________________________________________________________________________________");
							System.out.println("\t|\t    <<<<<<<<<<<<<<<                          	                                            |");
							System.out.println("\t|\t << YOUR CHOICE ARE >>                    	                       		     				|");
							System.out.println("\t|\t    >>>>>>>>>>>>>>>                            		      	   		     				|");
							System.out.println("\t|\t                                                       		 		    				|");
							System.out.println("\t|\t|*********************************|         :  |************************************|     	|");
							System.out.println("\t|\t| Press 1 for PERIMETER of Square |         :  | Press 2 for PERIMETER of Ractangle |    	|");
							System.out.println("\t|\t|*********************************|         :  |************************************|    	|");	
							System.out.println("\t|\t                                                                                     		|");
							System.out.println("\t|\t|**********************************|        :  |*********************************|   		|");                          
							System.out.println("\t|\t| Press 3 for PERIMETER of Tringle |        :  | Press 4 for PERIMETER of Circle |   		|");                         
							System.out.println("\t|\t|**********************************|        :  |*********************************|   		|");
							System.out.println("\t|\t|**************************************|    :  |***********************************|   	|");                          
							System.out.println("\t|\t| Press 5 for PERIMETER of Equilateral |    :  | Press 6 for PERIMETER of Hexagone |   	|");                         
							System.out.println("\t|\t|**************************************|    :  |***********************************|   	|");
							System.out.println("\t|\t|**************************************|    :  |**************************************|   	|");                          
							System.out.println("\t|\t| Press 7 for PERIMETER of Iso Tringle |    :  | Press 8 for PERIMETER of Pararlogram |   	|");                         
							System.out.println("\t|\t|**************************************|    :  |**************************************|   	|");
							System.out.println("\t|\t                    		                                                     			|");
							System.out.println("\t|\t|**********************************|        :  |****************************************|  |");                          
							System.out.println("\t|\t| Press 9 for PERIMETER of Rombus  |        :  |	 Press 10 for PERIMETER of Trapezium |  |");                         
							System.out.println("\t|\t|**********************************|        :  |****************************************|  |");
							System.out.println("\t|\t                    		                                                     			|");
							System.out.println("\t|\t|************************************************|            								|");                          
							System.out.println("\t|\t|       Press 11 for PERIMETER of ScaleneTringle |          								|");                         
							System.out.println("\t|\t|************************************************|          								|");
							System.out.println("\t|\t|***************************|          	 :   |*******************************|          |");
							System.out.println("\t|\t|   Press 12 for Exit (<-)  |               :   |   Press 13 for Continue(....) |          |");
							System.out.println("\t|\t|***************************|               :   ********************************|          |");
							System.out.println("\t|\t                    		                                                          		|");
							System.out.println("\t|\t                    		                                                     			|");
							System.out.println("\t|\t                                		       >>>>>>>>>>>>>>>>>                 			|");
							System.out.println("\t|\t                              		        << ENTER YOUR CHOICE >>              			|");
							System.out.println("\t|\t                                 	           <<<<<<<<<<<<<<<<<                 			|");
							System.out.println("\t|_____________________________________________________________________________________________|");				
							
									p= sc.nextInt();
									switch(p)
									{
										case 1:
											System.out.println("Enter The Side");
											double a = sc.nextDouble();
											Square s= new Square(a);
											System.out.println("Square perimeter: " + s.perimeter());
											break;
										case 2:
											System.out.println("Enter The length");
											a=sc.nextDouble();
											System.out.println("Enter The Wirth");
											double b=sc.nextDouble();
											Rectangle r = new Rectangle(a, b);
											System.out.println("Rectangle perimeter: "+r.perimeter());
											break;
										// case 3:
											// System.out.println("Enter The Base");
											// a=sc.nextDouble();
											// System.out.println("Enter The Hieght");
											// b=sc.nextDouble();
											// Triangle t = new Triangle(a,b);
											// System.out.println("Triangle perimeter: " + t.perimeter());
											// break;
										case 4:
											System.out.println("Enter The Radius");
											a=sc.nextDouble();
											Circle c = new Circle(a);
											System.out.println("Circle circumference: " + c.perimeter());
											break;
										case 5:
                                                System.out.println("Enter The Radius");
												a=sc.nextDouble();
                                                EquilateralTriangle eq = new EquilateralTriangle(a);
                                                System.out.println("Equaliter Triangle perimeter"+eq.perimeter());
                                                break;
                                        case 6:
                                                System.out.println("Enter The Radius");
												a=sc.nextDouble();
                                                Hexagone he = new Hexagone(a);
                                                System.out.println("Hexagone perimeter Is: "+he.perimeter());
                                                break;
                                        case 7:
                                                System.out.println("Enter The Base");
												a=sc.nextDouble();
												System.out.println("Enter The Hieght");
												b=sc.nextDouble();
												isosceles iso = new isosceles(a, b);
												System.out.println("isosceles perimeter Is :"+iso.perimeter());
										case 8:
												System.out.println("Enter The Base");
												a=sc.nextDouble();
												System.out.println("Enter The Hieght");
												b=sc.nextDouble();
												Rombus ro = new Rombus(a, b);
												System.out.println("Rombus perimeter is: "+ro.perimeter());
												
										case 9:						
												System.out.println("Enter The Base");
												a=sc.nextDouble();
												System.out.println("Enter The Hieght");
												b=sc.nextDouble();
												Pallerogram pall = new Pallerogram(a, b);
												System.out.println("Pallerogram perimeter is: "+pall.perimeter());
										case 10:
												System.out.println("Enter The Base");
												a=sc.nextDouble();
												System.out.println("Enter The Hieght");
												b=sc.nextDouble();
												System.out.println("Enter The Wirth");
												double Wirth =sc.nextDouble();
												Trapezium tr =new Trapezium(a, d, Wirth);
												System.out.println("Pallerogram Area is: "+tr.perimeter());
										case 11:
												System.out.println("Enter The Base");
												a=sc.nextDouble();
												System.out.println("Enter The Hieght");
												b=sc.nextDouble();
												System.out.println("Enter The Wirth");
												Wirth =sc.nextDouble();
												ScaleneTringle sca = new ScaleneTringle(a, d, Whirth);
												System.out.println("Scalen Tringle Area is: "+tr.perimeter());																
									    case 12:
										 System.exit(0);

										case 13: continue;
									}
                                    break;								
							
							case 3: System.exit(0); 	
							
						}	
						
					}while(ch!=4);
					break;
					
				case 3://Case 3 of Main Switch>>>>>>>>>>>>>
	               	do
					{
						System.out.println("\t______________________________________________________________________ ");
						System.out.println("\t|\t    <<<<<<<<<<<<<<<                          	                 |");
						System.out.println("\t|\t << YOUR CHOICE ARE >>                    	                     |");
						System.out.println("\t|\t    >>>>>>>>>>>>>>>                            		             |");
						System.out.println("\t|\t                                                                  |");
						System.out.println("\t|\t|**************************|   :  |*************************|     |");
						System.out.println("\t|\t| Press 1.for Surface Area |   :  |   Press 2 for Volume    |     |");
						System.out.println("\t|\t|**************************|   :  |*************************|     |");
						System.out.println("\t|\t                                                                  |");
						System.out.println("\t|\t|***********************|      :  |*************************|     |");               
						System.out.println("\t|\t| Press 3 for Exit (<-) |      :  | Press 4 for Continue(..)|     |");
						System.out.println("\t|\t|***********************|      :  |*************************|     |");
						System.out.println("\t|\t                                                                  |");
						System.out.println("\t|\t                              		   >>>>>>>>>>>>>>>>>         |");
						System.out.println("\t|\t                              		<< ENTER YOUR CHOICE >>      |");
						System.out.println("\t|\t                                 	   <<<<<<<<<<<<<<<<<         |");
						System.out.println("\t|____________________________________________________________________|");	
						z = sc.nextInt();
						switch(z)
						{
							case 1:
							
                            System.out.println("\t_____________________________________________________________________________________________________");
							System.out.println("\t|\t    <<<<<<<<<<<<<<<                          	                                                |");
							System.out.println("\t|\t << YOUR CHOICE ARE >>                    	                       		                        |");
							System.out.println("\t|\t    >>>>>>>>>>>>>>>                            		      	   		                            |");
							System.out.println("\t|\t                                                       		 		                            |");
							System.out.println("\t|\t|**********************************|         :     |**************************************|      |");
							System.out.println("\t|\t| Press 1 for Surface of Cube      |         :     | Press 2 for Surface of Sphere        |      |");
							System.out.println("\t|\t|**********************************|         :     |**************************************|      |");
						
							System.out.println("\t|\t|**********************************|         :     |***************************************|     |");                          
							System.out.println("\t|\t| Press 3 for Surface of Cone      |         :     |  Press 4 for Surface of Hemi Sphere   |     |");                         
							System.out.println("\t|\t|**********************************|         :     |***************************************|     |");
							System.out.println("\t|\t|**********************************|         :     |***************************************|     |");                          
							System.out.println("\t|\t| Press 5 for Surface of Cylinder  |         :     |  Press 6 for Surface of Cuboid        |     |");                         
							System.out.println("\t|\t|**********************************|         :     |***************************************|     |");
							System.out.println("\t|\t                    		                                                                        |");
							System.out.println("\t|\t|*********************************|          :     |*******************************|             |");
							System.out.println("\t|\t|   Press 7 for Exit (<-)         |          :     |   Press 8 for Continue(....)  |             |");
							System.out.println("\t|\t|*********************************|          :     |*******************************|             |");
							System.out.println("\t|\t                    		                                                                        |");
							System.out.println("\t|\t                    		                                                                        |");
							System.out.println("\t|\t                                		                             >>>>>>>>>>>>>>>>>              |");
							System.out.println("\t|\t                              		                           << ENTER YOUR CHOICE >>          |");
							System.out.println("\t|\t                                 	                              <<<<<<<<<<<<<<<<<             |");
							System.out.println("\t|___________________________________________________________________________________________________|");							
									x=sc.nextInt();
									switch(x)
									{
										case 1:
										
										System.out.println("Enter The Edge");
										double a = sc.nextDouble();
										Cube cube = new Cube(a);
										System.out.println("Cube surface area: " + cube.surfaceArea());
										break;
							
										case 2:
										System.out.println("Enter The Radius ");
										a=sc.nextDouble();
										Sphere sp = new Sphere(a);
										System.out.println("Cylinder surface area: " + cy.surfaceArea());
										break;
										
										case 3:
										System.out.println("Enter The Radius ");
										a=sc.nextDouble();
										System.out.println("Enter The Hieght");
										double b=sc.nextDouble();
										Cone co = new Cone(a,b);
										System.out.println("Cone surface area: " + co.surfaceArea());
										break;
										
										case 4:
										System.out.println("Enter The Whirth");
										a=sc.nextDouble();
										HemiSphere hp = new HemiSphere(a);
										System.out.println("Hemisphere surface area: " + hp.surfaceArea());
										case 5:
										System.out.println("Enter The Whirth");
										a=sc.nextDouble();
										System.out.println("Enter The Hieght");
										b=sc.nextDouble();
										Cylinder cyl = new Cylinder(a, b);
										System.out.println("Cylinder surface area: " + cyl.surfaceArea());
										case 6:
										System.out.println("Enter The Whirth");
										a=sc.nextDouble();
										System.out.println("Enter The Hieght");
										b=sc.nextDouble();
										System.out.println("Enter The Lenght");
										double le = sc.nextDouble();
										Cuboid cu = new Cuboid(a, b, le);
										System.out.println("Cubiod surface area: " + cu.surfaceArea());
								
										case 7: System.exit(0);								
									
										case 8: continue;
									}
								
					
							break;
						case 2:
			                    			
								
							System.out.println("\t_____________________________________________________________________________________________________");
							System.out.println("\t|\t    <<<<<<<<<<<<<<<                          	                                                |");
							System.out.println("\t|\t << YOUR CHOICE ARE >>                    	                       		                        |");
							System.out.println("\t|\t    >>>>>>>>>>>>>>>                            		      	   		                            |");
							System.out.println("\t|\t                                                       		 		                            |");
							System.out.println("\t|\t|**********************************|         :     |**************************************|      |");
							System.out.println("\t|\t| Press 1 for Voume of Cube        |         :     | Press 2 for Voume of Sphere          |      |");
							System.out.println("\t|\t|**********************************|         :     |**************************************|      |");
						
							System.out.println("\t|\t|**********************************|         :     |***************************************|     |");                          
							System.out.println("\t|\t| Press 3 for Voume of Cone        |         :     |  Press 4 for Voume of Hemi Sphere     |     |");                         
							System.out.println("\t|\t|**********************************|         :     |***************************************|     |");
							System.out.println("\t|\t|**********************************|         :     |***************************************|     |");                          
							System.out.println("\t|\t| Press 5 for Voume of Cylinder    |         :     |  Press 6 for Voume of Cuboid          |     |");                         
							System.out.println("\t|\t|**********************************|         :     |***************************************|     |");
							System.out.println("\t|\t                    		                                                                        |");
							System.out.println("\t|\t|*********************************|          :     |*******************************|             |");
							System.out.println("\t|\t|   Press 7 for Exit (<-)         |          :     |   Press 8 for Continue(....)  |             |");
							System.out.println("\t|\t|*********************************|          :     |*******************************|             |");
							System.out.println("\t|\t                    		                                                                        |");
							System.out.println("\t|\t                    		                                                                        |");
							System.out.println("\t|\t                                		                             >>>>>>>>>>>>>>>>>              |");
							System.out.println("\t|\t                              		                           << ENTER YOUR CHOICE >>          |");
							System.out.println("\t|\t                                 	                              <<<<<<<<<<<<<<<<<             |");
							System.out.println("\t|___________________________________________________________________________________________________|");
							
									w=sc.nextInt();
									switch(w)
									{
								case 1:
										
										System.out.println("Enter The Edge");
										double a = sc.nextDouble();
										Cube cube = new Cube(a);
										System.out.println("Cube surface area: " + cube.Volume());
										break;
							
								case 2:
										System.out.println("Enter The Radius ");
										a=sc.nextDouble();
										Sphere sp = new Sphere(a);
										System.out.println("Cylinder surface area: " + cy.Volume());
										break;
										
								case 3:
										System.out.println("Enter The Radius ");
										a=sc.nextDouble();
										System.out.println("Enter The Hieght");
										double b=sc.nextDouble();
										Cone co = new Cone(a,b);
										System.out.println("Cone surface area: " + co.Volume());
										break;
										
								case 4:
										System.out.println("Enter The Whirth");
										a=sc.nextDouble();
										HemiSphere hp = new HemiSphere(a);
										System.out.println("Hemisphere surface area: " + hp.Volume());
								case 5:
										System.out.println("Enter The Whirth");
										a=sc.nextDouble();
										System.out.println("Enter The Hieght");
										b=sc.nextDouble();
										Cylinder cyl = new Cylinder(a, b);
										System.out.println("Cylinder surface area: " + cyl.Volume());
								case 6:
										System.out.println("Enter The Whirth");
										a=sc.nextDouble();
										System.out.println("Enter The Hieght");
										b=sc.nextDouble();
										System.out.println("Enter The Lenght");
										int le = sc.nextDouble();
										Cuboid cu = new Cuboid(a, b, le);
										System.out.println("Cubiod surface area: " + cu.Volume());
								
								case 7: System.exit(0);								
									
								case 8: continue;
										
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

       
        

        
    





