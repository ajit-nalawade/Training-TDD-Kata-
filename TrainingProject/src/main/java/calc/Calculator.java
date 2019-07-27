package calc;

public class Calculator {

	int add(String numbers) throws Exception
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
	 * @throws Exception 
	 */
	private int performAddition(String[] numbers) throws Exception {
		int result = 0;
		
		for(String num : numbers)
		{
			if(Integer.parseInt(num) > 0)
			{
				result += Integer.parseInt(num);
			}
			else
			{
				throw new Exception();
			}
			
		}
		return result;
	}
}
