/**
 * @author : Sayaka Tamura
 * May 9, 2019
 * Udemy Java MultiThreading 1
 * https://www.youtube.com/watch?v=905Emnqi5JM&list=WL&index=7
 */
package com.in28minutes.collections;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class MapTest {

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

}
