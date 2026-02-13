package com.example.individualprep;

import com.example.individualprep.service.ArithmeticUtility;
import com.example.individualprep.service.VectorUtility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class IndividualprepApplicationTests {
	private VectorUtility vectorUtility;
	private ArithmeticUtility arithmeticUtility;

	@BeforeEach
	void setUp() {
		vectorUtility = new VectorUtility();
		arithmeticUtility = new ArithmeticUtility();
	}

	@Test
	void contextLoads() {
	}

	@Test
	void testDotProduct() {
		double[] v1 = {1.0, 3.0, -5.0};
		double[] v2 = {4.0, -2.0, -1.0};
		double expected = 3.0;
		assertEquals(expected, vectorUtility.dotProduct(v1, v2));
	}

	@Test
	void testSubtract() {
		double o1 = 10.5;
		double o2 = 5.5;
		double expected = 5.0;
		assertEquals(expected, arithmeticUtility.subtract(o1, o2));
	}

	@Test
	void testVectorAdd() {
		double[] v1 = {1.0, 2.0, 3.0};
		double[] v2 = {4.0, 5.0, 6.0};

		double[] expected = {5.0, 7.0, 9.0};
		double[] result = vectorUtility.add(v1, v2);
		assertArrayEquals(expected, result);
	}

	@Test
	void testArithmeticExponent() {
		double base = 2.0;
		int exponent = 3;

		double expected = 8.0;
		double result = arithmeticUtility.exponent(base, exponent);
		assertArrayEquals(new double[]{expected}, new double[]{result});
	}

	@Test
	void testArithmeticMultiply() {
		double o1 = 5.0;
		double o2 = 4.0;
		double expected = 20.0;

		double result = arithmeticUtility.multiply(o1, o2);
		assertEquals(expected, result);
	}

	@Test
	void testVectorMultiply() {
		double[] v1 = {1.0, -2.0, 3.0};
		int x = 2;
		double[] expected = {2.0, -4.0, 6.0};

		double[] result = vectorUtility.multiply(v1, x);
		assertArrayEquals(expected, result);
	}

	@Test
	void testVectorNorm(){
		double[] vector = {3.0, 4.0};
		double expected = 5.0;
		double result = vectorUtility.norm(vector);
		assertEquals(expected, result, 0.0001);
	}
}
