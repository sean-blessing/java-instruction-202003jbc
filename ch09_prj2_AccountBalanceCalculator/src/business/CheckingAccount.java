package business;

public class CheckingAccount extends Account {
	
	private double monthlyFee;

	public CheckingAccount(double balance, double monthlyFee) {
		super(balance);
		this.monthlyFee = monthlyFee;
	}

	public CheckingAccount() {
		super();
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	
	public void subtractMonthlyFee() {
		balance -= monthlyFee;
	}
}
