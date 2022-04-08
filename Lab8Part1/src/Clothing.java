
public class Clothing {
	private String designer;
	private String colour;
	private String material;
	
	//default constructor
	public Clothing() {
		
	}
	
	//constructor passing only one item
	public Clothing(String designer) {
		this.designer = designer;
	}
	
	//constructor passing two attributes
	public Clothing(String designer, String colour) {
		this.designer = designer;
		this.colour = colour;
	}
	
	//constructor passing all attributes
	public Clothing(String designer, String colour, String material) {
		this.designer = designer;
		this.colour = colour;
		this.material = material;
	}
	
	public String toString() {
		return "designer " + this.designer + ", colour "+ this.colour + ", material " + this.material;
	}
}
