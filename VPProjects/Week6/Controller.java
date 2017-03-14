public class Controller {

	public static void main() {
		int numTestClass = numInstances(); //int to store number of instances of testclass created
		System.out.println("number of instances created is " + numTestClass);
	}

	public int numInstances() {
		TestClass test1 = TestClass.getInstance();
		TestClass test2 = TestClass.getInstance();
		return test2.getNumber();
	}

}
