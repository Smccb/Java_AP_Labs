/**
 * 
 * @author Sarah McCabe
 *
 */
//Extends Threads example
public class ThreadWithExtends extends Thread {
	static String array[] = {" X ", " Y ", " Z "};
	
	/**
	 * built in method in Thread class
	 */
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