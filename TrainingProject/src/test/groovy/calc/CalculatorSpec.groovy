package calc

import spock.lang.Shared
import spock.lang.Specification

class CalculatorSpec extends Specification{

	@Shared Calculator calc = new Calculator();
	
	def 'API to add two numbers'(){
		given : 'String conatining blank'
			def numbers = ''
		when: 'Calculator.add is called'
			def result = calc.add(numbers)
		then: 'It should return 0'
			result == 0	
	}
	
	def 'API to add two numbers - test with two numbers'(){
		given : 'String containing two numbers'
			def numbers = '2,3'
		when : 'Calculator.add is called'
			def result = calc.add(numbers)
		then : 'It should return addtion of 2 & 3 i.e 5'
			result == 5	
	}
	
}

