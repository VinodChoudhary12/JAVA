import java.util.Scanner;

class Cuboid
{
    public void Area()
    {
       
        float l=5;
        float b=4;
        float a=6*l*b;
        System.out.println(" Area Of Cuboid is "+a);
    }
    
    public void Volume()
    {
        float l=5;
        float b=4;
        float h=3;
        float v=l*b*h;
        System.out.println(" Volume Of Cuboid is "+v);
    }
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Cuboid c = new Cuboid();
        
        System.out.println(" For Finding Area,Volume of Cuboid --> ");
       
     
        c.Area();
        c.Volume();
    }
}
