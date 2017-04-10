import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest {
	public static void main(String args[]){
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingsAccount(100,0.05);
		double amount;
		
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter deposit amount for Account1: ");
			amount = scan.nextDouble();
			account1.debit(amount);
			System.out.println("account1 balance: $" + account1.getBalance());
			
			System.out.println("Enter deposit amount for Account2: ");
			amount = scan.nextDouble();
			account2.debit(amount);
			System.out.println("account1 balance: $" + account2.getBalance());
		}catch(InputMismatchException ex){
			System.out.println("예외발생: 숫자를 입력하세요\n " + ex.toString());
		}catch(Exception ex){
			System.out.println("예외발생: "+ ex.toString());
		}finally{
			account1.passTime(2);
			System.out.println("2month later account1:  "+ account1.getBalance());
		}
	}
}
