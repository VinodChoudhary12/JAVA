import java.util.Scanner;

class Circle
{
    public void Area()
    {
        float r=3;
        float pi=3.14f;
        float a=pi*r*r;
        System.out.println(" Area Of Circle is "+a);
    }
    
    public void Circumference()
    {
        float r=3;
        float pi=3.14f;
        float c=2*pi*r;
        System.out.println(" Circumference Of Circle is "+c);
    }
    
    public void Diameter()
    {
        float r=3;
        float d=2*r;
        System.out.println(" Diameter Of Circle is "+d);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        
        System.out.println(" For Finding Area,Circumference,Diameter of Circle --> ");
        
        
        c.Area();
        c.Circumference();
        c.Diameter();
    }
}
