
public class TestLab8Part1 {
	public static void main(String [] args) {
		
		//initalising with different constructors
		//default
		Clothing defaultConstructor = new Clothing();
		
		//passing one item
		Clothing oneConstructor = new Clothing("Designer");
		
		//passing two constructor
		Clothing twoConstructor = new Clothing("Designer ", "Black");
		
		//passing 3 items constructor
		Clothing threeConstructor = new Clothing("Designer ", "Black ", "Leather ");
		
		
		System.out.println(defaultConstructor);
		System.out.println(oneConstructor);
		System.out.println(twoConstructor);
		System.out.println(threeConstructor);
	}
}
