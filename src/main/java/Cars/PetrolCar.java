package cars;

public class PetrolCar extends Cars {

	public enum FuelMixtureCreate {
		carburetor, injector;
	}

	public FuelMixtureCreate fuelMixtureCreate;

	public FuelMixtureCreate getFuelMixtureCreate() {
		return fuelMixtureCreate;
	}

	public void setFuelMixtureCreate(FuelMixtureCreate fuelMixtureCreate) {
		this.fuelMixtureCreate = fuelMixtureCreate;
	}

	public PetrolCar() {
		super();
	}

	public PetrolCar(String manufacturer, String title, int weight, int maxSpeed, int horsePower, double carLenght,
			double heightCAr, FuelMixtureCreate fuelMixtureCreate) {
		super(manufacturer, title, weight, maxSpeed, horsePower, carLenght, heightCAr);
		this.setFuelMixtureCreate(fuelMixtureCreate);
	}

	@Override
	public String toString() {
		return super.toString() + " fuelMixtureCreate=" + fuelMixtureCreate;
	}

}
