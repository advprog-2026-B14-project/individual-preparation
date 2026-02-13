package com.example.individualprep;

import com.example.individualprep.service.ArithmeticUtility;
import com.example.individualprep.service.VectorUtility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
	void testVectorAdd() {
		double[] v1 = {1.0, 2.0, 3.0};
		double[] v2 = {4.0, 5.0, 6.0};
		double[] expected = {5.0, 7.0, 9.0};
		double[] result = vectorUtility.add(v1, v2);
		assertArrayEquals(expected, result);
	}

}
