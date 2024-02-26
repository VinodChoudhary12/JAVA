class Train
{
    
    String color;
    String track;
    int logomotive; //dabbe;
    int PNNumber;
    Passenger Pess;
    public Train(String color, String track, int logomotive,int PNNumber)
     {
        this.color = color;
        this.track = track;
        this.logomotive = logomotive;
        this.PNNumber =PNNumber;
        Pess = new Passenger(track, logomotive, PNNumber);
    }
    public void displayTrain()
    {
        System.out.println("Train Color :"+this.color);
        System.out.println("Track is:"+this.track);
        System.out.println("LockoMotive:"+this.logomotive);
        this.Pess.displayPess();
    }
class Passenger
{
    
    String name ;
    int age;
    int ticketNo;
    public Passenger(String name, int age, int ticketNo) {
        this.name = name;
        this.age = age;
        this.ticketNo = ticketNo;
    }
    public void displayPess()
    {
        System.out.println("Passenger Name:"+this.name);
        System.out.println("Age Is :"+this.age);
        System.out.println("Ticket Number Is:"+this.ticketNo);
    }
}

}
class Test
{
    public static void main(String[] args)
     {
        Train ob = new Train("Blue", "IndoreToUjjain", 15, 23456);
        ob.displayTrain();
        
    }
}