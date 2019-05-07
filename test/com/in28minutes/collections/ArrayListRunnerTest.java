/**
 * @author : Sayaka Tamura
 * May 7, 2019
 * Udemy Java Collections 1
 * https://www.youtube.com/watch?v=RhAV9NfobPM&list=WL&index=7&t=0s
 */
package com.in28minutes.collections;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ArrayListRunnerTest {

	ArrayListRunner alIterator = new ArrayListRunner();;

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
	@DisplayName("When a word end with \"at\", remove the word")
	void testremoveEndWith_at_2atWord() {
		// can make these list as below in-line

		Collection actualWords = new ArrayList(Arrays.asList("Apple", "Bat", "Orange", "Cat"));

		actualWords = alIterator.removeEndWith_at((List<String>) actualWords);
		List<String> expectedvalue = Arrays.asList("Apple", "Orange");
		assertArrayEquals(expectedvalue.toArray(), actualWords.toArray());
	}

	@DisplayName("check true when a list length > 0")
	@ParameterizedTest
	@MethodSource("generateData")
	void testTrue_SizeOf_List_after_removeEndWith(List<String> actualValue) {
		actualValue = alIterator.removeEndWith_at(actualValue);
		assertTrue(actualValue.size() > 0);
	}

	static Stream<Arguments> generateData() {
		return Stream.of(Arguments.of(new ArrayList(Arrays.asList("Apple", "Bat", "Orange", "Cat"))),
				// Arguments.of(new ArrayList(Arrays.asList("Pat", "Boat", "Seat"))),
				Arguments.of(new ArrayList(Arrays.asList("Apple", "Banana", "Orange"))));
	}

}
