package watch;

import watch.Watch.DriveUnit;

public class StartWatch {
	
	public static void main(String[] args) {
		PocketWatch pW = new PocketWatch();
		WristWatch wW = new WristWatch();
		PocketWatch pocketWatch = new PocketWatch(DriveUnit.quartz, false, true, "Pocket Watch", 55);
		WristWatch wristWatch = new WristWatch(DriveUnit.mechanics, true, false, "Wrist Watch", 130);
		
		
		System.out.println(pocketWatch);
		System.out.println(wristWatch);
		wW.showTime();
		pW.showTime();
	}
	
	
	
			
}
