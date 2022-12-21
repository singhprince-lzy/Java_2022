package EWallet;

public class EPayWallet {
	public static void processPaymentByUser(User user, double billAmount) {
		if(user instanceof KYCUser) {
			KYCUser kycUser= (KYCUser)user;
			if(kycUser.makePayment(billAmount)) {
				System.out.println("Congrats, "+kycUser.getUserName()+" payment of "+billAmount+" Successful.");
			}else {
				System.out.println("Sorry, "+kycUser.getUserName()+" payment of "+billAmount+" Failed.");
			}
			
			System.out.println("your Current balance is "+kycUser.getWalletBalance());
			System.out.println("Your Reward point is "+kycUser.getRewardsPoint());
			System.out.println();
		}
		else {
			if(user.makePayment(billAmount)) {
				System.out.println("Congrats, "+user.getUserName()+" payment of "+billAmount+" Successful.");
				System.out.println("your Current balance is "+user.getWalletBalance());
				System.out.println();
			}
			
		}
		
		
		
	}
}
