package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controller.CalcuOperation;

public class CalcuOperationTest {
	
	private CalcuOperation objCalcUnderTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		//Arrange
		objCalcUnderTest = new CalcuOperation();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 15; int b = 20; 
		int expectedResult = 35;
		//Act 
		long result = objCalcUnderTest.add(a, b);
		//Assert
		Assert.assertEquals(expectedResult, result);
	}

	/*
	 * @Test public void testSubtract() { fail("Not yet implemented"); // TODO }
	 * 
	 * @Test public void testMultiply() { fail("Not yet implemented"); // TODO }
	 * 
	 * @Test public void testDivide() { fail("Not yet implemented"); // TODO }
	 */
}
