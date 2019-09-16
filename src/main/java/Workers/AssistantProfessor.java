package Workers;


import WorkersOfUniversity.Classes;
import WorkersOfUniversity.WorkersOfUniversity;

public class AssistantProfessor extends WorkersOfUniversity implements Classes {

	private int practiceGroups;
	private String academicDegree = "P,HD";

	public int getPracticeGroups() {
		return practiceGroups;
	}

	public void setPracticeGroups(int practiceGroups) {
		this.practiceGroups = practiceGroups;
	}

	public void heldClasses() {
		System.out.println("I held 3 classes");

	}

	public AssistantProfessor(String firstName, String lastName, boolean higherEducation, Sex sex) {
		super(firstName, lastName, higherEducation, sex);

	}


	public AssistantProfessor() {
		return;
	}

	@Override
	public String toString() {
		return super.toString() + " and I have academic degre is " + academicDegree;
		
	}

}
