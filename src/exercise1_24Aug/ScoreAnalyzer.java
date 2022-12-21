package exercise1_24Aug;

import java.util.LinkedList;

public class ScoreAnalyzer {
	private LinkedList<Integer>runsData= new LinkedList<>();

	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		this.runsData = runsData;
	}
	
	public ScoreAnalyzer() {
		
	}

	public void addRunsToList(int run) {
		runsData.add(run);
	}
	
	public double calcRunRate() {
		int sum=0;
		for(int run:runsData) {
			sum+=run;
		}
		return sum/50.0;
	}
	
	public int lowestrunScored() {
		
		int min=runsData.get(0);
		for(int run:runsData) {
			if(min>run) {
				min=run;
			}
		}
		return min;
	}
	
	public void displayRunsScoredByPlayers() {
		int count=1;
		System.out.println("Runs Scored: ");
		for(int run:runsData) {
			System.out.print(count++ +" - "+run+", ");
		}
	}

	public void countBatted() {
		// TODO Auto-generated method stub
		
		System.out.println("Number of players batted "+runsData.size());
	}
}
