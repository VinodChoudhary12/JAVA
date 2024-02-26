import java.util.Scanner;

public class prime
{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        boolean flag = true;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
              flag=false;       
            }
            
        }
        if (flag) {
            System.out.println("The Number is Prime");
        }
        else{
            System.out.println("The Number is not Prime");
        }
        sc.close();
    }
    
}