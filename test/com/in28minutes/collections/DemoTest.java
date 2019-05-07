/**
 * @author : Sayaka Tamura
 * May 7, 2019
 * Udemy Java Collections 1
 * https://www.youtube.com/watch?v=RhAV9NfobPM&list=WL&index=7&t=0s
 */
package com.in28minutes.collections;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void testCompareString() {
		Demo demo = new Demo();
		assertFalse(demo.compareString("heello", "hello"));
	}

	@Test
	void testConcatString() {
		Demo demo = new Demo();
		assertEquals("Hello World", demo.concatString("Hello ", "World"));
	}

	@Test
	void testAddOneToArray() {
		Demo demo = new Demo();
		int expected[] = new int[] { 3, 8 };
		assertArrayEquals(expected, demo.addOneToArray(new int[] { 2, 7 }));
	}

}
