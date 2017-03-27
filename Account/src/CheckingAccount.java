
public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	public CheckingAccount(double balance, double a, double b, double c){
		super(balance);
		credit_limit = -a;
		interest = b;
		loan_interest = c;
	}
	
	@Override
	public void debit(double number){ //√‚±›
		
		if(credit_limit < getBalance() - number){
			setBalance(getBalance() - number);
		}else{
			System.out.print("Debit amount exceeded credit_limit\n");
		}
	}
	
	public void nextMonth(){
		if(getBalance() > 0){
			setBalance(getBalance() + getBalance()*interest);
		}else if(getBalance() < 0){
			setBalance(getBalance() + getBalance()*loan_interest);
		}
	}
	
	@Override
	public double getWithdrawableAccount(){
		if((getBalance() - credit_limit) >= 0){
			return getBalance() - credit_limit;
		}else{
			return 0;
		}
	}
	
	@Override
	public double passTime(int time){
		double intresttime = 0;
		
		if(getBalance() > 0){
			setBalance(getBalance() + getBalance()*interest*time);
		}else if(getBalance() < 0){
			setBalance(getBalance() + getBalance()*loan_interest*time);
		}
		
		return intresttime;
	}
	
	public boolean isBankrupted(){
		if(getBalance() < credit_limit){
			return true;
		}else{
			return false;
		}
	}
}
