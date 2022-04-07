
/**
 * Abstraction of a Computer
 * @author Sarah McCabe
 *
 */
public class Computer extends ElectronicDevice {
	private double processorSpeed;
	private int memory;
	private int screenSize;

	/**
	 * default constructor
	 */
	public Computer() {
		
	}
	
	/**
	 * 
	 * @param processorSpeed
	 * @param memory
	 * @param screenSize
	 */
	public Computer(double processorSpeed, int memory, int screenSize){
		this.processorSpeed = processorSpeed;
		this.memory = memory;
		this.screenSize = screenSize;
	}
	
	/**
	 * toString method
	 * @return String
	 */
	public String toString() {
		return this.processorSpeed + " Gz, " + this.memory + " GB, " + this.screenSize + " inch";
	}
}
