public class EmployeeProxy extends Employee {

	private ActualEmployee actualEmp;
	private String empName;

	public EmployeeProxy(String empName){
		this.empName = empName;
	}

	public void printName() {
		if (actualEmp == null){
			actualEmp = new ActualEmployee(empName);
		}
		actualEmp.printName();
	}
}
