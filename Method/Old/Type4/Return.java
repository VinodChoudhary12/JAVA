class Return 
{
    public void display()
    {
        int a=8;
        System.out.println("Hello display");
        System.out.println("A = "+a);
        System.out.println("--------------------");
        int k=this.show(a);
        System.out.println("Value of "+k);
    }    
    
    public int show(int a)
    {
        int x=7;
        System.out.println("A = "+a);
        System.out.println("Hello Show");
        return x;
    }

    public static void main(String args[])
    {
        Return ob = new Return();
        ob.display(); 
    }
}
