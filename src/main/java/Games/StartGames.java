package games;

import games.Games.Status;

public class StartGames {

	public static void main(String[] args) {
		PCGames pcG = new PCGames();
		PhoneGames phG = new PhoneGames();
		VRGames vRG = new VRGames();
		PCGames pcGames = new PCGames("Strategy", Status.offline, 24, true);
		PhoneGames phoneGames = new PhoneGames("Casual", Status.online, 1, false);
		VRGames vrGames = new VRGames("Shoter", Status.online, 10, false, true);
		
		
		pcG.info();
		phG.info();
		vRG.info();
		System.out.println(pcGames);
		System.out.println(phoneGames);
		System.out.println(vrGames);
	}

}
