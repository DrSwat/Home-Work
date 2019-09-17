package Games;

public class PhoneGames extends Games {

	private boolean useCamera;

	public void info() {
		System.out.println("https://ru.wikipedia.org/wiki/Игры_для_мобильных_устройств");
	}

	public boolean isUseCamera() {
		return useCamera;
	}

	public void setUseCamera(boolean useCamera) {
		this.useCamera = useCamera;
	}

	public PhoneGames() {
		super();
	}

	public PhoneGames(String gameGenre, Status status, int maxNumbUsers, boolean useCamera) {
		super(gameGenre, status, maxNumbUsers);
		this.useCamera = useCamera;
	}

	@Override
	public String toString() {
		return "Phone games can use camera = " + useCamera + " " + super.toString() + " ";
	}

}
