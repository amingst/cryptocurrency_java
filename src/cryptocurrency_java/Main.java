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
					System.out.println("1");
					break;
				
				case "2":
					System.out.println("2");
					break;
				
				case "q":
					System.exit(0);
					break;
				
				default: 
					System.out.println("Invalid option");
					break;
			}
		}
	}

}
