import java.util.Vector;

public class testComputer {
	public static void main(String[] args) {
		
		Computer computer1 = new Computer(123.0, 12, "string", "strin");
		
		//Computer vector for objects
		Vector<Computer> computerGeneric = new Vector<Computer>();
		
		//looping through and printing car vector
		for(int i=0; i < computerGeneric.size(); i++ ){
			System.out.println(computerGeneric.elementAt(i).Computer()+"\n");
		}
	}
}
