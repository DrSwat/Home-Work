package hive;

public abstract class Bee {

	private int wings;
	private int paws;
	private int lifeSpan;
	private boolean sting;

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	public int getPaws() {
		return paws;
	}

	public void setPaws(int paws) {
		this.paws = paws;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public boolean isSting() {
		return sting;
	}

	public void setSting(boolean sting) {
		this.sting = sting;
	}

	public Bee(int wings, int paws, int lifeSpan, boolean sting) {
		super();
		this.wings = wings;
		this.paws = paws;
		this.lifeSpan = lifeSpan;
		this.sting = sting;
	}

	public Bee() {

	}

	@Override
	public String toString() {
		return " wings=" + wings + ", paws=" + paws + ", lifeSpan=" + lifeSpan + " sting " + sting + " ";
	}

}
