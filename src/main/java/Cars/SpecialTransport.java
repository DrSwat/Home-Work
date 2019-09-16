package Cars;

public class SpecialTransport extends ElectricCar {

	private String destination;

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void specSignal() {
		System.out.println("yiu-yiu-yiu-yiu-yiu");
	}

	public SpecialTransport() {
		super();
	}

	public SpecialTransport(String manufacturer, String title, int weight, int maxSpeed, int horsePower,
			double carLenght, double heightCAr, int numberOfEngine, int travelDistance, double enginekW,
			String destination) {
		super(manufacturer, title, weight, maxSpeed, horsePower, carLenght, heightCAr, numberOfEngine, travelDistance,
				enginekW);
		this.destination = destination;
	}

	@Override
	public String toString() {
		return super.toString() + " destination=" + destination;
	}
}
