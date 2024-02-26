class StaticBlock
{
    static
    {
       System.out.println("Hello Static..");
       StaticBlock.display();
       StaticBlock.show();
    }
    
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
       System.out.println("Main method end..");
    }
}
