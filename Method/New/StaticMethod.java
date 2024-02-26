class StaticMethod
{
    public static void display()
    {
       System.out.println("Hello Display..");
    }
    
    public static void show()
    {
       System.out.println("Hello Show..");
    }
    
    public static void main(String args[])
    {
       System.out.println("Welcome in main method..");
       StaticMethod.display();
       display();
       StaticMethod.show();
       show();
       System.out.println("Main method end..");
    }
}
