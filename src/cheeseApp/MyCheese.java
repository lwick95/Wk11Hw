package cheeseApp;

import java.util.List;

import cheeseModel.Cheese;
import cheeseService.CheeseSorting;
import cheeseService.SortType;

public class MyCheese {
	private CheeseSorting cheeseSorting = new CheeseSorting();
	
	public static void main(String[] args) {
		
		new MyCheese().run();
	}

	private void run() {
		List<Cheese> cheeses = cheeseSorting.getCheese(SortType.METHOD_REFERENCE);
		print(cheeses,SortType.METHOD_REFERENCE);
	}

	private void print(List<Cheese> cheeses, SortType type) {
		switch(type) {
		case METHOD_REFERENCE:
			cheeses.forEach(System.out::println);
			break;
			
		case LAMBDA:
			cheeses.forEach(cheese-> System.out.println(cheese.getCheese()));
		
		case NORMAL_CLASS:
			for(Cheese cheese : cheeses) {
				System.out.println(cheese.getCheese());
			}
			break;
			
		default:
				
			break;
		}
	}

}
