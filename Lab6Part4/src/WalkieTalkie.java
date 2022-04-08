
public class WalkieTalkie extends HandHeldDevice {
	private double rangeInKm;
	
	public WalkieTalkie(String manufacturer, double weight, double randgeInKm) {
		super(manufacturer, weight);
		this.rangeInKm = rangeInKm;
	}
	
	public String toString() {
		return "Manufacturer: "+ this.manufacturer + ", Weight: " + this.weight + ", Range: " + this.rangeInKm + " km";
		
	}
}
