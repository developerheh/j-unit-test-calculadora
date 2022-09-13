package test;

//Arrange-Act-Assert pattern

import controller.CalcuOperation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcuOperationTest{

	private CalcuOperation objCalcUnderTest;

	@Before
	public void setUp() throws Exception {
		// Arrange
		objCalcUnderTest = new CalcuOperation();
	}
	
	

//happy path add()
	@Test
	//a+b
	public void testAdd(){
		int a = 15;
		int b = 20;
		
		int expectedResult = 35;
		// Act
		long result = objCalcUnderTest.add(a, b);
		// Assert
		Assert.assertEquals(expectedResult,result);
	}

	// not a happy path for add()
	@Test
	public void testAddZeroPlusSomething(){
		int a = 0;
		int something = 20;
		
		int expectedResult = something;
		// Act
		long result = objCalcUnderTest.add(a, something);
		// Assert
		Assert.assertEquals(expectedResult,result);
	}

	@Test
	public void testAddSomethingPlusZero(){
		int something = 15;
		int b = 0;
		
		int expectedResult = something;
		// Act
		long result = objCalcUnderTest.add(something, b);
		// Assert
		Assert.assertEquals(expectedResult,result);
	}

	@Test
	public void testAddZeroPlusZero(){
		int a = 0;
		int b = 0;
		
		int expectedResult = 0;
		// Act
		long result = objCalcUnderTest.add(a, b);
		// Assert
		Assert.assertEquals(expectedResult,result);
	}

	@Test
	public void testAddSomethingPlasMinusSomething(){
		int something = 15;
		
		int expectedResult = 0;
		// Act
		long result = objCalcUnderTest.add(something, -something);
		// Assert
		Assert.assertEquals(expectedResult,result);
	}

	@Test
	public void testAddMinusSomenthinPlusMinusSomething(){
		int a = -2;
		int b = -5;
		
		int expectedResult = -7;
		// Act
		long result = objCalcUnderTest.add(b, a);
		// Assert
		Assert.assertEquals(expectedResult,result);
	}
	@Test
	public void testAddCommutative(){
		int a = 15;
		int b = 20;
		
		int expectedResult = 35;
		// Act
		long result = objCalcUnderTest.add(b, a);
		// Assert
		Assert.assertEquals(expectedResult,result);
	}

	
	
	
	// happy path subtraction()
	@Test
	public void testSubtract(){
		int a = 8;
		int b = 4;
		
		int expectedResult = 4;
		// Act
		long result = objCalcUnderTest.subtract(a, b);
		// Assert
		Assert.assertEquals(expectedResult,result);

	}

	// not a happy path for subtraction()
	
	@Test
	public void testSubtract2(){
		int a = 0;
		int something = 4;
		
		int expectedResult = -something;
		// Act
		long result = objCalcUnderTest.subtract(a,something);
		// Assert
		Assert.assertEquals(expectedResult,result);

	}
	@Test
	public void testSubtract3(){
		int something = 8;
		int b = 0;
		
		int expectedResult = something;
		// Act
		long result = objCalcUnderTest.subtract(something, b);
		// Assert
		Assert.assertEquals(expectedResult,result);

	}
	@Test
	public void testSubtract4(){
		int a = 0;
		int b = 0;
		int expectedResult = 0;
		// Act
		long result = objCalcUnderTest.subtract(a,b);
		// Assert
		Assert.assertEquals(expectedResult,result);

	}
	@Test
	public void testSubtract5(){
		int something = 7;
		
		int expectedResult = 2*something;
		// Act
		long result = objCalcUnderTest.subtract(something,-something);
		// Assert
		Assert.assertEquals(expectedResult,result);

	}
	@Test
	public void testSubtract6(){
		int a = 8;
		int b = 4;
		int expectedResult = objCalcUnderTest.subtract(a, b);
		// Act
		long resultLeft = objCalcUnderTest.subtract(b, a);
		// Assert
		Assert.assertNotEquals(expectedResult, resultLeft);

	}
	
		
	//happy path multiply()
	@Test
	public void testMultiply(){
		int a = 8;
		int b = 4;
		long expectedResult = 32;
		// Act
		long result = objCalcUnderTest.multiply(a, b);
		// Assert
		Assert.assertEquals(expectedResult, result);

	}
	
	// not a happy path for multiply
	
	@Test
	public void testMultiplyOneBySomething(){
		int a = 1;
		int something = 4;
		long expectedResult = 4;
		// Act
		long result = objCalcUnderTest.multiply(a, something);
		// Assert
		Assert.assertEquals(expectedResult, result);

	}
	@Test
	public void testMultiplySomethingByOne(){
		int something = 8;
		int b = 4;
		long expectedResult = 32;
		// Act
		long result = objCalcUnderTest.multiply(something, b);
		// Assert
		Assert.assertEquals(expectedResult, result);

	}
	
	@Test
	public void testMultiplySomethingByMinusSomething(){
		int something = 8;
		
		long expectedResult = -64;
		// Act
		long result = objCalcUnderTest.multiply(something, -something);
		// Assert
		Assert.assertEquals(expectedResult, result);

	}
	@Test
	public void testMultiplyConmutative(){
		int a = 8;
		int b = 4;
		long expectedResult = 32;
		// Act
		long result = objCalcUnderTest.multiply(b, a);
		// Assert
		Assert.assertEquals(expectedResult, result);

	}


	
	//happy path divide()
	/*
	 * @Test public void testDivide(){ int a = 8; int b = 0; double expectedResult =
	 * 32; // Act double result = objCalcUnderTest.divide(a, b); // Assert
	 * Assert.assertEquals(expectedResult, result);// porque se arregló preguntar a
	 * Orlando o Santi } }
	 */

	// not a happy path for divide
	@Test
	public void testDivideSomethingOverOne(){
		int a = 8;
		int b = 1;
		
			double expectedResult = 8;
			// Act
			double result = objCalcUnderTest.divide(a, b);
			// Assert
			Assert.assertEquals(expectedResult, result, 0.01);// porque se arregló preguntar a Orlando o Santi
		
	}
	@Test
	public void testDivideOneOverSomething(){
		int a = 8;
		int b = 0;
		if (b == 0) {
			System.out.println("No puede haber un cociente igual a cero");
		} else {
			double expectedResult = 32;
			// Act
			double result = objCalcUnderTest.divide(a, b);
			// Assert
			Assert.assertEquals(expectedResult, result, 0.01);// porque se arregló preguntar a Orlando o Santi
		}
	}
	
	@Test
	public void testDivideZeroOverSomething(){
		int a = 8;
		int b = 0;
		if (b == 0) {
			System.out.println("No puede haber un cociente igual a cero");
		} else {
			double expectedResult = 32;
			// Act
			double result = objCalcUnderTest.divide(a, b);
			// Assert
			Assert.assertEquals(expectedResult, result, 0.01);// porque se arregló preguntar a Orlando o Santi
		}
	}
	@Test
	public void testDivideSomethigOverZero(){
		int a = 8;
		int b = 0;
		if (b == 0) {
			System.out.println("No puede haber un cociente igual a cero");
		} else {
			double expectedResult = 32;
			// Act
			double result = objCalcUnderTest.divide(a, b);
			// Assert
			Assert.assertEquals(expectedResult, result, 0.01);// porque se arregló preguntar a Orlando o Santi
		}
	}
	
	
	

}
