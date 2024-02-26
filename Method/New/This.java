//this. or this keyword

class This
{
   public void display()
   {
       System.out.println("Hello Display");
       this.show();
   }
   
   public void show()
   {
       System.out.println("Hello Show");
   }
   
   public static void main(String args[])
   {
       This ob = new This();
       ob.display();
       //ob.show();
   }
   
   
}
