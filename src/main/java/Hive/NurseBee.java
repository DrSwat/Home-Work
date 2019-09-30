package hive;

import hive.WorkingBee.BornBetween;

public class NurseBee extends Bee implements Beep {

	private boolean sting;
	BornBetween bornBetween;

	public void sting(boolean sting) {
		if (sting) {
			System.out.println("The bee is stung");
		} else {
			System.out.println("The bee is not stug");
		}
	}

	public boolean isSting() {
		return sting;
	}

	public void setSting(boolean sting) {
		this.sting = sting;
	}

	public BornBetween getBornBetween() {
		return bornBetween;
	}

	public void setBornBetween(BornBetween bornBetween) {
		this.bornBetween = bornBetween;
	}

	public NurseBee(boolean sting) {
		this.sting = sting;

	}

	public NurseBee(BornBetween bornBetween, int wings, int paws, int lifeSpan, boolean sting) {
		super(wings, paws, lifeSpan, sting);
		this.setBornBetween(bornBetween);
	}

	@Override
	public String toString() {
		return "Nurse Bee have sting = " + sting + ", bornBetween = " + bornBetween + super.toString() + " ";
	}
}
