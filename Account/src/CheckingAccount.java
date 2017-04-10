
public class CheckingAccount extends Account{
	private double creditLimit;
	private double interest;
	private double loanInterest;
	
	public double EstimateValue(int month){
		
		if(getBalance() > 0){
			setBalance(getBalance() + getBalance()*interest*month);
		}else if(getBalance() < 0){
			setBalance(getBalance() + getBalance()*loanInterest*month);
		}
		return getBalance();
	}
	
	public String toString(){
		return String.format("CheckingAccount_Balance: %f", getBalance());
	}
	
	public CheckingAccount(double balance, double a, double b, double c){
		super(balance);
		creditLimit = -a;
		interest = b;
		loanInterest = c;
	}
	
	@Override
	public void debit(double number) throws Exception { //출금
		if(number > 0){
			if(creditLimit < getBalance() - number){
				setBalance(getBalance() - number);
			}else{
				throw new Exception("Debit amount exceeded account balance");
			}
		}else{
			throw new Exception("음수를 입력했습니다!");
		}
	}
	
	public void nextMonth(){
		if(getBalance() > 0){
			setBalance(getBalance() + getBalance()*interest);
		}else if(getBalance() < 0){
			setBalance(getBalance() + getBalance()*loanInterest);
		}
	}
	
	@Override
	public double getWithdrawableAccount(){
		if((getBalance() - creditLimit) >= 0){
			return getBalance() - creditLimit;
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
			setBalance(getBalance() + getBalance()*loanInterest*time);
		}
		
		return intresttime;
	}
	
	public boolean isBankrupted(){
		if(getBalance() < creditLimit){
			return true;
		}else{
			return false;
		}
	}
}
