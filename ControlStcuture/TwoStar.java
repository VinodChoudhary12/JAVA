import java.util.Scanner;

public class TwoStar
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Number");
        int n = sc.nextInt();

        int x=1,y=0, j;
        for(int i =0;i<n;i++)
        {
            for(j =1 ; j<=y+x;j++)
            {
                
                System.out.print("* ");
                
            }
            y=j-i;
        System.out.println();
            x=i+1;

        sc.close();
    }   
} 
}

