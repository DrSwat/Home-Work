package cars;

public class Car extends Cars {

	public enum TypeCar {
		sedan, hactchback;
	}

	public TypeCar typeCar;

	public TypeCar getTypeCar() {
		return typeCar;
	}

	public void setTypeCar(TypeCar sedan) {
		this.typeCar = sedan;
	}

	public void signalCar() {
		System.out.println("beep");
	}

	public Car() {
		super();
	}

	public Car(String manufacturer, String title, int weight, int maxSpeed, int horsePower, double carLenght,
			double heightCar, TypeCar typeCar) {
		super(manufacturer, title, weight, maxSpeed, horsePower, carLenght, heightCar);
		this.setTypeCar(typeCar);
	}

	@Override
	public String toString() {
		return super.toString() + " typeCar=" + typeCar;
	}
}
