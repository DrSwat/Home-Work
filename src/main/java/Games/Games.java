package Games;

public abstract class Games {
	
	
	public enum Status{
		online, offline, mix;
	}
	private String gameGenre;
	private Status status;
	private int maxNumbUsers;
	public String getGameGenre() {
		return gameGenre;
	}
	public void setGameGenre(String gameGenre) {
		this.gameGenre = gameGenre;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getMaxNumbUsers() {
		return maxNumbUsers;
	}
	public void setMaxNumbUsers(int maxNumbUsers) {
		this.maxNumbUsers = maxNumbUsers;
	}
	public Games() {
		super();
	}
	public Games(String gameGenre, Status status, int maxNumbUsers) {
		super();
		this.gameGenre = gameGenre;
		this.status = status;
		this.maxNumbUsers = maxNumbUsers;
	}
	@Override
	public String toString() {
		return " also games have game genre = " + gameGenre + ", status on/off = " + status + ", maximum number of users = " + maxNumbUsers
				+ " ";
	}
	
}
