package Watch;

public abstract class Watch {

	public enum DriveUnit {
		mechanics, electronic, quartz;
	}

	private DriveUnit driveUnit;
	private boolean strap;
	private boolean cain;
	private String type;

	public DriveUnit getDriveUnit() {
		return driveUnit;
	}

	public void setDriveUnit(DriveUnit driveUnit) {
		this.driveUnit = driveUnit;
	}

	public boolean isStrap() {
		return strap;
	}

	public void setStrap(boolean strap) {
		this.strap = strap;
	}

	public boolean isCain() {
		return cain;
	}

	public void setCain(boolean cain) {
		this.cain = cain;
	}

	public Watch() {
		super();
	}

	public Watch(DriveUnit driveUnit, boolean strap, boolean cain, String type) {
		super();
		this.driveUnit = driveUnit;
		this.strap = strap;
		this.cain = cain;
		this.type = type;
	}

	@Override
	public String toString() {
		return " Watches are "+ type + " and they can be drive unit = " + driveUnit + ", strap=" + strap + ", cain=" + cain + " ";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
