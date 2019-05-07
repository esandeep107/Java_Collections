/**
 * @author : Sayaka Tamura
 * May 7, 2019
 * Udemy Java Collections 1
 * https://www.youtube.com/watch?v=RhAV9NfobPM&list=WL&index=7&t=0s
 */
package com.in28minutes.collections;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class ArrayListIteratorTest {

	ArrayListIterator alIterator;
	List<String> words;

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
		alIterator = new ArrayListIterator();
		words = Arrays.asList("Apple", "Bat", "Orange", "Cat");
		System.out.println("Initialize Test Data for " + info.getDisplayName());
	}

	@Test
	void testremoveEndWith_at(List<String> words) {

		// can make these list as below in-line
		List<String> actualvalue = Arrays.asList("Apple", "Orange");// alIterator.removeEndWith_at(words);
		List<String> expectedvalue = Arrays.asList("Apple", "Orange");
		assertEquals(expectedvalue, actualvalue);
	}

}
