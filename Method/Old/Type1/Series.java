import java.util.Scanner;

class Series
{
    public void fibonacci()
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("\nPerforming Fibonacci Series-->\n");
         System.out.print("Enter Position : ");
         int n=sc.nextInt();
         
         int i=1,a=-1,b=1,c;
         while(i<=n)
         {
             c=a+b;
             System.out.print(c+" ");
             a=b;
             b=c;
             i++;
         }
    }
    
    public void natural()
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("\nPerforming Natural Number Series-->\n");
         System.out.print("Enter Position : ");
         int n = sc.nextInt();
         int i;
         for(i=1;i<=n;i++)
         {
            System.out.print(i+" ");
         }
    }
    
    public void oddNatural()
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("\nPerforming Odd Natural Number Series-->\n");
         System.out.print("Enter Position : ");
         int n = sc.nextInt();
         int i;
         for(i=1;i<=n*2;i+=2)
         {
            System.out.print(i+" ");
         }
    }

    public void evenNatural()
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("\nPerforming Even Natural Number Series-->\n");
         System.out.print("Enter Position : ");
         int n = sc.nextInt();
         int i;
         for(i=2;i<=n*2;i+=2)
         {
            System.out.print(i+" ");
         }
    }
    
    public void prime()
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Position : ");
      int n=sc.nextInt();
      int p,i,count;
      
      for(p=2;p<=n;p++)
      {
         i=1;
         count=0;
         while(i<=p)
         {   
             if(p%i==0)
             {
                count++;
             }
             i++;
         }
      
         if(count==2)
            System.out.print(p+" ");
      }
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Series s = new Series();
        System.out.println("\nFollowing Series are available -->\n");
        System.out.println("Press 1 for Fibonacci Series.");
        System.out.println("Press 2 for Natural Number Series.");
        System.out.println("Press 3 for Odd Natural Number Series.");
        System.out.println("Press 4 for Even Natural Number Series.");
        System.out.println("Press 5 for Prime Number Series.");
        
        System.out.print("Enter Ur Choice : ");
        int ch=sc.nextInt();

        switch(ch)
        {
            case 1 : s.fibonacci();
                     break;
            
            case 2 : s.natural();
                     break;
             
            case 3 : s.oddNatural();
                     break;
                     
            case 4 : s.evenNatural();
                     break;
                     
            case 5 : s.prime();
                     break;
                     
            default : System.out.println(" Wrong Choice ...");
        }    
        
    }
}
