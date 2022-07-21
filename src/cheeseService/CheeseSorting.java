package cheeseService;


import java.util.Comparator;
import java.util.List;



import cheeseDao.Dao;
import cheeseModel.Cheese;

public class CheeseSorting {
	

		
	private Dao d = new Dao();
	
	public List<Cheese> getCheese(SortType type){
		List<Cheese> cheese = d.getCheese();
		Comparator<Cheese> comp = null;
		
		switch(type) {
		case LAMBDA:
			comp = (c1, c2)-> Cheese.compare(c1, c2);
			
			break;
			
		case METHOD_REFERENCE:
			comp = Cheese::compare;
			
			break;
			
		case NORMAL_CLASS:
			comp = new MyCheese();
			break;
			
		default:
			throw new RuntimeException("Uhnandled " + type);
		}
		
		cheese.sort(comp);
		return cheese;
	}
	
	static class MyCheese implements Comparator<Cheese>{
		public int compare(Cheese c1 , Cheese c2) {
			return Cheese.compare(c1, c2);
		}
	}


	}
	
	


