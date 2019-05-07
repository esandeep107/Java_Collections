/**
 * @author : Sayaka Tamura
 * May 7, 2019
 * Udemy Java Collections 1
 * https://www.youtube.com/watch?v=RhAV9NfobPM&list=WL&index=7&t=0s
 */
package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListRunner {

	/**
	 * @param wordsAl : list of words
	 */
	public List<String> removeEndWith_at(List<String> wordsAl) {
		Iterator<String> iterator = wordsAl.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().endsWith("at"))
				iterator.remove();
		}

		return wordsAl;
	}

	public static void main(String[] args) {
		List<Integer> numbersAl = new ArrayList<Integer>(Arrays.asList(123, 12, 3, 45, 105));
		System.out.println(numbersAl.indexOf(3));
		System.out.println(numbersAl.remove(Integer.valueOf(3)));
		System.out.println(numbersAl);

		Collections.sort(numbersAl);
		System.out.println(numbersAl);
	}

}
