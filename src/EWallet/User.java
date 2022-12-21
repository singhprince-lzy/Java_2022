package EWallet;

public class User {
	private int id;
	private String userName;
	private String email;
	private double walletBalance;
	
	public User() {
		super();
	}
	public User(int id, String userName, String email, double walletBalance) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.walletBalance = walletBalance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + ", walletBalance=" + walletBalance
				+ "]";
	}
	
	public boolean makePayment(double amount ) {
		if(walletBalance>=amount) {
			walletBalance-=amount;
			return true;
		}
		return false;
	}
	
}


