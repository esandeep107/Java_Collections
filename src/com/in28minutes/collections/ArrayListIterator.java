/**
 * @author : Sayaka Tamura
 * May 7, 2019
 * Udemy Java Collections 1
 * https://www.youtube.com/watch?v=RhAV9NfobPM&list=WL&index=7&t=0s
 */
package com.in28minutes.collections;

import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {

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

}
