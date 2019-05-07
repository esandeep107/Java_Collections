/**
 * @author : Sayaka Tamura
 * May 7, 2019
 * Udemy Java Collections 2
 * https://www.youtube.com/watch?v=-54t79mEdNk&list=WL&index=6
 */
package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DiscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {
		return Integer.compare(stu1.getId(), stu2.getId());
	}

}

public class StudentCollectionRunner {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ranga"), new Student(100, "Adam"), new Student(2, "Eve"));
		System.out.println(students);

		List<Student> studentsAl = new ArrayList<>(students);
		Collections.sort(studentsAl);
		System.out.println("Asc" + studentsAl);

		Collections.sort(studentsAl, new DiscendingStudentComparator());
		System.out.println("DiscendingStudentComparator" + studentsAl);
	}
}
