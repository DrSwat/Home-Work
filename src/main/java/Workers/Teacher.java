package workers;

import workersOfUniversity.Classes;
import workersOfUniversity.WorkersOfUniversity;

public class Teacher extends WorkersOfUniversity implements Classes {

	Professor professor = new Professor();
	AssistantProfessor assistantProfessor = new AssistantProfessor();

	public enum ScientificDirector {
		professor, assistantProfessor
	}

	public void heldClasses() {
		System.out.println("I held 5 classes");

	}

	public Teacher() {
		super();
	}

	public Teacher(String firstName, String lastName, boolean higherEducation, Sex sex) {
		super(firstName, lastName, higherEducation, sex);
	}



	@Override
	public String toString() {
		return super.toString();
	}

}
