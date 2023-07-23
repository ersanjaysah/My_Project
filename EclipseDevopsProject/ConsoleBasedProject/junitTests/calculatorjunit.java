import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ConsoleBasedPackage.calculator;

class calculatorjunit {

	@Test
	public void calTestAdd() {
		assertEquals(50,calculator.add(10, 40));
	}
	
	@Test
	public void calTestsub() {
		assertEquals(20,calculator.substraction(50, 30));
	}
	
	@Test
	public void calTestMul() {
		assertEquals(60,calculator.multiplication(6, 10));
	}
	
	@Test
	public void calTestDiv() {
		assertEquals(3,calculator.division(30, 10));
	}

}
