
abstract class HandHeldDevice extends ElectronicDevice {
	protected double weight;
	
	public HandHeldDevice(String manufacturer, double weight) {
		super(manufacturer);
		this.weight = weight;
	} 
}
