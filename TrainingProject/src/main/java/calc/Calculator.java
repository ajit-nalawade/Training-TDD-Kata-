package calc;

public class Calculator {

	int add(String numbers)
	{
		int result = 0;
		if(!"".equals(numbers))
		{
			String [] number = numbers.split(",");
			result = performAddition(number);
		}
		return result;
	}

	/**
	 * @param numbers
	 * @return
	 */
	private int performAddition(String[] numbers) {
		int result = 0;
		
		for(String num : numbers)
		{
			result += Integer.parseInt(num);
		}
		return result;
	}
}
