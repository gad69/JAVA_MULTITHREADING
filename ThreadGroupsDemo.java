package multithreading;

public class ThreadGroupsDemo {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("FirstGroup");
		Thread t1 = new Thread(tg,"one");
		Thread t2 = new Thread(tg,"two");
		ThreadGroup tg1 = new ThreadGroup(tg,"SecondGroup");
		Thread t3 = new Thread(tg1,"three");
		Thread t4 = new Thread(tg1,"four");
		tg.setMaxPriority(10);
		tg1.setMaxPriority(8);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("Parent Group Name : "+tg1.getParent());
		System.out.println("Active Threads : "+tg.activeCount());
		

	}

}
