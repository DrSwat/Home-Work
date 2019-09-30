package cars;

public class Truck extends DieselCar {

	private int carryingCapasity;

	public int getCarryingCapasity() {
		return carryingCapasity;
	}

	public void signalTruck() {
		System.out.println("TOOOOOOOOOOOOOOOO!");
	}

	public void setCarryingCapasity(int carryingCapasity) {
		this.carryingCapasity = carryingCapasity;
	}

	public Truck() {
		super();
	}

	public Truck(String manufacturer, String title, int weight, int maxSpeed, int horsePower, double carLenght,
			double heightCAr, KindOfEngine kindOfEngine, int carryingCapasity) {
		super(manufacturer, title, weight, maxSpeed, horsePower, carLenght, heightCAr, kindOfEngine);
		this.carryingCapasity = carryingCapasity;
	}

	@Override
	public String toString() {
		return super.toString() + " carryingCapasity=" + carryingCapasity;
	}

}
