package cheeseApp;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import cheeseModel.RepeatCheeseModel;
import cheeseService.RepeatCheese;

public class StreamCheese {

	private RepeatCheese repeatCheese = new RepeatCheese();
	
	public static void main(String[] args) {
		
		new StreamCheese().run();
	}

	private void run() {
		
		Map<String, List<RepeatCheeseModel>> names = repeatCheese.findRepeatingCheese();
		//@formatter:off
		names.entrySet().forEach(entry ->
		System.out.println(entry.getKey() + " : " +
		entry.getValue().stream()
			.map(RepeatCheeseModel::getCheese)
			.collect(Collectors.toList())));
		//@formatter:on
		
	}

}
