
public class Desktop extends Computer{
	private int numOfMonitors;
	private String KeyboardType;
	private int numGlassPanels;
	private String CustomOrPreBuilt;
	private boolean rgb;
	
	public Desktop(double screenSize, int amountOfRam, String gpu, String cpu) {
		
		super(screenSize, amountOfRam, gpu, cpu);
		
		this.numOfMonitors = numOfMonitors;
		this.KeyboardType = KeyboardType;
		this.numGlassPanels = numGlassPanels;
		this.CustomOrPreBuilt = CustomOrPreBuilt;
		this.rgb = rgb;
	}
}
