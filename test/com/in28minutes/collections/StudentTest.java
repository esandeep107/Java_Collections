/**
 * @author : Sayaka Tamura
 * May 7, 2019
 * Udemy Java Collections 2
 * https://www.youtube.com/watch?v=-54t79mEdNk&list=WL&index=6
 */
package com.in28minutes.collections;

import org.junit.jupiter.api.Test;

class StudentTest {
	Student stu = new Student(1, "Ranga");

	@Test
	void compareToTest() {
		stu.compareTo(new Student(100, "Adam"));
	}

}
