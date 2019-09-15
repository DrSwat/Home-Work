package Workers;

import WorkersOfUniversity.WorkersOfUniversity;

public class Plumber extends WorkersOfUniversity {

	private int discharge;

	public void repairing() {
		System.out.println("I repaired 4 faucets");
	}

	public int getDischarge() {
		return discharge;
	}

	public void setDischarge(int discharge) {
		this.discharge = discharge;
	}

	public Plumber(String firstName, String lastName, boolean higherEducation, Sex sex) {
		super(firstName, lastName, higherEducation, sex);
	}

	public Plumber(String firstName, String lastName, boolean higherEducation, Sex sex, int discharge) {
		super(firstName, lastName, higherEducation, sex);
		this.discharge = discharge;
	}

	public Plumber() {
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
