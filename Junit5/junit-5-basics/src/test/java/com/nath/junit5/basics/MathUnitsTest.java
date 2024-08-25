package com.nath.junit5.basics;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUnitsTest {

	MathUnits mathUnits;
	TestInfo testInfo;
	TestReporter testReporter;

//	@BeforeAll
//	static void beforeAllInit() {
//		System.out.println("This needs to run before all");
//	}

	@BeforeEach
	void init(TestInfo testInfo,TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;

		mathUnits = new MathUnits();
		testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());

	}

//	@AfterEach
//	void cleanup() {
//		System.out.println("Cleaning up...");
//	}

	@Nested
	@Tag("Math")
	@DisplayName("add method")
	class Add {

		@Test
		@DisplayName("when adding two positive numbers") // the name to be display on console of test
		void testAddPositive() {
			assertEquals(2, mathUnits.add(1, 1), "should return the right sum");
		}

		@Test
		@DisplayName("when adding two positive numbers") // the name to be display on console of test
		void testAddNegative() {
			int expected = -2;
			int actual = mathUnits.add(-1, -1);
			assertEquals(expected, actual, "should return sum " + expected + " but not return " + actual);
		}
	}
	
	@Test
	@Tag("Math")
	@DisplayName("multiply method")
	void testMultiply() {
		// assertEquals(4, mathUnits.multiply(2, 1), "should return the right product");
		System.out.println("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
		testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
		assertAll(
				() -> assertEquals(4, mathUnits.multiply(2, 2)),
				() -> assertEquals(0, mathUnits.multiply(2, 0)),
				() -> assertEquals(-2, mathUnits.multiply(2, -1))
				);
	}

	@Test
	@Tag("Math")
	void testDivide() {
		boolean isServiceUp = false;
		assumeTrue(isServiceUp);
		assertThrows(ArithmeticException.class, () -> mathUnits.divide(1, 0), "Diviede by zero should throws");

	}

	@RepeatedTest(3)
	@Tag("Circle")
	void testComputeCircleRadius() {
		assertEquals(314.1592653589793, mathUnits.computeCircleArea(10), "Should return right circle area");
	}

//	@Test
//	@Disabled // this will skip test
//	@DisplayName("TSDD method.. should not run...") // this will not show the name of test
//	void disabled() {
//		fail("this test should be disabled");
//	}
}
