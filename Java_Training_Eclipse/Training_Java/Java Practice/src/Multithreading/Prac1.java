package Multithreading;

//by extending thread class

class mythread extends Thread
{
	public void run()
	{
		for(int i = 1 ; i<= 10 ;i++)
		{
			System.out.println(Thread.currentThread().getName() + " - Count: " + i);
		
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

public class Prac1 {

	public static void main(String[] args) throws InterruptedException 
	{
		mythread th = new mythread();
		mythread th1 = new mythread();
	
		th.start();
		th.join();
		
		th1.start();
		th1.join();
	}

}
