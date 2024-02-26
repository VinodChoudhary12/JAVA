import java.util.Scanner;

class Square
{
    public void Area(float l)
    {
       
        float a=l*l;
        System.out.println(" Area Of Square is "+a);
    }
    
    public void Perimeter(float l)
    {
       
        float p=4*l;
        System.out.println(" Perimeter Of Square is "+p);
    }
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Square s = new Square();
        
        System.out.println(" For Finding Area,Perimeter of Square --> ");
        System.out.print(" Enter Length of Square : ");
        float l = sc.nextFloat();

        s.Area(l);
        s.Perimeter(l);
    }
}
