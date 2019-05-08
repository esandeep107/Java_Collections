/**
 * @author : Sayaka Tamura
 * May 7, 2019
 * Udemy Java Collections 1
 * https://www.youtube.com/watch?v=RhAV9NfobPM&list=WL&index=7&t=0s
 */

/**
 * List: 
 * <Basic> List maintains the sequence of the elements stored in a list.
 * <Duplication> List may have duplicate elements in it.
 * <Methods> In addition to methods defined in Collection, List defines some of its own methods.
 * <Implementation> List is implemented by ArrayList, LinkedList, CopyOnWriteArrayList, Vector, Stack.
 */
package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListRunner {

	/**
	 * @param wordsAl : list of words
	 */
	public List<String> removeEndWith_at(List<String> wordsAl) {
//		Iterator<String> iterator = wordsAl.iterator();
//		while (iterator.hasNext()) {
//			if (iterator.next().endsWith("at"))
//				iterator.remove();
//		}

		wordsAl.removeIf(s -> s.endsWith("at"));
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
