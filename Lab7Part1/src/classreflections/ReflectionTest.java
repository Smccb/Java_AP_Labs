import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionTest {
	public String string1;// field

	public static void main(String[] args) {

		ReflectionTest tester = null;

		try {
			// newInstance method called directly is now deprecated!
			// tester = (ClassClassTester)Class.forName("ClassClassTester").newInstance();

			tester = (ReflectionTest) Class.forName("ReflectionTest").getDeclaredConstructor().newInstance();
			// Just get the class
			Class testClass = Class.forName("ReflectionTest");

			System.out.println("Name of class loaded: " + testClass.getName());

		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Calling a method on the tester object having never used 'new' to create it
		tester.multitest("test");// call to the method multi

		// Use instance to get all the public methods in the ClassClassTester class
		Method[] methods = tester.getClass().getDeclaredMethods();

		// Use class reference to use reflection to find names of methods
		for (int i = 0; i < methods.length; i++) {
			System.out.println("Method " + i + " is: " + methods[i].getName());
			
			//Get the parameters
			Parameter[] params = methods[i].getParameters();
			for (int j = 0; j < params.length; j++) {
				System.out.println("Param: " + params[j].getName() + " type: " + params[j].getType().toString());
			}
		}

	}
	
	}

	// Just some method to use for test purposes
	public void test1method() {
		System.out.println("Hello");

	}

	// Just some method to use for test purposes
	public void test2method() {
		System.out.println("Hello");

	}
	
	// Just some method to use for test purposes
		public int multitest(String test) {
			System.out.println("Hello, you called " + this.getClass().getName());
			return 0;
		}
}
