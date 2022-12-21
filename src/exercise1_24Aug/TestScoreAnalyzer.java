package exercise1_24Aug;

import java.util.Scanner;

public class TestScoreAnalyzer {

	public static void main(String[] args) {
		ScoreAnalyzer scoreAnalyzer=new ScoreAnalyzer();
		
		System.out.println("Enter runs: ");
		Scanner sc= new Scanner(System.in);
		int run=sc.nextInt();
		while(run>-1) {
			scoreAnalyzer.addRunsToList(run);
			run=sc.nextInt();
		}
		
		scoreAnalyzer.displayRunsScoredByPlayers();
		System.out.println("\nRun rate is "+scoreAnalyzer.calcRunRate());
		System.out.println("Lowest score is "+scoreAnalyzer.lowestrunScored());
		scoreAnalyzer.countBatted();

	}

}
