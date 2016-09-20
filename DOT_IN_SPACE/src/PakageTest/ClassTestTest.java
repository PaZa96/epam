package PakageTest;

import static org.junit.Assert.*;
import org.junit.Test;
import Calculator.Calculator;
import junit.framework.Assert;

public class ClassTestTest {

	public Calculator tester = new Calculator();

	@org.junit.Test
	public void testMiltiply() {

		assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
		assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
		assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));

	}

	@org.junit.Test
	public void testDivide() {
		
		assertEquals("0 / 10 must be 0", 0, tester.divide(0, 10));
		assertEquals("20 / -4 must be 0", -5, tester.divide(20, -4));
		assertEquals("49 / 7 must be 7", 7, tester.divide(49, 7));

	}

	@org.junit.Test
	public void testPlus() {

		assertEquals("2 + 2 must be 4", 4, tester.plus(2, 2));
		assertEquals("2 + (-2)) must be 0", 0, tester.plus(2, -2));
		assertEquals("-2 + (-2) must be -4", -4, tester.plus(-2, -2));

	}

	@org.junit.Test
	public void testMinus() {

		assertEquals("2 - 2 must be 0", 0, tester.minus(2, 2));
		assertEquals("2 - (-2)) must be 4", 4, tester.minus(2, -2));
		assertEquals("-2 - (-2) must be 0", 0, tester.minus(-2, -2));

	}
}
