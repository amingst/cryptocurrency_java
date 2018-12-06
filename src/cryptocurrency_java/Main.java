package cryptocurrency_java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner menuInputScanner = new Scanner(System.in);
		BlockChain blockChain = new BlockChain("Andrew");
		
		
		while (true) {
			System.out.println("Choose an option: ");
			System.out.println("1: Add a new transaction");
			System.out.println("2: Print blockchain contents");
			System.out.println("q: Quit");
			String menuInput = menuInputScanner.nextLine();
			
			switch (menuInput) {
				case "1":
					handleAddNewTransaction(blockChain);
					break;
				
				case "2":
					blockChain.printBlockChain();
					break;
				
				case "q":
					menuInputScanner.close();
					System.exit(0);
					break;
				
				default: 
					System.out.println("Invalid option");
					break;
			}
		}
	}
	
	private static void handleAddNewTransaction(BlockChain blockChain) {
		Scanner newTransactionInputScanner = new Scanner(System.in);
		Transaction newTransaction;
		String sender, recipient;
		double amount;
		
		System.out.println("Enter the sender name: ");
		sender = newTransactionInputScanner.nextLine();
		
		System.out.println("Enter the recipient name: ");
		recipient = newTransactionInputScanner.nextLine();
		
		System.out.println("Enter the amount to be sent: ");
		amount = newTransactionInputScanner.nextDouble();
		
		newTransaction = new Transaction(sender, recipient, amount);
		
		if (blockChain.addTransaction(newTransaction)) {
			System.out.println("Transaction approved!");
		} else {
			System.out.println("Transaction not approved!");
		}
		
	}

}
