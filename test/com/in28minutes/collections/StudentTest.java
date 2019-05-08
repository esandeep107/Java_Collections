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
	Student stu2 = new Student(2, "Eve");
	Student stu100 = new Student(100, "Adam");
	Student stu1 = new Student(1, "Ranga");

	@Nested
	@DisplayName("For compareTo method at Student Class")
	class compareToTest {

		@BeforeEach
		void beforeEach(TestInfo info) {
			System.out.println("Initializing Data..." + info.getDisplayName());
		}

		@Test
		@DisplayName("comparing larger ID number")
		void compareToLargeNumID() {
			assertTrue(stu2.compareTo(stu100) > -1);
		}

		@Test
		@DisplayName("comparing smaller ID number")
		void compareToSmallNumID() {
			assertTrue(stu2.compareTo(stu1) < 1);
		}
	}

	@Nested
	@DisplayName("For compare method at DiscendingStudentIDComparator")
	class TestCompareWithDiscendingStudentIDComparator {
		AscendingStudentIDComparator disStuID = new AscendingStudentIDComparator();

		@Test
		@DisplayName("comparing larger ID number")
		void compareWithLargeNumID() {
			assertTrue(disStuID.compare(stu2, stu100) < 1);
		}

		@Test
		@DisplayName("comparing smaller ID number")
		void compareWithSmallNumID() {
			assertTrue(disStuID.compare(stu2, stu1) > -1);
		}

	}

}
