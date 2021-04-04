package multithreading;

public class ThreadDemo extends Thread {
	
	public void run()
	{
		for(int i=1;i<=5;++i)
		{
			System.out.println("inside run method : "+i);
		}
	}
	public void start()
	{
		super.start();
		System.out.println("--start--");
	}

	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		for(int i=6;i<=10;++i)
		{
			System.out.println("inside main method : "+i);
		}

	}

}
