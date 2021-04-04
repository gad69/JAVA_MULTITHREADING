package multithreading;

public class ThreadPriorityDemo implements Runnable {
	
	public void run()
	{
		System.out.println("Thread Name : "+Thread.currentThread().getName()+"\t"+"Thread Priority : "+Thread.currentThread().getPriority());
		
	}

	public static void main(String[] args) {
		ThreadPriorityDemo obj = new ThreadPriorityDemo();
		Thread t1 = new Thread(obj, "First");
		Thread t2 = new Thread(obj, "Second");
		Thread t3 = new Thread(obj, "Three");
		Thread t4 = new Thread(obj, "Four");
		t1.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t3.setPriority(Thread.MIN_PRIORITY);
		t3.start();
		t4.setPriority(Thread.NORM_PRIORITY);
		t4.start();
	
	}

}
