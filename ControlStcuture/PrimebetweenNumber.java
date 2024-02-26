import java.util.Scanner;

public class PrimebetweenNumber 
{
    public static void main(String[] args) 
    {
        PrimebetweenNumber ob = new PrimebetweenNumber();
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
       ob.getNumber(a,b);
        sc.close();
    }
    public  void getNumber(int a,int b)
    {
        for(int i=a+1;i<=b;i++)
        {
            boolean flag = true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag = false;
                }
            }
            if(flag)
            {   
                 System.out.println(i);
            }      
        }
    }
        
}
