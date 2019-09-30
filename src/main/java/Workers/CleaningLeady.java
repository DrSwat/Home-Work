package workers;


import workersOfUniversity.WorkersOfUniversity;

public class CleaningLeady extends WorkersOfUniversity {

	int[] classesList;

	public void classClean() {
		System.out.println("I cleaned 5 classes");
	}

	public int[] getClassesList() {
		return classesList;
	}

	public void setClassesList(int[] classesList) {
		this.classesList = classesList;
	}

	public CleaningLeady(String firstName, String lastName, boolean higherEducation, Sex sex) {
		super(firstName, lastName, higherEducation, sex);

	}

	public CleaningLeady() {

	}

	@Override
	public String toString() {
		return super.toString();
	}


	

}

	
