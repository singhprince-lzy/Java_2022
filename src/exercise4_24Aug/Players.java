package exercise4_24Aug;

public class Players {
	String playerName;
	int matchesPlayed;
	int runs;
	int highestScore;
	Country country;
	public Players(String playerName, int matchesPlayed, int runs, int highestScore, Country country) {
		super();
		this.playerName = playerName;
		this.matchesPlayed = matchesPlayed;
		this.runs = runs;
		this.highestScore = highestScore;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Players [playerName=" + playerName + ", matchesPlayed=" + matchesPlayed + ", runs=" + runs
				+ ", highestScore=" + highestScore + ", country=" + country + "]";
	}
	
	
}
