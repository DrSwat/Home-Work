package Games;

public class PCGames extends Games {
	

	private boolean useMouse;
	
	public void info() {
		System.out.println("https://ru.wikipedia.org/wiki/Компьютерная_игра");
	}

	public boolean isUseMouse() {
		return useMouse;
	}

	public void setUseMouse(boolean useMouse) {
		this.useMouse = useMouse;
	}
	public PCGames() {
		super();
	}

	public PCGames(String gameGenre, Status status, int maxNumbUsers, boolean useMouse) {
		super(gameGenre, status, maxNumbUsers);
		this.useMouse = useMouse;
	}

	@Override
	public String toString() {
		return "PC games can use mouse = " + useMouse + " " + super.toString() + " ";
	} 
}
