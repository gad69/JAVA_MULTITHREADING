package multithreading;
class A{}
public class RunnableDemo extends A implements Runnable{
	
	public void run()
	{
		for(int i=1;i<=5;++i)
		{
			System.out.println("inside run method : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		RunnableDemo obj = new RunnableDemo();
		Thread t1 = new Thread(obj);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=6;i<=10;++i)
		{
			System.out.println("inside main method : "+i);
		}
	}

}
