public abstract class Account {
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
	
	public void debit(double number){ //���
		
		System.out.printf("subtracting %f from account1 balance\n",number);
		if(balance > number){
			balance -= number;
		}else{
			System.out.print("Debit amount exceeded account balance\n");
		}
	}
	
	public abstract double getWithdrawableAccount();
	public abstract double passTime(int time);
}
