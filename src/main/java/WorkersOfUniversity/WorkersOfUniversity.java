package workersOfUniversity;

public abstract class WorkersOfUniversity {

	public enum Sex {
		male, female, undefined
	}

	public String firstName;
	private String lastName;
	private int age;
	private int weight;
	public boolean higherEducation;
	public Sex sex;

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHigherEducation() {
		return higherEducation;
	}

	public void setHigherEducation(boolean higherEducation) {
		this.higherEducation = higherEducation;
	}

	



	public WorkersOfUniversity(String firstName, String lastName, boolean higherEducation, Sex sex) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.higherEducation = higherEducation;
		this.setSex(sex);

	}

	public WorkersOfUniversity() {
		super();
	}

	@Override
	public String toString() {
		return "Hi my name is " + firstName + " " + lastName + " higer education " + higherEducation + " , sex is "
				+ sex;
	}

}
