import java.util.Scanner;

public class AccountTest {
	private static Scanner input;
	private static Scanner input2;

	public static void main(String[] args){
		
		input = new Scanner(System.in);
		input2 = new Scanner(System.in);
		CheckingAccount account3 = new CheckingAccount(100,-50,0.01,0.07);
		CheckingAccount account4 = new CheckingAccount(100,-50,0.01,0.07);
		
		System.out.printf("account1 balance: $%f\n",account3.getBalance());
		System.out.printf("account2 balance: $%f\n",account4.getBalance());
		System.out.print("Enter deposit amount for account1: ");
		double number = input.nextDouble();
		account3.credit(number);

		System.out.printf("account1 balance: $%f\n",account3.getBalance());
		System.out.printf("account2 balance: $%f\n",account4.getBalance());
		System.out.print("Enter withdrawal amount for account2: ");
		double number2 = input2.nextDouble();
		account4.debit(number2);
		
		System.out.printf("next month!\n",account3.getBalance());
		account3.nextMonth();
		account4.nextMonth();
		System.out.printf("account1 balance: $%f\n",account3.getBalance());
		System.out.printf("account2 balance: $%f\n",account4.getBalance());

	}
}
