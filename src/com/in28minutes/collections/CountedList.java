/**
 * @author : Sayaka Tamura
 * May 9, 2019
 * Udemy Java MultiThreading 1
 * https://www.youtube.com/watch?v=905Emnqi5JM&list=WL&index=7
 */
package com.in28minutes.collections;

import java.util.ArrayList;

//So we can see the list objects being created,
//and keep track of when they are cleaned up:
public class CountedList extends ArrayList {
	private static int counter = 0;

	private int id = counter++;

	public CountedList() {
		System.out.println("CountedList #" + id);
	}

	public int getId() {
		return id;
	}
}
