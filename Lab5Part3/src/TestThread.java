
public class TestThread {
	public static void main(String [] args) {
		
		//initalise objects for extends example
		ThreadWithExtends t1 = new ThreadWithExtends();
		ThreadWithExtends t2 = new ThreadWithExtends();
		ThreadWithExtends t3 = new ThreadWithExtends();
		
		//starting threads
		t1.start();
		t2.start();
		t3.start();
		
		//initalise objects for WithRunnable example
		Thread t4 = new Thread(new ThreadWithRunnable());
		Thread t5 = new Thread(new ThreadWithRunnable());
		Thread t6 = new Thread(new ThreadWithRunnable());
		
		//starting threads
		t4.start();
		t5.start();
		t6.start();
	}
}