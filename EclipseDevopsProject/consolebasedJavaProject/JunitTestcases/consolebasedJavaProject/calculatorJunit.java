package consolebasedJavaProject;

import static org.junit.jupiter.api.Assertions.*;

import consolebasedJavaPackage.firstClass;

class calculatorJunit {

	@Test
	public void caltestadd() {
		assertEquals(30,firstClass.add(10, 20));
	}

}
