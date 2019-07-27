package calc;

public class Calculator {

	int add(String numbers)
	{
		int result;
		String [] number = numbers.split(",");
		result = Integer.parseInt(number[0]) + Integer.parseInt(number[1]);
		return result;
	}
}
