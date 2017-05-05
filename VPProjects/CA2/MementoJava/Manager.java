import java.util.ArrayList;
import java.util.List;

public class Manager {
	private List<EmpCopy> copyList = new ArrayList<EmpCopy>(); //a list of saves

	public Manager(){

	}

	public void addSave(EmpCopy save){
		//adds a save state to the list
		copyList.add(save);
	} 

	public Memento getSave(int position){
		//returns the save at the specified position
		return copyList.get(position);
	}
}
