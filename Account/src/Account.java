public class Account {
	private double balance;
	
	public Account(double num){ //������
		balance = num;
	}
	
	public double getBalance(){ //�ܾ�Ȯ��
		return balance;
	}
	
	public void setBalance(double m){ //�ܾ׼���
		balance = m;
	}
	
	public void credit(double number){
		balance += number;
	}
	
	public void debit(double number){ //���
		
		System.out.printf("subtracting %f from account1 balance\n",number);
		if(balance > number){
			balance = balance - number;
		}else{
			System.out.print("Debit amount exceeded account balance\n");
		}
	}
}
