package cheeseDao;

import java.util.Optional;

public class OptionalDao {
	
	public Optional<String> find(String search){
		if("Missing".equals(search)) {
			return Optional.empty();
		}
		return Optional.of(search);
	}

}
