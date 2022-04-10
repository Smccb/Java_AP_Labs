import java.util.Vector;

public class TestFullHierarchy {
	public static void main(String [] args) {
		Computer c = new Computer("manufacturer", 3.0, 1000, 13);
		LaptopComputer lc = new LaptopComputer( "manufacturer", 3.0, 1000, 13, 50);
		WalkieTalkie w = new WalkieTalkie("Company name", 0.15, 15.0);
		MobilePhone mp = new MobilePhone("manufacturer", 1.5, "vodafone");
		
		//create electronic device object of type vector
				Vector <ElectronicDevice> ed= new Vector<ElectronicDevice>();
				
				//adding items to electronic device vector
				ed.addElement(c);
				ed.addElement(lc);
				ed.addElement(w);
				ed.addElement(mp);
				
				//looping through and printing electronic device vector
				for(int i=0; i < ed.size(); i++ ){
					System.out.println(ed.elementAt(i)+"\n");
				}
	}
}
