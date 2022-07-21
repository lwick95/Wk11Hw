package cheeseModel;

import java.util.ArrayList;
import java.util.List;

import cheeseService.CheeseSorting;

public class Cheese {
	private CheeseSorting cheeseSorting = new CheeseSorting();
	
	private String cheese;
	
	public Cheese(String cheeseName) {
		this.cheese = cheeseName;
		
		
	}

	@Override
	public String toString() {
		return cheese + " cheese";
	}

	public String getCheese() {
		return cheese;
	}
	
	public static int compare(Cheese c1, Cheese c2) {
		return c1.cheese.compareTo(c2.cheese);
		
		
	}

}
