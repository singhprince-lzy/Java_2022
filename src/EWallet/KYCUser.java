package EWallet;

public class KYCUser extends User{
	private int rewardsPoint;

	public KYCUser(int id,String userName,String email,double walletBalance) {
		super(id,userName,email,walletBalance);
		
		
	}

	public int getRewardsPoint() {
		return rewardsPoint;
	}

	public void setRewardsPoint(int rewardsPoint) {
		this.rewardsPoint = rewardsPoint;
	}
	
	public boolean makePayment(double amount ) {
	
		if(super.makePayment(amount)) {
			rewardsPoint+=amount*0.1;
			return true;
		}
		return false;
		
	}
	
}