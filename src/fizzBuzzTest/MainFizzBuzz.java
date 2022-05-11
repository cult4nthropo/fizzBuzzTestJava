package fizzBuzzTest;

import java.util.Scanner;

public class MainFizzBuzz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ConsoleBasedFizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
		System.out.println("FizzBuzz from 1 to which number?");
		int maxNumber = scanner.nextInt();
		fizzBuzz.setLastNumber(maxNumber);
		fizzBuzz.printArguments(ConsoleBasedFizzBuzz.FIRST_NUMBER, maxNumber);
		scanner.close();

	}

}
