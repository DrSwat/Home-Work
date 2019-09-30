package lesson2;

import java.util.HashSet;
import java.util.Set;

public class Employee extends Man {
	private String position;
	private IdCard idCard;
	private Set room = new HashSet();
	private Department department;
	private Set pastPosition = new HashSet();

	// создаем и конструктор
	public Employee(String n, String s, String p) {
		name = n;
		surname = s;
		position = p;
	}

	public void setPosition(String newProfession) {
		position = newProfession;
	}

	public String getPosition() {
		return position;
	}

	public void setIdCard(IdCard c) {
		idCard = c;
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public void setRoom(Room newRoom){
	    room.add(newRoom);
	}

	public Set getRoom() {
		return room;
	}

	public void deleteRoom(Room r) {
		room.remove(r);
	}

	public void setDepartment(Department d){
	    department = d;
	}
	public Department getDepartment(){
	    return department;
	}
	public void setPastPosition(PastPosition p){
	     pastPosition.add(p);
	}
	public Set getPastPosition(){
	     return pastPosition;
	}
	public void deletePastPosition(PastPosition p){
	     pastPosition.remove(p);
	}

}
