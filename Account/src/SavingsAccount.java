
public class SavingsAccount extends Account {
	private int month;
	private double interest;
	public double temp = getBalance();
	
	public double EstimateValue(int month){
		
		if(month <= 12){
			for(int i = 0; i < month; i++){
				temp = temp*(1+interest);
				setBalance(temp);
			}
		}
	
		return getBalance();
	}
	
	public String toString(){
		return String.format("SavingAccount_Balance: %f", getBalance());
	}
	
	protected void setMonth(int m){ //�ܾ׼���
		month += m;
	}
	
	public SavingsAccount(double balance, double b){
		super(balance);
		interest = b;
	}

	@Override
	public void debit(double number) throws Exception { //���
		if(number > 0){
			if(month < 12){
				throw new Exception("���� ����� �� �����ϴ�!");
			}else if(month > 12){
				setBalance(getBalance() - number);
			}
		}else{
			throw new Exception("������ �Է��߽��ϴ�!");
		}
	}
	
	@Override
	public double getWithdrawableAccount(){
		if(month < 12){
			return 0;
		}else{
			return getBalance();
		}
	}
	
	@Override
	public double passTime(int time){
		setMonth(time);
		
		if(month <= 12){
			for(int i = 0; i < time; i++){
				//setBalance(getBalance()*(1+interest));
				temp = temp*(1+interest);
			}
			if(month >= 12){
				setBalance(temp);
			}
		}
		
		return getBalance();
	}
	
}
