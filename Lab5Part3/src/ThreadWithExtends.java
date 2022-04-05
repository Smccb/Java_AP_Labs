
public class ThreadWithExtends extends Thread {
	static String array[] = {" X ", " Y ", " Z "};
	
	public void run() {
		for(int i=0; i<=10; i++) {
			synchronized(array) {
				System.out.println(array[0]);
				System.out.println(array[1]);
				System.out.println(array[2]);
			}

		}
	}
}