
public class TestFullHierarchy {
	public static void main(String [] args) {
		Computer c = new Computer(3.0, 1000, 27);
		LaptopComputer lc = new LaptopComputer(3.0, 1000, 13, 50);
		WalkieTalkie w = new WalkieTalkie();
		MobilePhone mp = new MobilePhone();
		//HandHeldDevice hhd = new HandHeldDevice();
		
		System.out.println(c);
		System.out.println(lc);
		System.out.println(w);
		System.out.println(mp);
		//System.out.println(hhd);
	}
}
