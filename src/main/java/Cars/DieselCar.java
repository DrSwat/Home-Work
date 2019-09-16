package Cars;

public class DieselCar extends Cars {

	public enum KindOfEngine {
		HDI, TDI, SDI
	}

	public KindOfEngine kindOfEngine;

	public KindOfEngine getKindOfEngine() {
		return kindOfEngine;
	}

	public void setKindOfEngine(KindOfEngine kindOfEngine) {
		this.kindOfEngine = kindOfEngine;
	}

	public DieselCar() {
		super();

	}

	public DieselCar(String manufacturer, String title, int weight, int maxSpeed, int horsePower, double carLenght,
			double heightCAr, KindOfEngine kindOfEngine) {
		super(manufacturer, title, weight, maxSpeed, horsePower, carLenght, heightCAr);
		this.setKindOfEngine(kindOfEngine);
	}

	@Override
	public String toString() {
		return super.toString() + " kindOfEngine=" + kindOfEngine;
	}

}
