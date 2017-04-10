public abstract class Account implements Valuable{
	private double balance;
	
	Account(double num){ //������
		balance = num;
	}
	
	public double getBalance(){ //�ܾ�Ȯ��
		return balance;
	}
	
	protected void setBalance(double m){ //�ܾ׼���
		balance = m;
	}
	
	public void credit(double number){
		balance += number;
	}
	
	public void debit(double number) throws Exception { //���
		if(number > 0){
			System.out.printf("subtracting %f from account1 balance\n",number);
			if(balance > number){
				balance -= number;
			}else{
				throw new Exception("Debit amount exceeded account balance");
			}
		}else{
			throw new Exception("������ �Է��߽��ϴ�!");
		}
	}
	
	public abstract double getWithdrawableAccount();
	public abstract double passTime(int time);
}
