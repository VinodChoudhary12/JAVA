
class Pojo
{
    private int price;
    private String colour;
    private String call;
    private double screenSize;
    private String Model;
    private String Brand;

    public String getBrand() {
        return Brand;
    }
    public void setBrand(String brand) {
       this. Brand = brand;
    }
    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
       this. Model = model;
    }
    /////////////////////// TouchScreen Data Member
    private String TouchScreenLock;
    private String Internet;
    private String Cemera;

    public String getCemera() {
        return Cemera;
    }
    public void setCemera(String cemera) {
       this. Cemera = cemera;
    }
    public String getInternet() {
        return Internet;
    }
    public void setInternet(String internet) {
        this.Internet = internet;
    }
    public String getTouchScreenLock() {
        return TouchScreenLock;
    }
    public void setTouchScreenLock(String touchScreenLock) {
        this.TouchScreenLock = touchScreenLock;
    }
    public int getPrice() 
    {
        return price;
    }
    public void setPrice(int price) 
    {
        this.price = price;
    }
    public String getColour() 
    {
        return colour;
    }
    public void setColour(String colour) 
    {
        this.colour = colour;
    }
    public String getCall()
    {
        return call;
    }
    public void setCall(String call) 
    {
        this.call = call;
    }
    public double getScreenSize() 
    {
        return screenSize;
    }
    public void setScreenSize(double screenSize)

     {
        this.screenSize = screenSize;
     }

     //Abtributes of Apple
     String AppStore;
     String Esim;
     public String getEsim() {
        return Esim;
    }
    public void setEsim(String esim) {
        Esim = esim;
    }
    public String getAppStore() {
        return AppStore;
    }
    public void setAppStore(String appStore) {
       this. AppStore = appStore;
    }
    

    


}
class Mobile extends Pojo
{
    public void Brand()
    {
        System.out.println("The Brand of mobile is "+getBrand());
    }
    public void Model()
    {
        System.out.println("The Model of "+getBrand()+"Is "+getModel());
    }
    public void price()
    {
        System.out.println("The Price of "+getBrand()+" "+getModel()+ "is"+getPrice());
    }
    public void colour()
    {
        System.out.println("The color of "+getBrand()+" "+getModel()+"is"+getColour());
    }
    public void call()
    {
        System.out.println("The calling facility avilable in"+getBrand()+" "+getModel());
    }
    public void ScreenSize()
    {
        System.out.println("The Screen Size Of "+getBrand()+" "+getModel()+"Is:"+getScreenSize());
    }
}
class SmartPhone extends Mobile
{
    public void Cemera()
    {
        System.out.println("Cemera Is Avaible In"+getBrand()+" "+getModel());
    }
    public void Internet()
    {
        System.out.println("InterNet"+getInternet()+" Is Available In "+getBrand()+" "+getModel());
    }
    public void TouchScreenLock()
    {
        System.out.println("Touch Screen Lock is Availabe in "+getBrand()+" "+getModel());
    }


}
class Iphone extends SmartPhone
{
    public void AppStore()
    {
      System.out.println("App Strore avaible in ");
    }
    public void Esim()
    {
        System.out.println("Esim Feature is Aviable in This Phone");
    }

}
class Test
{
    public static void main(String[] args) 
    {
       Iphone ob = new Iphone();
       ob.setBrand("Ipone ");
       ob.setModel("14Pro");
       ob.setPrice(140000);
       ob.setColour("REd");
       ob.setCall("Availabale");
       ob.setScreenSize(12.78);
       ob.setCemera("48MP");
       ob.setInternet("5G");
       ob.setTouchScreenLock("Availabel");

       ob.Brand();
       ob.Model();
       ob.price();
       ob.colour();
       ob.call();
       ob.ScreenSize();
       ob.Cemera();
       ob.Internet();
       ob.TouchScreenLock();


       

    }
}


    
    

