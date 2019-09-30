package hive;

public class Drone extends Bee implements Fertilization {

	private boolean fertilization;

	public void fertilization(boolean fertilization) {
		if (fertilization) {
			System.out.println("The dron is fertilize");
		} else {
			System.out.println("The bee is not fertilize");
		}
	}

	public boolean isFertilization() {
		return fertilization;
	}

	public void setFertilization(boolean fertilization) {
		this.fertilization = fertilization;
	}

	public Drone(boolean fertilization) {
		this.fertilization = fertilization;
	}

	public Drone(int wings, int paws, int lifeSpan, boolean sting, boolean fertilization) {
		super(wings, paws, lifeSpan, sting);
		this.fertilization = fertilization;
	}

	@Override
	public String toString() {
		return "Drone can fertilize = " + fertilization + super.toString() + " ";
	}
}
