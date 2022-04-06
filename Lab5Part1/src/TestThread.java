
public class TestThread {
	public static void main(String [] args) {
		//initalise ThreadWithExtends objects
		ThreadWithExtends t1 = new ThreadWithExtends();
		ThreadWithExtends t2 = new ThreadWithExtends();
		ThreadWithExtends t3 = new ThreadWithExtends();
	
		//start Threads to run method in other class
		t1.start();
		t2.start();
		t3.start();
	}
}