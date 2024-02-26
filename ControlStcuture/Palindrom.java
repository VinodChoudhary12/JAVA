import java.util.Scanner;
public class Palindrom 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int a = sc.nextInt();
        int originalNumber = a;
        int reversedNumber = 0;
        while(a>0)
        {
            int digit = a % 10;
            reversedNumber = reversedNumber * 10 + digit;
            a /= 10;
        }
        if(reversedNumber==originalNumber)
        {
            System.out.println("The Number is Palindrom");
        }   
        else
        {
            System.out.println("Number is not Palindrom");
        }
        sc.close();
    }    
}
