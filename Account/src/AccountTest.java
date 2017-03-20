import java.util.Scanner;

public class AccountTest {
	private static Scanner input;
	private static Scanner input2;

	public static void main(String[] args){
		
		input = new Scanner(System.in);
		input2 = new Scanner(System.in);
		Account account1 = new Account(50);
		Account account2 = new Account(0);
		
		System.out.print("Enter withdrawal amount for account1: ");
		double number = input.nextDouble();
		account1.debit(number);
		System.out.printf("account1 balance: $%f\n",account1.getBalance());
		System.out.printf("account2 balance: $%f\n",account2.getBalance());

		System.out.print("Enter withdrawal amount for account2: ");
		double number2 = input2.nextDouble();
		account2.debit(number2);
		System.out.printf("account1 balance: $%f\n",account1.getBalance());
		System.out.printf("account2 balance: $%f\n",account2.getBalance());
	}
}
