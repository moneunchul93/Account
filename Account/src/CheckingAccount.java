
public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	public CheckingAccount(double balance, double a, double b, double c){
		super(balance);
		credit_limit = a;
		interest = b;
		loan_interest = c;
	}
	
	/*public double getCredit_limit(){ //�ܾ�Ȯ��
		return credit_limit;
	}
	
	protected void setCredit_limit(double m){ //�ܾ׼���
		credit_limit = m;
	}*/

	@Override
	public void debit(double number){ //���
		
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
}
