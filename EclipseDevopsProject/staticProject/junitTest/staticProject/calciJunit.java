package staticProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import staticProjectPackage.firstClass;

class calciJunit {

	@Test
	public void calTestAdd() {
		assertEquals(30,firstClass.add(10, 20));
	}
	
	@Test
	public void calTestsub() {
		assertEquals(30,firstClass.substraction(50, 20));
	}
	
	@Test
	public void calTestMul() {
		assertEquals(30,firstClass.multiplication(6, 5));
	}
	
	@Test
	public void calTestDiv() {
		assertEquals(6,firstClass.division(30, 5));
	}
}
