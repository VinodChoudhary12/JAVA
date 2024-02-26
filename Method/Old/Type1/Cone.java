import java.util.Scanner;

class Cone
{
    public void Area()
    {
        float r=3;
        float h=4;
        float pi=3.14f;
        float a=(pi*r*h)+(pi*r*r);
        System.out.println(" Area Of Cone is "+a);
    }
    
    public void Volume()
    {
        float r=3;
        float h=4;
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
       
        
        c.Area();
        c.Volume();
        
    }
}
