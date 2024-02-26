//

class Call
{
   public void display(Call c)
   {
       System.out.println("Hello Display");
       c.show();
       this.show();
   }
   
   public void show()
   {
       System.out.println("Hello Show");
   }
   
   public static void main(String args[])
   {
       Call ob = new Call();
       ob.display(ob);
       ob.show();
   }
   
   
}
