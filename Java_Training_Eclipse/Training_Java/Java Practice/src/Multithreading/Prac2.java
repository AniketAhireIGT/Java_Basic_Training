package Multithreading;

//By Extending Thread Class

class TaxiBooking extends Thread
{
	private int userId;
    public TaxiBooking(int userId) 
    {
        this.userId = userId;
    }
	public void run()
	{	
		
		System.out.println("User "+userId+" is Booking a Taxi......");
		
		try 
		{
			Thread.sleep(2000);
		}
		
		catch (InterruptedException e) 
		{
			System.out.println("Booking is untruped......");
		}
		
		System.out.println("User "+userId+" is Booking is Confirmed....");	
	}
}

public class Prac2 
{
	public static void main(String[] args)
	{
		
		TaxiBooking tb = new TaxiBooking(1);
		TaxiBooking tb1 = new TaxiBooking(2);
		TaxiBooking tb2 = new TaxiBooking(3);
		
		tb.start();
		tb1.start();
		tb2.start();
		
	}

}
