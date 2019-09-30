package cars;

public class CargoFreight extends DieselCar {
	private int curbWeight;

	public int getCurbWeight() {
		return curbWeight;
	}

	public void setCurbWeight(int curbWeight) {
		this.curbWeight = curbWeight;
	}

	public void signalCargo() {
		System.out.println("BEEP");
	}

	public CargoFreight() {
		super();
	}

	public CargoFreight(String manufacturer, String title, int weight, int maxSpeed, int horsePower, double carLenght,
			double heightCAr, KindOfEngine kindOfEngine, int curbWeight) {
		super(manufacturer, title, weight, maxSpeed, horsePower, carLenght, heightCAr, kindOfEngine);
		this.curbWeight = curbWeight;
	}

	@Override
	public String toString() {
		return super.toString() + " curbWeight=" + curbWeight;
	}
}
