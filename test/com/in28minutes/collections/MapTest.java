/**
 * @author : Sayaka Tamura
 * May 9, 2019
 * Udemy Java MultiThreading 1
 * https://www.youtube.com/watch?v=905Emnqi5JM&list=WL&index=7
 */
package com.in28minutes.collections;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class MapTest {

	// Example 1
	@Test
	public void testAssertMap() {
		Map<String, String> map = new HashMap<>();
		map.put("j", "java");
		map.put("c", "c++");
		map.put("p", "python");
		map.put("n", "node");

		Map<String, String> expected = new HashMap<>();
		expected.put("n", "node");
		expected.put("c", "c++");
		expected.put("j", "java");
		expected.put("p", "python");

		// All passed / true

		// 1. Test equal, ignore order
		assertThat(map, is(expected));

		// 2. Test size
		assertThat(map.size(), is(4));
	}

	// Example 2 : mocking
//	private MySubString mySubString = new MySubString();
//	@Test
//	public void testFindOccurences() {
//		final Map<String, Integer> myResult = mySubString.findOccurences("This This");
//		final Map<String, Integer> expected = new HashMap<String, Integer>() {
//			{
//				put("Thi", 2);
//				put("his", 2);
//				put("is ", 1);
//				// etc
//			}
//		};
//		assertEquals(expected, myResult);
//	}

	// Example 3
	@Test
	public static void assertEqualsMapEpsilon(Map<Object, Double> expected, Map<Object, Double> actual,
			double epsilon) {
		assertEquals(expected.size(), actual.size());
		for (Map.Entry<Object, Double> value : expected.entrySet()) {
			Double actualValue = actual.get(value.getKey());
			assertNotNull(actualValue);
			assertEquals(value.getValue(), actualValue, epsilon);
		}
	}
}
