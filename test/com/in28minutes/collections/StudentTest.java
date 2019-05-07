/**
 * @author : Sayaka Tamura
 * May 7, 2019
 * Udemy Java Collections 2
 * https://www.youtube.com/watch?v=-54t79mEdNk&list=WL&index=6
 */
package com.in28minutes.collections;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class StudentTest {
	Student stu = new Student(2, "Eve");

	@Nested
	@DisplayName("For compareTo method")
	class compareToTest {

		@BeforeEach
		void beforeEach(TestInfo info) {
			System.out.println("Initializing Data..." + info.getDisplayName());
		}

		@Test
		@DisplayName("comparing larger ID number")
		void compareToLargeNumID() {
			assertTrue(stu.compareTo(new Student(100, "Adam")) < 1);
		}

		@Test
		@DisplayName("comparing smaller ID number")
		void compareToSmallNumID() {
			assertTrue(stu.compareTo(new Student(1, "Ranga")) > -1);
		}
	}

}
