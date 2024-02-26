import java.util.Scanner;

class Rectangle
{
    public void Area()
    {
       
        float l=3;
        float b=4;
        float a=l*b;
        System.out.println(" Area Of Rectangle is "+a);
    }
    
    public void Perimeter()
    {
        float l=3;
        float b=4;
        float p=2*(l+b);
        System.out.println(" Perimeter Of Circle is "+p);
    }
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        
        System.out.println(" For Finding Area,Perimeter of Rectangle --> ");
        
        r.Area();
        r.Perimeter();
    }
}
