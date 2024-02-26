public class M {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=19;j++)
            {
                if (j==1||j==19) 
            {
                System.out.print("*");
            }
            //else if (j==i*2||j==20-(i*2)&&i<=5&&i>i)  this is for N pattern
            else if ((j==i*2||j==20-(i*2))&&i<=5&&i>1) 
            {
                System.out.print("*");    
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
            

        }
    }
}
