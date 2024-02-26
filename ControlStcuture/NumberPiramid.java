import java.util.Scanner;

public class NumberPiramid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int no = sc.nextInt();
        int j;
        for(int i= 1;i<=no;i++)
        {
            for(int k=1;k<=(no+1)-i;k++)
            {

                System.out.print("   ");
            }
           
        for(j=1;j<=i;j++)
        {
            System.out.print(" "+j+" ");
        }
        for(j-=2;j>=1;j--)
        {
            System.out.print(" "+j+" ");
        }
        System.out.println();
    }
        sc.close();
    }    
}
