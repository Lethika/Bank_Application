package bank_application;
import java.util.Scanner;
public class Main {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        Account account = null; // Initialize account as null

	        while (true) {
	            System.out.println("Select an option:");
	            System.out.println("1. Create an account");
	            System.out.println("2. Deposit money");
	            System.out.println("3. Withdraw money");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = input.nextInt();
	            input.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    // Create a new account
	                    System.out.print("Enter Name: ");
	                    String name = input.nextLine();

	                    System.out.print("Enter Phone Number: ");
	                    String phoneNumber = input.nextLine();

	                    System.out.print("Enter Age: "); // You can add age as a new field in the Account class
	                    int age = input.nextInt();
	                    input.nextLine(); // Consume the newline character

	                    System.out.print("Enter Email: ");
	                    String email = input.nextLine();

	                    // Generate a new account number (you can implement this logic)
	                    String accountNumber = generateAccountNumber();

	                    account = new Account(accountNumber, 0, name, email, phoneNumber);

	                    System.out.println("Account created successfully!");
	                    System.out.println("your account number"+accountNumber);
	               
	                    break;

	                case 2:
	                    // Deposit money
	                    if (account != null) {
	                        System.out.print("Enter the amount to deposit: ");
	                        double depositAmount = input.nextDouble();
	                        input.nextLine(); // Consume the newline character

	                        account.DepositMoney(depositAmount);
	                    } else {
	                        System.out.println("No account created yet. Please create an account first.");
	                    }
	                    break;

	                case 3:
	                    // Withdraw money
	                    if (account != null) {
	                        System.out.print("Enter the amount to withdraw: ");
	                        double withdrawAmount = input.nextDouble();
	                        input.nextLine(); // Consume the newline character

	                        account.WithDrawMoney(withdrawAmount);
	                    } else {
	                        System.out.println("No account created yet. Please create an account first.");
	                    }
	                    break;

	                case 4:
	                    // Exit the program
	                    System.out.println("Exiting the program.");
	                    input.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	                    break;
	            }
	        }
	    }

	    // You can implement your logic to generate a new account number here.
	    private static String generateAccountNumber() {
	        // Example implementation: Generate a random 6-digit account number
	        int min = 100000;
	        int max = 999999;
	        int accountNumber = min + (int) (Math.random() * ((max - min) + 1));
	        return Integer.toString(accountNumber);
	    }
	}


