import java.util.ArrayList;

public abstract class Account implements Valuable{
	private double balance;
	
	Account(double num){ //생성자
		balance = num;
	}
	
	public static double sumForAccount(ArrayList<? extends Account> list){
		double sum = 0;
		for(int i = 0; i < list.size(); i++){
			sum += list.get(i).getBalance();
		}
		
		return sum;
	}
	
	public static void passTimeForList(ArrayList<? extends Account> list, int month){
		for(int i = 0; i < list.size(); i++){
			list.get(i).passTime(month);
		}
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
	
	public void debit(double number) throws Exception { //출금
		if(number > 0){
			System.out.printf("subtracting %f from account1 balance\n",number);
			if(balance > number){
				balance -= number;
			}else{
				throw new Exception("Debit amount exceeded account balance");
			}
		}else{
			throw new Exception("음수를 입력했습니다!");
		}
	}
	
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int time);
	public abstract void passTime();
}
