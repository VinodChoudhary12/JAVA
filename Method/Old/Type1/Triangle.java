import java.util.Scanner;

class Triangle
{
    public void Area()
    {
       
        
        float b=9;
        float h=4;
        float p=0.5f;
        float a=p*b*h;
        System.out.println(" Area Of Triangle is "+a);
    }
    
    public void Perimeter()
    {
        float l1=7;
        float l2=8;
        float b=9;
        float p=l1+l2+b;
        System.out.println(" Perimeter Of Triangle is "+p);
    }
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Triangle t = new Triangle();
        
        System.out.println(" For Finding Area,Perimeter of Triangle --> ");
       
     
        t.Area();
        t.Perimeter();
    }
}
