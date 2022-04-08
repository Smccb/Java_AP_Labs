package classreflections;

public class ReflectionTest {
	public static void main(String [] args) {
		//Class class1 = new Class(null, class1);
		//class1.getClass();
		ReflectionTest rF = new ReflectionTest();
		System.out.println(rF.getClass());
		
		getDeclaredConstructor(rF).newInstrance();
		
		System.out.println(rF.getName());
		System.out.println(rF.getClass());
	}

	private static Object getDeclaredConstructor() {
		
		return null;
	}
}
