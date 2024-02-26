class Test
{
   public void display(Test k)
   {
       System.out.println("Hello Display");
       k.show(1);
   }
   
   public void show(int a)
   {
       System.out.println("Hello Show"+a);
   }
   
   public static void main(String args[])
   {
       Test ob = new Test();
       ob.display(ob);
       ob.show(0);
   }
   
   
}
