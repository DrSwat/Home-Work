
package watch;

import java.util.Date;

public class PocketWatch extends Watch implements Time {
	Date date = new Date();
	private int diameter;

	public void showTime() {
		System.out.println("Current data and time " + date.toString());
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public PocketWatch() {
		super();
	}

	public PocketWatch(DriveUnit driveUnit, boolean strap, boolean cain, String type, int diameter) {
		super(driveUnit, strap, cain, type);
		this.diameter = diameter;

	}

	@Override
	public String toString() {
		return "PocketWatch [diameter=" + diameter + "]";
	}

}
