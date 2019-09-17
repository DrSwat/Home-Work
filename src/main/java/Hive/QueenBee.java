package Hive;

public class QueenBee extends Bee implements EggLaying {

	boolean eggLaying;

	public void eggLaying(boolean eggLaying) {
		if (eggLaying) {
			System.out.println("The queen is laying egg");
		} else {
			System.out.println("The queen is not laying egg");
		}
	}

	public boolean isEggLaying() {
		return eggLaying;
	}

	public void setEggLaying(boolean eggLaying) {
		this.eggLaying = eggLaying;
	}

	public QueenBee(boolean eggLaying) {
		this.eggLaying = eggLaying;
	}

	public QueenBee(int wings, int paws, int lifeSpan, boolean sting, boolean eggLaying) {
		super(wings, paws, lifeSpan, sting);
		this.eggLaying = eggLaying;
	}

	@Override
	public String toString() {
		return "Queen Bee can laying eggs =" + eggLaying + super.toString() + " ";
	}
}
