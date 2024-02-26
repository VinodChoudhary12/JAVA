import java.util.Scanner;

class Nest
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("\tPress 1 for Artmetric opration:\n\tPress 2 For find Area :");
	System.out.println("\tPress 3 for conversion :\n\tPress 4 for volum:");
	System.out.println("Enter your Choice:");
	int ch=sc.nextInt();
	if (ch==1)
{  
	System.out.println("\tPress 1 for Addition:\n\tPress 2 For subtraction:");
	System.out.println("\tPress 3 for Multiplication:\n\tPress 4 For Division:");
	System.out.println("\tPress 5 for Modulas:");
	System.out.println("Enter your Choice:");
	int ch1=sc.nextInt();
	System.out.println("Enter any Two Numbers:");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double res;
	switch(ch1)
{
	case 1:
	 {
		res=a+b;
		System.out.println("The Addition of Two numbe is: "+res);
		break;
	 }
	 	
	 case 2:
	 {
		res=a-b;
		System.out.println("The Subration of Two numbe is: "+res);
		break;
	 }
	 case 3:
	 {
		res=a*b;
		System.out.println("The Multiplication  of Two numbe is: "+res);
		break;
	 }
	 case 4:
	 {
		res=a/b;
		System.out.println("The Division of Two numbe is: "+res);
		break;
	 }
	 case 5:
	 {
		res=a%b;
		System.out.println("The Modulas of Two numbe is: "+res);
		break;
	 }
	 default:
	 	System.out.println("You Entred Wrong Choice:");
	 	break;

}
}
	
 	 else if (ch==2)
 {
	System.out.println("\tPress 1 for Area of Square: \n\tPress 2  for area of cube:");
	System.out.println("\tPress 3 of Area of Cylinder: \n\tPress 4 for area of Cone:");
	System.out.println("\tPress 5 for Area of Circle:\n\tPress  6 for area of rectangle");
	int area=sc.nextInt();
 	double res;
 	switch(area)
{ 
	case 1:
	{
	System.out.println("Enter The Side");
	int a=sc.nextInt();
	res=(a*a);
	System.out.println("The Sqaure of  Is:" +res);
	}
	
	case 2:
	{
	System.out.println("Enter The Side");
	int a=sc.nextInt();
	res=(6*a);
	System.out.println("The area  of Cube Is:" +res);
	break;
	}
	
	case 3:
	{
	System.out.println("Enter The radius of Cylinder");
	int a=sc.nextInt();
	System.out.println("Enter The Height of Cylinder");
	int b=sc.nextInt();
	res=(2*3.14*a*b)+(2+3.14*a*a);
	System.out.println("The Area of Cylinder is:"+res);
	break;
	
	}
	
	case 4:
	{
	System.out.println("Enter The radius of Cone");
	int a=sc.nextInt();
	System.out.println("Enter The Height of Cone");
	int b=sc.nextInt();
	res=(3.14*a*b)+(3.14*a*a);
	System.out.println("The area  of Cone Is:" +res);
	break;
	}
	
	case 5:{
	System.out.println("Enter The radius of Cirlce");
	int a=sc.nextInt();
	res=(3.14*a*a);
	System.out.println("The area of circle"+res);
	break;
	}
	
	case 6:
	{
	System.out.println("Enter The Lenth of Ractangle");
	int a=sc.nextInt();
	System.out.println("Enter The Width of Ractangle");
	int b=sc.nextInt();
	res=(a*b);
	System.out.println("The area of ractangle is  of "+res);
	break;	
        }
        default :
	 	System.out.println("You Entred Wrong Choice:");
        
}
}

	else if (ch==3)
{
	System.out.println("\tPress 1 for Ferhraheit to Celcius: \n\tPress 2  for Celcius to Ferhraheit :");
	System.out.println("\tPress 3 of degree to Radiun: \n\tPress 4 for Radiun to degree :");
	System.out.println("\tPress 5 for Meter to CM:\n\tPress  6 for  kilometer to Meter");
	int con=sc.nextInt();
	double res;
	switch(con)
{
	case 1:{
	System.out.println("Enter The Tempreture in Ferhraheit :");
	int a=sc.nextInt();
	res= ((a-32)/1.8);
	System.out.println("The Conversion  is  of "+res);
	break;
}
	case 2:{
	System.out.println("Enter The Tempreture in celcius :");
	int a=sc.nextInt();
	res=(a*1.8+32);
	System.out.println("The Conversion  is   "+res);
	break;
}
	case 3:{
	System.out.println("Enter The Value of Degree :");
	int a=sc.nextInt();
	res=(a*3.14/180);
	System.out.println("The Conversion  is   "+res);
	break;
}
	
	case 4:{
	System.out.println("Enter The Value of Radiun :");
	int a=sc.nextInt();
	res=(a*180/3.14);
	System.out.println("The Conversion  is  of "+res);
	break;
}
	
	case 5:{
	System.out.println("Enter The Value of meter :");
	int a=sc.nextInt();
	res=(a*100);
	System.out.println("The The value in centimeter is  is  of "+res);
	break;
}
	case 6:{
	System.out.println("Enter The Value of kilometer :");
	int a=sc.nextInt();
	res=(a*1000);
	System.out.println("The The value in meter  is  is  of "+res);
	break;
}
}
}
	else if(ch==4)
	{
		System.out.println("\tPress 1 for volume of Cyclander: \n\tPress 2  for volume of Cube :");
	 	System.out.println("\tPress 3 of volume of Cone: \n\tPress 4 for Volume of Ractangel:");
		int vol=sc.nextInt();
		double res;
	switch (vol){
	
		case 1:{
	System.out.println("Enter The Value of Radius :");
	int a=sc.nextInt();
	System.out.println("Enter The Value of Hieght :");
	int b=sc.nextInt();
	res=(3.14*a*a*b);
	System.out.println("The Volume  of Cylander is "+res);
	break;
}
		case 2:{
	System.out.println("Enter The Value of Edge :");
	int a=sc.nextInt();
	res=(a*a*a);
	System.out.println("The Volume of Cube is "+res);
	break;
}

		case 3:{
	System.out.println("Enter The Value of Radius :");
	int a=sc.nextInt();
	System.out.println("Enter The Value of Hieght :");
	int b=sc.nextInt();
	res=((3.14*a*a*b)*1/3);
	System.out.println("The Volume  of Cone is "+res);
	break;
}	


		case 4:{
	System.out.println("Enter The Value of Lenth :");
	int a=sc.nextInt();
	System.out.println("Enter The Value of Hieght :");
	int b=sc.nextInt();
	System.out.println("Enter The Value of Width :");
	int c=sc.nextInt();
	res=(a*b*c);
	System.out.println("The Volume  of Cone is "+res);
	break;
}	
	default:
	 	System.out.println("You Entred Wrong Choice:");
	 	break;
}		
}
	else 
		System.out.println("Your choice is invaild");
	
}
}
	



 

	  
	
