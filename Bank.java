package multithreading;

class Customer
{
	public double amount = 10000;
	
	public synchronized void withdraw(double wamount)
	{
		if(amount>=wamount)
		{
			amount = amount - wamount;
			System.out.println("Successfully Withdraw Compled");
			System.out.println("Updated Balance : "+amount);
		}else{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			amount = amount - wamount;
			System.out.println("Successfully Withdraw Compled");
			System.out.println("Updated Balance : "+amount);
		}
	}
	public synchronized void deposit(double damount)
	{
		amount = amount + damount;
		System.out.println("Succesfully Deposit completed");
		System.out.println("Updated Balance : "+amount);
		notify();
	}
}
public class Bank {

	public static void main(String[] args) {
		final Customer c = new Customer();
		
		Thread t1 = new Thread(){
			public void run()
			{
				c.withdraw(15000);
			}
		};
		t1.start();
		Thread t2 = new Thread(){
			public void run()
			{
				c.deposit(10000);
			}
		};
		t2.start();
	}

}
