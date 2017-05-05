public class Test {

	public void main(String[] args) {
		OriginalEmp original = new OriginalEmp();
		Manager manager = new Manager();

		original.setName("John");
		manager.addSave(original.saveToCopy());
		
		original.setName("Joanne");
		manager.addSave(original.saveToCopy());

		original setName("Marth");

		System.out.println("employee's current name is: " + original.getName());
		System.out.println("employee's previous names are: ");
		for(int i = 0; i < 3; i++){
			original.getFromCopy(manager.getSave(i));
			System.out.println(original.getName());
		}
	}

}
