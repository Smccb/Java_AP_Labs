
//implements Runnable example
public class ThreadWithRunnable implements Runnable {
	static String array[] = {" 1 ", " 2 ", " 3 "};
	
	//run method built into Threads class
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(array[0]);
			System.out.println(array[1]);
			System.out.println(array[2]);
		}
	}
}