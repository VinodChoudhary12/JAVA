import java.util.Scanner;

class Sphere
{
    public void Area()
    {
        float r=3;
        float pi=3.14f;
        float a=4*pi*r*r;
        System.out.println(" Area Of Sphere is "+a);
    }
    
    public void Volume()
    {
        float r=3;
        float pi=3.14f;
        float f=1.33f;
        float v=f*pi*r*r*r;
        System.out.println(" Volume Of Sphere is "+v);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Sphere s = new Sphere();
        
        System.out.println(" For Finding Area,Volume of Sphere --> ");
        
        s.Area();
        s.Volume();
        
    }
}
