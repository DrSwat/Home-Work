package games;

public class VRGames extends Games {

	private boolean movPlatforms;
	private boolean avatars;

	public void info() {
		System.out.println("https://ru.wikipedia.org/wiki/Виртуальная_реальность");
	}

	public boolean isMovPlatforms() {
		return movPlatforms;
	}

	public void setMovPlatforms(boolean movPlatforms) {
		this.movPlatforms = movPlatforms;
	}

	public boolean isAvatars() {
		return avatars;
	}

	public void setAvatars(boolean avatars) {
		this.avatars = avatars;
	}

	public VRGames(String gameGenre, Status status, int maxNumbUsers, boolean avatars, boolean movPlatforms) {
		super(gameGenre, status, maxNumbUsers);
		this.avatars = avatars;
		this.movPlatforms = movPlatforms;
	}

	public VRGames() {

	}

	@Override
	public String toString() {
		return "VR Games can have move Platforms=" + movPlatforms + ", avatars=" + avatars + " " + super.toString()
				+ " ";
	}

}
