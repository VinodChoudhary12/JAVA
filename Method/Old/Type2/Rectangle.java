import java.util.Scanner;

class Rectangle
{
    public void Area(float l,float b)
    {
       
        float a=l*b;
        System.out.println(" Area Of Rectangle is "+a);
    }
    
    public void Perimeter(float l,float b)
    {
       
        float p=2*(l+b);
        System.out.println(" Perimeter Of Circle is "+p);
    }
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        
        System.out.println(" For Finding Area,Perimeter of Rectangle --> ");
        System.out.print(" Enter Length of Rectangle : ");
        float l = sc.nextFloat();
        
        System.out.print(" Enter Breadth of Rectangle : ");
        float b = sc.nextFloat();
        
        r.Area(l,b);
        r.Perimeter(l,b);
    }
}
