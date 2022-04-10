
public class Computer 
{
	private double screenSize;
	private int amountOfRam;
	private String gpu;
	private String cpu;
	
	public Computer() {
	
	}
	
	public Computer(double screenSize, int amountOfRam, String gpu, String cpu){
		this.screenSize = screenSize;
		this.amountOfRam = amountOfRam;
		this.gpu = gpu;
		this.cpu = cpu;
	}
}
