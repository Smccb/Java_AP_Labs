
//utilities class
public final class VolumeCalculations {

	//PI global
	final static double PI = 3.14159;

	//Sphere volume calculator
	public static double sphereVolCalculation(double r) {
		double vSphere;
		vSphere = (4.0/3.0) * PI * (r*r*r);
		return vSphere;
	}

	//Cylinder volume calculator
	public static double cylinderVolCalculation(double r, double h) {
		double vcylinder;

		vcylinder = PI * (r*r) * h;
		return vcylinder;
	}

	//cone volume calculator
	public static double coneVolCalculation(double r, double h) {
		double vCone;
		vCone = PI * (r * r) * h  /3;
		return vCone;
	}
}