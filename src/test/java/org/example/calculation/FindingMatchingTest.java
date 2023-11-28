package org.example.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindingMatchingTest {

	List<Double> testList;

	@BeforeEach
	void setup() {
		testList = List.of(10.0, 15.45, 5.811, 175.0);
	}
	@Test
	void findMatching() {
		Double testResult = FindingMatching.findMatching(testList, 4.0, 9.3);
		Double expected = 5.811;

		Assertions.assertEquals(expected, testResult);
	}

	@Test
	void findMatchingExac() {
		Double testResult = FindingMatching.findMatching(testList, 4.0, 10.0);
		Double expected = 10.0;

		Assertions.assertEquals(expected, testResult);
	}

	@Test
	void findMatchingNull() {
		Double testResult = FindingMatching.findMatching(testList, 1.0, 1.0);
		Double expected = null;

		Assertions.assertEquals(expected, testResult);
	}
}