package cheeseApp;

import java.util.NoSuchElementException;
import java.util.Scanner;

import cheeseService.OptionalCheeseService;

public class OptionalCheese {

	private Scanner sc = new Scanner(System.in);
	private OptionalCheeseService service = new OptionalCheeseService();
	
	
	public static void main(String[] args) {
		new OptionalCheese().run();

	}


	private void run() {
		boolean done = false;
		
		while(!done) {
			System.out.println("Enter a Cheese: ");
			String search = sc.nextLine();
			
			if(search.isEmpty()) {
				done = true;
			}
			else {
				try {
					String found = service.find(search);
					System.out.println("I found it! " + found + "!");
				}
				catch(NoSuchElementException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
