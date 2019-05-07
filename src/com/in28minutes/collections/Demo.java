/**
 * @author : Sayaka Tamura
 * May 7, 2019
 * Udemy Java Collections 1
 * https://www.youtube.com/watch?v=RhAV9NfobPM&list=WL&index=7&t=0s
 */
package com.in28minutes.collections;

public class Demo {
	public boolean compareString(String first, String second) {
		if (first.equalsIgnoreCase(second)) {
			return true;
		} else {
			return false;
		}
	}

	public String concatString(String first, String second) {
		return first.concat(second);
	}
}
