import java.util.Scanner;

class Cone
{
    public void Area(float r,float h)
    {
        float pi=3.14f;
        float a=(pi*r*h)+(pi*r*r);
        System.out.println(" Area Of Cone is "+a);
    }
    
    public void Volume(float r,float h)
    {
        float pi=3.14f;
        float f=0.33f;
        float v=f*pi*r*r*h;
        System.out.println(" Volume Of Cone is "+v);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Cone c = new Cone();
        
        System.out.println(" For Finding Area,Volume of Cone --> ");
        System.out.print(" Enter Radius of Cone : ");
        float r = sc.nextFloat();
        
        System.out.print(" Enter Height of Cone : ");
        float h = sc.nextFloat();
        
        c.Area(r,h);
        c.Volume(r,h);
        
    }
}
