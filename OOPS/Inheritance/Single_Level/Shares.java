class Shares
{
	int market,price,pe;
	void setData(int market, int price, int pe)
	{
		this.market = market;
		this.price = price;
		this.pe = pe; 
	}
	public void getShares()
	{
		System.out.println("Market cap :"+market+"cr."+"\nprice of 1 share :"+price+"\nPE ratio : "+pe);
	}
	
}
class Infosys extends Shares
{
	double div;
	public void setData(int market, int price, int pe, double div)
	{
		this.setData(market,price,pe);
		this.div = div;
		
	}
	public void getName()
	{
		System.out.println("Company name : Infosys");
	}
	public void getInfosys()
	{
	  System.out.println("Dividend yield : "+div+"%");
	}
	
}
class Test
{
	public static void main(String args [])
	{
		Infosys ob = new Infosys();
		ob.setData(2000,1335,22,2.63);
		ob.getName();
		ob.getInfosys();
		ob.getShares();
	}
}