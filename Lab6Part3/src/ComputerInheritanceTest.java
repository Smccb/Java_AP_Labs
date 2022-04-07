/**
 * Class to create objects and test LaptopComputer and Computer classes
 * @author Sarah McCabe
 *
 */
public class ComputerInheritanceTest {
	public static void main(String[] args) {
		
		//Computer
		Computer C1 = new Computer(3.0, 1000, 27);
		Computer C2 = new Computer(3.5, 500, 24);
		Computer C3 = new Computer(4.2, 2000, 24);
		
		System.out.println("Computer 1: " + C1);
		System.out.println("Computer 2: " + C2);
		System.out.println("Computer 3: " + C3);
		
		System.out.println();
		
		//Laptop
		LaptopComputer L1 = new LaptopComputer(3.0, 1000, 13, 50);
		LaptopComputer L2 = new LaptopComputer(3.5, 250, 14, 35);
		LaptopComputer L3 = new LaptopComputer(4.2, 500, 14, 26);
		
		System.out.println("LaptopComputer 1: " + L1);
		System.out.println("LaptopComputer 2: " + L2);
		System.out.println("LaptopComputer 3: " + L3);
	}
}
