package calc

import spock.lang.Shared
import spock.lang.Specification

class CalculatorSpec extends Specification{

	@Shared Calculator calc = new Calculator();
	def 'API to add two numbers'(){
		given : 'String conatining two numbers'
		when: 'Calculator.add is called'
			int result = calc.add(numbers)
		then:
			result == expected	
		where:
			numbers| expected
			''	|	0
	}
}

