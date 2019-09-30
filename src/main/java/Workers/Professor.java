package workers;


import workersOfUniversity.Classes;
import workersOfUniversity.WorkersOfUniversity;

public class Professor extends WorkersOfUniversity implements Classes {

	private int lectureGroups;
	private int practiceGroups;
	private String academicDegree = "PHD";
	public void heldClasses() {

		System.out.println("I held 1 classes");

	}

	public int getLectureGroups() {
		return lectureGroups;
	}

	public void setLectureGroups(int lectureGroups) {
		this.lectureGroups = lectureGroups;
	}

	public int getPracticeGroups() {
		return practiceGroups;
	}

	public void setPracticeGroups(int practiceGroups) {
		this.practiceGroups = practiceGroups;
	}

	public Professor(String firstName, String lastName, boolean higherEducation, Sex sex) {
		super(firstName, lastName, higherEducation, sex);

	}



	public Professor() {
		return;
	}

	



	@Override
	public String toString() {
		return super.toString() + " and I have academic degre is " + academicDegree;
	}

}
