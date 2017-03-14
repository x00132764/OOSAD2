public class TestClass {

	private static TestClass instance;
	private static int number = 0;

	private TestClass() {
		number++;
	}

	public static TestClass getInstance() {
		if (instance == null) {
			instance = new TestClass();
		}
		return instance;
	}

	public int getNumber() {
		return number;
	}

}
