/**
 * @author : Sayaka Tamura
 * May 8, 2019
 * Udemy Java Collections 3
 * https://www.youtube.com/watch?v=114BHPiaPGc&list=WL&index=7
 */
package com.in28minutes.collections;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class QueueRunnnerTest {

	@Nested
	@DisplayName("For StringComparator method")
	class StringLengthComparatorTest_Queue {

		StringLengthComparator slComparator = new StringLengthComparator();
		String cat = "Cat";
		String monkey = "Monkey";
		String zebra = "Zebra";

		@Test
		@DisplayName("compare length with larger character")
		void withLargerCharacter() {
			assertTrue(slComparator.compare(monkey, zebra) > 0);
		}

		@Test
		@DisplayName("compare length with smaller character")
		void withSmallerCharacter() {
			assertTrue(slComparator.compare(cat, monkey) < 0);
		}
	}

}
