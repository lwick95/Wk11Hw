package cheeseService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import cheeseDao.StreamDao;
import cheeseModel.RepeatCheeseModel;

public class RepeatCheese {
	private StreamDao repeatDao = new StreamDao();

	public Map<String, List<RepeatCheeseModel>> findRepeatingCheese() {
		//@formatter:off
		return repeatDao.getCheese().stream()
				.filter(RepeatCheeseModel::hasRepeatingCharacters)
				.map(RepeatCheeseModel::new)
				.sorted()
				.collect(Collectors.groupingBy(RepeatCheeseModel::getRepChar));
		//@formatter:on
	}
}
