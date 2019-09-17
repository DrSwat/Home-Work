package Watch;

import java.util.Date;

public class WristWatch extends Watch implements Time {
	Date date = new Date();
	private int weight;

	public void showTime() {
		System.out.println("Current data and time " + date.toString());
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public WristWatch() {
		super();
	}

	public WristWatch(DriveUnit driveUnit, boolean strap, boolean cain, String type, int weight) {
		super(driveUnit, strap, cain, type);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return super.toString() + " weight=" + weight + " ";
	}

}
