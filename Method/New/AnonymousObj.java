class AnonymousObj
{
    public void display()
    {
        System.out.println("Hello display...");
    }
    
    public void show()
    {
        System.out.println("Hello show...");
    }
    
    public static void main(String args[])
    {
        System.out.println("Welcome to main method...");
        new AnonymousObj().display();//Anonymous Object(new obj 1)
        new AnonymousObj().display();//Anonymous Object(new obj 2)
        new AnonymousObj().show();   //Anonymous Object(new obj 3)
        System.out.println("Main method end...");
    }
}
