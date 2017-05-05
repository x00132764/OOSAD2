public class ActualEmployee extends Employee {

	private String empName 	//name of the employee	


	public ActualEmployee(String empName){
		this.empName = empName;
	}
	
	public void printName() {
		System.out.println("employee's name is" + empName);
	}


	

}
