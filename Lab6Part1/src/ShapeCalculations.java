
public class ShapeCalculations {
	public static void main(String[] args) {

		//sample values
		double r = 5, h = 15;

		//calling methods from utility, printing calculations
		System.out.println("PI is " + VolumeCalculations.PI);
		System.out.println("Volume of a Sphere: " + VolumeCalculations.sphereVolCalculation(r));
		System.out.println("Volume of a cylinder: " + VolumeCalculations.cylinderVolCalculation(r, h));
		System.out.println("Volume of a cone: " + VolumeCalculations.coneVolCalculation(r, h));
	}
}