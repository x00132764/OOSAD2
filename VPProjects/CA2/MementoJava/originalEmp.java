public class originalEmp {

	private String name;

	public OriginalEmp(){

	}

	/**
	 * 
	 * @param c
	 */
	public void setName(String name) {
		this.name = name
	}

	public String getName() {
		return name;
	}

	public EmpCopy saveToCopy() {
		return new EmpCopy(name);
	}
	
	public void getFromCopy(EmpCopy copy){
		//extracts the data from the copy and uses this data to overwrite it's own
		name = copy.getName();
	}
}
