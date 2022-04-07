/**
 * 
 * @author Sarah McCabe
 *
 */

public class LaptopComputer extends Computer {
	private int batteryLife;
	
	/**
	 * 
	 */
	public LaptopComputer() {
		
	}
	
	/**
	 * 
	 * @param processorSpeed
	 * @param memory
	 * @param screenSize
	 * @param batteryLife
	 */
	public LaptopComputer(double processorSpeed, int memory, int screenSize, int batteryLife) {
		super(processorSpeed, memory, screenSize);
		this.batteryLife = batteryLife;
	}
	
	/**
	 * uses super string from parent class and creates new string for this class
	 * @return String
	 */
	public String toString() {
		return super.toString() + ", " + this.batteryLife + "%";
	}
	
}
