package cars;

public abstract class Cars {

	private String manufacturer;
	private String title;
	private int weight;
	private int maxSpeed;
	private int horsePower;
	private double carLenght;
	private double heightCar;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public double getCarLenght() {
		return carLenght;
	}

	public void setCarLenght(double carLenght) {
		this.carLenght = carLenght;
	}

	public double getHeightCAr() {
		return heightCar;
	}

	public void setHeightCAr(double heightCAr) {
		this.heightCar = heightCAr;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Cars(String manufacturer, String title, int weight, int maxSpeed, int horsePower, double carLenght,
			double heightCAr) {
		super();
		this.manufacturer = manufacturer;
		this.title = title;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
		this.horsePower = horsePower;
		this.carLenght = carLenght;
		this.heightCar = heightCAr;
	}

	public Cars() {
		return;
	}

	@Override
	public String toString() {
		return "This car was created by company " + manufacturer + ", she is name " + title + ", weight=" + weight
				+ ", maxSpeed=" + maxSpeed + ", horsePower=" + horsePower + ", carLenght=" + carLenght + ", heightCAr="
				+ heightCar;
	}

}
