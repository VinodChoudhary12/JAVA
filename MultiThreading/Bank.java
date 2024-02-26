//import java.util.Scanner;
class Bank
{
	int Balance=10000;
	public synchronized void credit(int creditAmount)
	{
		System.out.println(creditAmount+" Rs Is Credited in Your Account");
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println("Your Current Balance Is :"+Balance);
			System.out.println("Thank You To Use Our Services");
			
		}
		Balance += creditAmount;
        System.out.println("Your Current Balance Is: " + Balance);
        System.out.println("Thank You To Use Our Services");
	}
	
	public synchronized void debit(int debitAmount) 
	{
        if (Balance <= 0) 
		{
            System.out.println("Insufficient Balance for Debit");
        } else if (debitAmount > Balance) 
		{
            System.out.println("Debit amount exceeds available balance");
        } else 
		{
            System.out.println(debitAmount + " Rs Is Debited in Your Account");
            try 
			{
                Thread.sleep(5000); // Adding a 5-second delay
            } catch (InterruptedException e) 
			{
                e.printStackTrace();
            }
            Balance -= debitAmount;
            System.out.println("Your Current Balance Is: " + Balance);
            System.out.println("Thank You To Use Our Services");
        }
    }
}
class Account extends Thread
{
	int creditAmount;
	int debitAmount;
	Bank tob;
	public Account(Bank tob,int creditAmount,int debitAmount)
	{
		this.tob=tob;
		this.creditAmount =creditAmount;
		this.debitAmount=debitAmount;
		this.start();
	}
	
	public void run()
	{
		tob.credit(creditAmount);
		tob.debit(debitAmount);
		
		int total = creditAmount-debitAmount;
		//System.out.println("Remaining Ammount is: "+total);	
	}
}
class Test
{
	public static void main(String args[])
	{
		//Sacnner sc= new Scanner(System.in);
		Bank ts = new Bank();
		Account cre = new Account(ts,1000,25000);
		Account atm = new Account(ts,1500,1000);
		Account upi = new Account(ts,2000,5000);
		Account NEFT = new Account(ts,2000,2000);
	}
}