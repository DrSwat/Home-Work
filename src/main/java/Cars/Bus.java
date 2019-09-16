package Cars;

public class Bus extends DieselCar {

	private boolean bodyExtention;

	public boolean isBodyExtention() {
		return bodyExtention;
	}

	public void setBodyExtention(boolean bodyExtention) {
		this.bodyExtention = bodyExtention;
	}

	public void signalBus() {
		System.out.println("BEEEEP");
	}

	public Bus() {
		super();
	}

	public Bus(String manufacturer, String title, int weight, int maxSpeed, int horsePower, double carLenght,
			double heightCar, KindOfEngine kindOfEngine, boolean bodyExtention) {
		super(manufacturer, title, weight, maxSpeed, horsePower, carLenght, heightCar, kindOfEngine);
		this.bodyExtention = bodyExtention;
	}

	@Override
	public String toString() {
		return super.toString() + " bodyExtention=" + bodyExtention;
	}

}
