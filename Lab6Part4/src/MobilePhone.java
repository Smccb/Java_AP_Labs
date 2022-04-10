
public class MobilePhone extends HandHeldDevice {
	String networkName;
	
	public MobilePhone(String manufacturer, double weight, String networkName) {
		super(manufacturer, weight);
		this.networkName = networkName;
	}
	
	public String toString() {
		return "manufacturer " + this.manufacturer + " weight " + this.weight + " network name " + this.networkName;
	}
}
