import java.util.Scanner;

public class ArmstrongForThree
 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int n= sc.nextInt();
        int rem=0,arm=0,sum=n;
        while (n>0) 
        {
              rem =  n%10;
              arm=arm+(rem*rem*rem);
               n=n/10;
                
        }
        if(sum==arm)
        {
            System.out.println("Number is Prime");
        }
        else
        {
            System.out.println("Number Is not Armstrong");
        }
        sc.close();
       } 
}
