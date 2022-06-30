import java.util.*;

public class mainClass {

	public static void main(String[] args) {

		ATMop op = new ATMopimp();

		String uid = "newage";
		int pin = 4321;

		Scanner sc = new Scanner(System.in);
		System.out.println("        WELCOME TO NEWAGE ATM        ");
		System.out.println();
		System.out.println("Enter ATM User ID:");
		String UID = sc.nextLine();
		System.out.println("Enter Your 4 digit ATM pin");
		int PIN = sc.nextInt();

		if ((PIN == pin) && (UID.equals(uid))) {

			
			while (true) {
				System.out.println("\n 1.TRANSCATION HISTORY\n 2.WITHDRAW\n 3.DEPOSIT\n 4.AVAILABLE BALANCE\n 5.EXIT");
				System.out.println("ENTER YOUR CHOICE");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:op.history();
					break;

				case 2:
					System.out.println("enter the Withdrawl Amount\n");
					double withdraw = sc.nextDouble();
					op.withdraw(withdraw);
					break;

				case 3:
					System.out.println("Enter Amount To Be Deposited");
					double deposit = sc.nextDouble();
					op.deposit(deposit);
					break;
				case 4:
					op.balance();
					break;

				case 5:
					System.out.println("DO ENSURE to COLLECT YOUR CARD\n !!THANK YOU!!!");
					 System.exit(0);
					break;

				default:
					System.out.println("INVALID ENTRY");

				}
			}

		} else {
			System.out.println("INCORRECT UserID or PIN");
			System.out.println("PLEASE RE-ENTER");
			System.exit(0);
		}

	}

}
