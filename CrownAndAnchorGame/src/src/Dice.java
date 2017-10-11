public class Dice {
			
	private DiceValue value;
	
	public Dice() {
		value =  DiceValue.getRandom();
	}
	
	public DiceValue getValue() {
		return value;
	}

	public DiceValue roll() {
		// HOANG, Van Cuong. Created on 11/11/2017
		// This should modify the current DiceValue before returning it
		
		value = DiceValue.getRandom();
		return value;
	}		
	
	public String toString() {
		return value.toString();
	}
}
