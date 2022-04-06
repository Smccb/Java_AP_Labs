
public class Computer {
	private double processorSpeed;
	private int memory;
	private int screenSize;

	public Computer() {
		
	}
	
	public Computer(double processorSpeed, int memory, int screenSize){
		this.processorSpeed = processorSpeed;
		this.memory = memory;
		this.screenSize = screenSize;
	}
	
	public String toString() {
		return this.processorSpeed + " Gz, " + this.memory + " GB, " + this.screenSize + " inch";
	}
}