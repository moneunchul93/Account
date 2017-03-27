public abstract class Account {
	private double balance;
	
	Account(double num){ //생성자
		balance = num;
	}
	
	public double getBalance(){ //잔액확인
		return balance;
	}
	
	protected void setBalance(double m){ //잔액수정
		balance = m;
	}
	
	public void credit(double number){
		balance += number;
	}
	
	public void debit(double number){ //출금
		
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
