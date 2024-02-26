class NonStaticMethod
{
    public void display()
    {
       System.out.println("Hello Display..");
    }
    
    public void show()
    {
       System.out.println("Hello Show..");
    }
    
    public static void main(String args[])
    {
       NonStaticMethod ob = new NonStaticMethod();
       
       System.out.println("Welcome in main method..");
       ob.display();
       ob.show();
       System.out.println("Main method end..");
    }
}
