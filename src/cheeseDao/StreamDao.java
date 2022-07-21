package cheeseDao;

import java.util.List;

public class StreamDao {
	
	List<String> cheeses = List.of(
			"Cheddar",
			"Swiss",
			"Havarti",
			"Blue Cheese",
			"Cream Cheese", 
			"Cottage Cheese",
			"Pepper Jack",
			"Colby Jack",
			"Parmesan",
			"Mozzerella"
			
	
			);

	public List<String> getCheese() {
		return cheeses;
	}


}
