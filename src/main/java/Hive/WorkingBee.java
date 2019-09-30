package hive;

public class WorkingBee extends Bee implements Beep {
	public enum BornBetween {
		honeybo, hibernation;
	}
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

	public WorkingBee(boolean sting) {
		super();
		this.sting=sting;
	}

	public WorkingBee(BornBetween bornBetween, int wings, int paws, int lifeSpan, boolean sting) {
		super(wings, paws, lifeSpan, sting);
		this.sting = sting;
		this.setBornBetween(bornBetween);
	}

	@Override
	public String toString() {
		return "Working bee have sting =" + sting +" "+  super.toString() + " ";
	}

	
}
