package cars;

public class ElectricCar extends Cars {

	private int numberOfEngine;
	private int travelDistance;
	private double enginekW;

	public int getNumberOfEngine() {
		return numberOfEngine;
	}

	public void setNumberOfEngine(int numberOfEngine) {
		this.numberOfEngine = numberOfEngine;
	}

	public int getTravelDistance() {
		return travelDistance;
	}

	public void setTravelDistance(int travelDistance) {
		this.travelDistance = travelDistance;
	}

	public double getEnginekW() {
		return enginekW;
	}

	public void setEnginekW(double enginekW) {
		this.enginekW = enginekW;
	}

	public ElectricCar() {
		return;

	}

	public ElectricCar(String manufacturer, String title, int weight, int maxSpeed, int horsePower, double carLenght,
			double heightCAr, int numberOfEngine, int travelDistance, double enginekW) {
		super(manufacturer, title, weight, maxSpeed, horsePower, carLenght, heightCAr);
		this.numberOfEngine = numberOfEngine;
		this.enginekW = enginekW;
		this.travelDistance = travelDistance;
	}

	@Override
	public String toString() {
		return super.toString() + " numberOfEngine=" + numberOfEngine + ", travelDistance=" + travelDistance
				+ ", enginekW=" + enginekW;
	}
}
