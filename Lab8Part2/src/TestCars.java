import java.util.Vector;

//main class/ test class
public class TestCars {
	public static void main(String[] args) {
		
		//creating objects of automatic and manual car objects
		AutomaticCar automaticCar1 = new AutomaticCar();
		AutomaticCar automaticCar2 = new AutomaticCar();
		
		ManualCar ManualCar1 = new ManualCar();
		ManualCar ManualCar2 = new ManualCar();
		
		//create car object of type vector
		Vector <Car> listOfCars= new Vector<Car>();
		
		//adding items to Car vector
		listOfCars.addElement(automaticCar1);
		listOfCars.addElement(ManualCar1);
		listOfCars.addElement(automaticCar2);
		listOfCars.addElement(ManualCar2);
		
		//looping through and printing car vector
		for(int i=0; i < listOfCars.size(); i++ ){
			System.out.println(listOfCars.elementAt(i).changeGearInstrcutions()+"\n");
		}
	}
}
