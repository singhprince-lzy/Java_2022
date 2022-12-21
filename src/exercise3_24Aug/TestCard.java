package exercise3_24Aug;

public class TestCard {

	public static void main(String[] args) {
		TravelCard travelCard= new TravelCard();
		travelCard.returnRewardPoints(10);
		System.out.println(travelCard+" "+"and Reward points are "+travelCard.rewardPoints);
		travelCard.returnRewardPoints(5);
		System.out.println(travelCard+" "+"and Reward points are "+travelCard.rewardPoints);
		travelCard.returnRewardPoints(200);
		System.out.println(travelCard+" "+"and Reward points are "+travelCard.rewardPoints);

	}

}
