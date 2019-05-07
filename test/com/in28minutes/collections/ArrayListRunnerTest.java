/**
 * @author : Sayaka Tamura
 * May 7, 2019
 * Udemy Java Collections 1
 * https://www.youtube.com/watch?v=RhAV9NfobPM&list=WL&index=7&t=0s
 */
package com.in28minutes.collections;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class ArrayListRunnerTest {

	ArrayListRunner alIterator = new ArrayListRunner();
	Collection actualWords = new ArrayList(Arrays.asList("Apple", "Bat", "Orange", "Cat"));

	@BeforeAll
	static void beforeAll() {
		System.out.println("Initializing the test...");
	}

	@AfterAll
	static void afterall() {
		System.out.println("Closing the test...");
	}

	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Initialize Test Data for " + info.getDisplayName());
	}

	@Test
	void testremoveEndWith_at() {
		// can make these list as below in-line
		actualWords = alIterator.removeEndWith_at((List<String>) actualWords);
		List<String> expectedvalue = Arrays.asList("Apple", "Orange");
		assertArrayEquals(expectedvalue.toArray(), actualWords.toArray());
	}

}
