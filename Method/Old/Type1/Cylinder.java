import java.util.Scanner;

class Cylinder
{
    public void Area()
    {
        float r=3;
        float h=4;
        float pi=3.14f;
        float a=(2*pi*r*r)+(2*pi*r*h);
        System.out.println(" Area Of Cylinder is "+a);
    }
    
    public void Volume()
    {
        float r=3;
        float h=4;
        float pi=3.14f;
        float f=0.33f;
        float v=pi*r*r*h;
        System.out.println(" Volume Of Cylinder is "+v);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Cylinder c = new Cylinder();
        
        System.out.println(" For Finding Area,Volume of Cylinder --> ");
       
        
        c.Area();
        c.Volume();
        
    }
}
