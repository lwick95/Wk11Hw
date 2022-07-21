package cheeseService;

import java.util.NoSuchElementException;

import cheeseDao.OptionalDao;

public class OptionalCheeseService {

	private OptionalDao optionalDao = new OptionalDao();
	
	public String find(String search) {
		return optionalDao.find(search).orElseThrow(() -> new NoSuchElementException("It seems that " + search+ " is missing"));
	}

}
