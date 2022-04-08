
public class MobilePhone extends HandHeldDevice {
	String networkName;
	
	public MobilePhone(String manufacturer, double weight, String networkName) {
		super(manufacturer, weight);
		this.networkName = networkName;
	}
}
