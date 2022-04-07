/**
 * Testing Computer Abstraction
 * Main class
 * @author Sarah McCabe
 *
 */
public class ComputerTest {
	/**
	 * main method
	 * @param args
	 */
	public static void main(String [] args) {
		Computer aC1 = new Computer(3.0, 1000, 27);
		Computer aC2 = new Computer(3.5, 500, 24);
		Computer aC3 = new Computer(4.2, 2000, 24);
		
		System.out.println("Computer 1: " + aC1);
		System.out.println("Computer 2: " + aC2);
		System.out.println("Computer 3: " + aC3);
	}
}
