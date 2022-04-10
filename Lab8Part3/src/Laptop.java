
public class Laptop extends Computer{
	private String laptopBrand;
	private String colour;
	
	public Laptop(double screenSize, int amountOfRam, String gpu, String cpu, String laptopBrand, String colour) {
		super(screenSize, amountOfRam, gpu, cpu);
		// TODO Auto-generated constructor stub
		this.laptopBrand =laptopBrand;
		this.colour = colour;
		
	}
	
	
}
