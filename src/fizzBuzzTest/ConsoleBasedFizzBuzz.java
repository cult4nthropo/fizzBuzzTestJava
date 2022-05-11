package fizzBuzzTest;

public class ConsoleBasedFizzBuzz implements FizzBuzz {

	static final int FIRST_NUMBER = 1;

	private int lastNumber = 1;
	private final int firstCondition = 3;
	private final int secondCondition = 5;
	private final String fizz = "Fizz";
	private final String buzz = "Buzz";
	private String result = "";

	public int getLastNumber() {
		return lastNumber;
	}

	public void setLastNumber(int lastNumber) {
		this.lastNumber = lastNumber;
	}

	@Override
	public void printArguments(int firstNumber, int lastNumber) {

		for (int i = firstNumber; i <= lastNumber; i++) {
			boolean isFizz = i % firstCondition == 0;
			boolean isBuzz = i % secondCondition == 0;
			result = (isFizz && isBuzz) ? fizz + buzz : isFizz ? fizz : isBuzz ? buzz : Integer.toString(i);

			System.out.println(result);
		}

	}

}
