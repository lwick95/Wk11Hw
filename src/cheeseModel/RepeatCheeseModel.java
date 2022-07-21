package cheeseModel;

import java.util.Objects;

public class RepeatCheeseModel {
	
	private String repChar;
	private String cheese;
	
	public RepeatCheeseModel(String cheese) {
		this.cheese = Objects.requireNonNull(cheese, "**!!Cheese can not be null!!**");
		this.repChar = findingRepeatingChar(cheese);
		Objects.requireNonNull(this.repChar,
				"the cheese" + cheese + "must have one or more repeating char!");
	}

	public String getRepChar() {
		return repChar;
	}

	public String getCheese() {
		return cheese;
	}

	private static String findingRepeatingChar(String cheese) {
		if(Objects.isNull(cheese)|| cheese.trim().isEmpty() ){
			throw new RuntimeException("Cheese must not be null");
		}
	String trimmed = cheese.trim();
	char lastChar = cheese.charAt(0);
	
	for(int index = 1; index < trimmed.length(); index++) {
		char thisChar = cheese.charAt(index);
		
	if(lastChar == thisChar) {
		return Character.toString(thisChar);
	}
	lastChar = thisChar;
		
	}
	return null;
		
	}
	
	@Override
	public String toString() {
		return "RepeatCheeseModel [repChar=" + repChar + ", cheese=" + cheese + "]";
	}

	public static boolean hasRepeatingCharacters(String cheese) {
		return findingRepeatingChar(cheese) != null;
	}

	public int compareTo(RepeatCheeseModel that) {
		int cmp = this.repChar.compareTo(that.repChar);
		
		if(cmp == 0) {
			cmp = this.cheese.compareTo(that.cheese);
		}
		
		return cmp;
	}

}
