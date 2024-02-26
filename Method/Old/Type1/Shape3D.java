import java.util.Scanner;

class Shape3D
{
    public void sphere()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("\n  --Sphere--\n");
       
       System.out.print(" Enter Radius of Sphere : ");
       float r=sc.nextFloat();
       
       System.out.println(" Press 1 for Area.");
       System.out.println(" Press 2 for Volume.");
       System.out.println(" Press 3 for Diameter.");
       
       System.out.print("\n Enter Ur Choice : ");
       int n=sc.nextInt();
       float a,v,d,pi=3.14f,f=1.33f;
      
       switch(n)
       {
          case 1 : a=4*pi*r*r;
                   System.out.println(" Area of Sphere : "+a);
                   break;
                   
          case 2 : v=f*pi*r*r*r;
                   System.out.println(" Volume of Sphere : "+v);
                   break;
                   
          case 3 : d=2*r;
                   System.out.println(" Diameter of Sphere : "+d);
                   break;
                   
          default :System.out.println(" Not a Right Choice ...");
       }
       
    }
    
    public void cube()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("\n  --Cube--\n");
       
       System.out.print(" Enter Length of a Side : ");
       float l=sc.nextFloat();
       System.out.println(" Press 1 for Area.");
       System.out.println(" Press 2 for Volume.");
       
       System.out.print("\n Enter Ur Choice : ");
       int n=sc.nextInt();
       float a,v;
      
       switch(n)
       {
          case 1 : a=6*l*l;
                   System.out.println(" Area of Cube : "+a);
                   break;
                   
          case 2 : v=l*l*l;
                   System.out.println(" Volume of Cube : "+v);
                   break;
                   
          default :System.out.println(" Not a Right Choice ...");
                  
       }
    }
    
    public void cuboid()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("\n  --Cuboid--\n");
       
       System.out.print(" Enter Length of Cuboid : ");
       float l=sc.nextFloat();
       System.out.print(" Enter Breadth of Cuboid : ");
       float b=sc.nextFloat();
       System.out.print(" Enter Height of Cuboid : ");
       float h=sc.nextFloat();
       System.out.println(" Press 1 for Area.");
       System.out.println(" Press 2 for Volume.");
       
       System.out.print(" Enter Ur Choice : ");
       int n=sc.nextInt();
       float a,v;
      
       switch(n)
       {
          case 1 : a=6*l*b;
                   System.out.println(" Area of Cuboid : "+a);
                   break;
                   
          case 2 : v=l*b*h;
                   System.out.println(" Volume of Cuboid : "+v);
                   break;
                   
          default :System.out.println(" Not a Right Choice ...");
                 
       }
    }
    
    public void cone()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("\n  --Cone--\n");
       
       System.out.print(" Enter Radius of Cylinder : ");
       float r=sc.nextFloat();
       System.out.print(" Enter Height of Cone : ");
       float h=sc.nextFloat();
       System.out.println(" Press 1 for Area.");
       System.out.println(" Press 2 for Volume.");
       
       System.out.print("\n Enter Ur Choice : ");
       int n=sc.nextInt();
       float a,v,pi=3.14f,f=0.33f;
      
       switch(n)
       {
          case 1 : a=(pi*r*h)+(pi*r*r);
                   System.out.println(" Area of Cone : "+a);
                   break;
                   
          case 2 : v=f*pi*r*r*h;
                   System.out.println(" Volume of Cone : "+v);
                   break;
                   
          default :System.out.println(" Not a Right Choice ...");
       }
                   
    }
    
    public void cylinder()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("\n  --Cylinder--\n");
       
       System.out.print(" Enter Radius of Cylinder : ");
       float r=sc.nextFloat();
       System.out.print(" Enter Height of Cylinder : ");
       float h=sc.nextFloat();
       System.out.println(" Press 1 for Area.");
       System.out.println(" Press 2 for Volume.");
       
       System.out.print(" Enter Ur Choice : ");
       int n=sc.nextInt();
       float a,v,pi=3.14f,f=0.33f;
      
       switch(n)
       {
          case 1 : a=(2*pi*r*r)+(2*pi*r*h);
                   System.out.println(" Area of Cylinder : "+a);
                   break;
                   
          case 2 : v=pi*r*r*h;
                   System.out.println(" Volume of Cylinder : "+v);
                   break;
                   
          default :System.out.println(" Not a Right Choice ...");
                 
       }
    }
    
    
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       Shape3D st = new Shape3D();
       
       System.out.println("Following Shapes -->");
    
       System.out.println("Press 1 for Sphere.");
       System.out.println("Press 2 for Cube.");
       System.out.println("Press 3 for Cuboid.");
       System.out.println("Press 4 for Cone.");
       System.out.println("Press 5 for Cylinder.");
       System.out.print("\nEnter Ur Choice : ");
       int n=sc.nextInt();
       
       switch(n)
       {
          case 1 : st.sphere();
                   break;
                   
          case 2 : st.cube();
                   break;
                   
          case 3 : st.cuboid();
                   break;
                   
          case 4 : st.cone();
                   break;
                   
          case 5 : st.cylinder();
                   break;
                   
          default :
                   System.out.println(" Wrong Choice ...");
       }
    }
}
