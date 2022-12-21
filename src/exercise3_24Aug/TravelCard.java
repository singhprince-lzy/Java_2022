package exercise3_24Aug;

public class TravelCard extends PrepaidCard implements Rewardable {

	double rewardPoints;
	@Override
	boolean swipecard(double amount) {
		if(amount<super.avlBalance && amount<super.swipeLimit) {
			return true;
		}
		System.out.println("Amount is greater than eithe available balance or our limit, Please reduce the amount.");
		System.out.println("Returning to main site...");
		return false;
	}
	@Override
	public double returnRewardPoints(double amount) {
		if(swipecard(amount)) {
			super.avlBalance-=(amount+(0.05*amount));
			double inINR=60*amount;
			double rewardPoint=(int) (inINR/100);
			this.rewardPoints+=5*rewardPoint;
			return 5*rewardPoint;
		}
		return -1;
	}

}
