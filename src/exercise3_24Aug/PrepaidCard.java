package exercise3_24Aug;

public abstract class PrepaidCard {
	int cardNumber=1234;
	double avlBalance=1000;
	double swipeLimit=100;
	
	abstract boolean swipecard(double amount);

	@Override
	public String toString() {
		return "PrepaidCard [cardNumber=" + cardNumber + ", avlBalance=" + avlBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	
	public void rechageCard(double amount) {
		this.avlBalance+=amount;
	}
}
