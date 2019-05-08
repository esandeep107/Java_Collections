/**
 * @author : Sayaka Tamura
 * May 8, 2019
 * Udemy Java Collections 3
 * https://www.youtube.com/watch?v=114BHPiaPGc&list=WL&index=7
 */

/**
 * Queue: 
 * ordered list the same as "List" 
 * All elements get inserted at the "end" 
 * and removed from the "beginning" (or head) of the queue.
 */
package com.in28minutes.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {
	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value1.length(), value2.length());
	}

}

public class QueueRunner {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		// queue.offer("Apple");

		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue);

		System.out.println(queue.poll()); // Remove the head of this queue from the list
		System.out.println(queue);
		System.out.println(queue.poll()); // Remove the head of this queue from the list
		System.out.println(queue);
		System.out.println(queue.poll()); // Remove the head of this queue from the list
		System.out.println(queue); // All elements finished to remove

	}
}
