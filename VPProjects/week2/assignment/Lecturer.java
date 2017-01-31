public class Lecturer {
	String lecName;
	Modules mod1;	

	public Lecturer() {
		lecName = "dick grayson";
		mod1 = new Modules();
	}

	public String toString() {
		return lecName + ", who teaches " + mod1.toString();
	}
}
