package com.example.individualprep;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.individualprep.service.VectorUtility;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IndividualprepApplicationTests {
	private VectorUtility vectorUtility;

	@BeforeEach
	void setUp() {
		vectorUtility = new VectorUtility();
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
}
