public class Modules {
	String modName;
	Student stu1;

	public Modules {
		modName = "chemistry";
		stu1 = new Student();
	}

	public String toString() {
		return "module name : " + modName + ", attended by " stu1.toString();
	}
}
