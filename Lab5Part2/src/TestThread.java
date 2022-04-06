public class TestThread {
	public static void main(String [] args) {
		
		//Threads class new objects
		Thread t1 = new Thread(new ThreadWithRunnable());
		Thread t2 = new Thread(new ThreadWithRunnable());
		Thread t3 = new Thread(new ThreadWithRunnable());
		
		//start threads for run method
		t1.start();
		t2.start();
		t3.start();
	
	}
}