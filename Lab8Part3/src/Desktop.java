
public class Desktop extends Computer{
	private int numOfMonitors;
	private String KeyboardType;
	private int numGlassPanels;
	private String CustomOrPreBuilt;
	private boolean rgb;
	
	public Desktop(double screenSize, int amountOfRam, String gpu, String cpu, int numOfMonitors, String keyboardType, int numGlassPanels, String customOrPreBuilt, boolean rgb) {
		super(screenSize, amountOfRam, gpu, cpu);
		this.numOfMonitors = numOfMonitors;
		this.KeyboardType = keyboardType;
		this.numGlassPanels = numGlassPanels;
		this.CustomOrPreBuilt = customOrPreBuilt;
		this.rgb = rgb;
	}
	
}
