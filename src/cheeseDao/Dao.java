package cheeseDao;

import java.util.ArrayList;
import java.util.List;

import cheeseModel.Cheese;

public class Dao {
	
	static List<Cheese> cheeses = new ArrayList<>(List.of(
			new Cheese("Cheddar"),
			new Cheese("Swiss"),
			new Cheese("Havarti"),
			new Cheese("Blue"),
			new Cheese("Cream"),
			new Cheese("Cottage"),
			new Cheese("Pepper-Jack"),
			new Cheese("Colby-Jack"),
			new Cheese("Parmesan"),
			new Cheese("Mozzerella")));
	
	public List<Cheese> getCheese(){
		return cheeses;
	}

}
