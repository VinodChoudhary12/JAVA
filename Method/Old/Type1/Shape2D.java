import java.util.Scanner;

class Shape2D
{
    public void circle()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("\n  --Circle--\n");
       
       System.out.print(" Enter Radius of Circle : ");
       int r=sc.nextInt();
       
       System.out.println(" Press 1 for Area.");
       System.out.println(" Press 2 for Circumference.");
       System.out.println(" Press 3 for Diameter.");
       
       System.out.print("\n Enter Ur Choice : ");
       int n=sc.nextInt();
       float a,c,d,pi=3.14f;
      
       switch(n)
       {
          case 1 : a=pi*r*r;
                   System.out.println(" Area of Circle : "+a);
                   break;
                   
          case 2 : c=2*pi*r;
                   System.out.println(" Circumference of Circle : "+c);
                   break;
                   
          case 3 : d=2*r;
                   System.out.println(" Diameter of Circle : "+d);
                   break;
                   
          default :System.out.println(" Not a Right Choice ...");
       }
       
    }
    
    public void square()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("\n  --Square--\n");
       
       System.out.print(" Enter Length of a Side : ");
       int l=sc.nextInt();
       System.out.println(" Press 1 for Area.");
       System.out.println(" Press 2 for Perimeter.");
       
       System.out.print("\n Enter Ur Choice : ");
       int n=sc.nextInt();
       float a,p;
      
       switch(n)
       {
          case 1 : a=l*l;
                   System.out.println(" Area of Square : "+a);
                   break;
                   
          case 2 : p=4*l;
                   System.out.println(" Perimeter of Square : "+p);
                   break;
                   
          default :System.out.println(" Not a Right Choice ...");
                  
       }
    }
    
    public void rectangle()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("\n  --Rectangle--\n");
       
       System.out.print(" Enter Length of Rectangle : ");
       int l=sc.nextInt();
       System.out.print(" Enter Breadth of Rectangle : ");
       int b=sc.nextInt();
       System.out.println(" Press 1 for Area.");
       System.out.println(" Press 2 for Perimeter.");
       
       System.out.print(" Enter Ur Choice : ");
       int n=sc.nextInt();
       float a,p;
      
       switch(n)
       {
          case 1 : a=l*b;
                   System.out.println(" Area of Rectangle : "+a);
                   break;
                   
          case 2 : p=2*(l+b);
                   System.out.println(" Perimeter of Rectangle : "+p);
                   break;
                   
          default :System.out.println(" Not a Right Choice ...");
                 
       }
    }
    
    public void triangle()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("\n  --Triangle--\n");
       
       System.out.print(" Enter Height of Triangle : ");
       int h=sc.nextInt();
       System.out.print(" Enter Length of 1st side of Triangle : ");
       int l1=sc.nextInt();
       System.out.print(" Enter Length of 2nd side of Triangle : ");
       int l2=sc.nextInt();
       System.out.print(" Enter Breadth of Triangle : ");
       int b=sc.nextInt();
       System.out.println(" Press 1 for Area.");
       System.out.println(" Press 2 for Perimeter.");
       
       System.out.print("\n Enter Ur Choice : ");
       int n=sc.nextInt();
       float a,p,f=0.5f;
      
       switch(n)
       {
          case 1 : a=f*b*h;
                   System.out.println(" Area of Triangle : "+a);
                   break;
                   
          case 2 : p=l1+l2+b;
                   System.out.println(" Perimeter of Triangle : "+p);
                   break;
                   
          default :System.out.println(" Not a Right Choice ...");
                   
    }
    
    
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       Shape2D sd = new Shape2D();
       
       System.out.println("Following Shapes -->");
    
       System.out.println("Press 1 for Circle.");
       System.out.println("Press 2 for Square.");
       System.out.println("Press 3 for Rectangle.");
       System.out.println("Press 4 for Triangle.");
       System.out.print("\nEnter Ur Choice : ");
       int n=sc.nextInt();
       
       switch(n)
       {
          case 1 : sd.circle();
                   break;
                   
          case 2 : sd.square();
                   break;
                   
          case 3 : sd.rectangle();
                   break;
                   
          case 4 : sd.triangle();
                   break;
                   
          default :
                   System.out.println(" Wrong Choice ...");
       }
    }
}
