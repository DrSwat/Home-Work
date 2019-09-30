package hive;

import hive.WorkingBee.BornBetween;

public class StartHive {

	public static void main(String[] args) {
		WorkingBee wBee = new WorkingBee(true);
		WorkingBee workingBee = new WorkingBee(BornBetween.honeybo,4, 6, 35, true);
		NurseBee nBee = new NurseBee(true);
		NurseBee nurseBee = new NurseBee(BornBetween.honeybo, 4, 6, 35, true);
		QueenBee qBee = new QueenBee(true);
		QueenBee queenBee = new QueenBee(4, 6, 1830, true, true);
		Drone dr = new Drone(true);
		Drone drone = new Drone(4, 6, 60, false, true);
		
		System.out.println(queenBee);
		System.out.println(drone);
		System.out.println(nurseBee);
		System.out.println(workingBee);
		qBee.eggLaying(true);
		nBee.sting(true);
		wBee.sting(true);
		dr.fertilization(true);
		
				
	}

}
