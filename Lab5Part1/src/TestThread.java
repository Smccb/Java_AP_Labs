
public class TestThread {
	public static void main(String [] args) {
		ThreadWithExtends t1 = new ThreadWithExtends();
		ThreadWithExtends t2 = new ThreadWithExtends();
		ThreadWithExtends t3 = new ThreadWithExtends();
		
		//Runnable Thread t1 = new Thread(new ThreadWithRunnable()).start()
		t1.start();
		t2.start();
		t3.start();
	}
}