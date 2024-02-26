import java.util.Scanner;

class Cube
{
    public void Area()
    {
       
        float l=5;
        float a=6*l*l;
        System.out.println(" Area Of Cube is "+a);
    }
    
    public void Volume()
    {
        float l=5;
        float v=l*l*l;
        System.out.println(" Volume Of Cube is "+v);
    }
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Cube c = new Cube();
        
        System.out.println(" For Finding Area,Volume of Cube --> ");
       
     
        c.Area();
        c.Volume();
    }
}
