
//Extends thread example
public class ThreadWithExtends extends Thread {
	static String array[] = {" X ", " Y ", " Z "};
	
	//run method built into Thread class
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(array[0]);
			System.out.println(array[1]);
			System.out.println(array[2]);
		}
	}
}