import java.util.Scanner;

public class Star {
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Second number");
        int a = sc.nextInt();
        Star st = new Star();
        st.getStar(a);
    
        sc.close();
    }
        public void getStar(int a)
        {
            for(int i=1;i<=a;i++)
		    {
		        for(int j=1;j<=i;j++)
		        {
		            System.out.print("* ");
		        }
		            System.out.println();
		    } 
        }
}
