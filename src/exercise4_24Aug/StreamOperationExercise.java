package exercise4_24Aug;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationExercise {
	private static final Function Name = null;
	static List<Players>playerList=new ArrayList() {{
		add(new Players("Dhoni", 171, 12036,183 , new Country(1,"India")));
		add(new Players("Ponting", 229, 15036,152 , new Country(2,"Austrlia")));
		add(new Players("Sachin", 300, 18069,204 , new Country(1,"India")));
		add(new Players("Root", 191, 14036,175 , new Country(3,"England")));
		add(new Players("Kohli", 261, 1636,183 , new Country(1,"India")));
		
	}};
	
	static void displayData() {
		playerList.stream().forEach(player -> System.out.println(player));
	}
	
	static void displayPlayersForCountry(String name) {
		List<Players>player=playerList.stream().filter(p -> p.country.countryName==name).collect(Collectors.toList());
		player.stream().forEach(players-> System.out.println(players));
	}
	
	static void getNames() {
		List<Players>plist=playerList.stream().filter(p->p.runs<5000).sorted((i1,i2)->(i1.runs>i2.runs)?1:(i1.runs<i2.runs)?-1:0).collect(Collectors.toList());
		plist.stream().forEach(players-> System.out.println(players));
	}
	
	static void getAvgRunByCountry(String countryName) {
		int run=0;
		double count=0;
		run=playerList.stream().filter( p->p.country.countryName.equals(countryName)).mapToInt(p-> p.runs).sum();
		count=playerList.stream().filter( p->p.country.countryName.equals(countryName)).count();
		System.out.println(run/count);
	}
	
	static void getPlayersNamecountry() {
		playerList.stream().filter(p->p.matchesPlayed>200).forEach(p->System.out.println(p.playerName+" "+p.country.countryName));
	}
	
	static void getMostRunPlayer() {
		Players p=playerList.stream().max((o1, o2) -> (o1.runs>o2.runs)?1:(o1.runs<o2.runs)?-1:0 ).get();
		System.out.println(p);
	}
	public static void main(String[] args) {
		System.out.println("All data ");
		displayData();
		System.out.println();
		System.out.println("India wise data");
		displayPlayersForCountry("India");
		System.out.println();
		System.out.println("Name wise data");
		getNames();
		System.out.println();
		System.out.println("Country wise data");
		getAvgRunByCountry("Austrlia");
		System.out.println();
		System.out.println("some data");
		getPlayersNamecountry();
		System.out.println();
		System.out.println("max run data");
		getMostRunPlayer();
	}
	
}
