/**
 * @author : Sayaka Tamura
 * May 8, 2019
 * Udemy Java Collections 2
 * https://www.youtube.com/watch?v=-54t79mEdNk&list=WL&index=6
 */

/**
 * List: 
 * <Basic> Set does not particularly maintain insertion order but, Linked HashSet maintains the insertion order.
 * <Duplication> The add() method returns false if you try to insert the duplicate elements.
 * <Methods> Set does not define any additional method.
 * <Implementation> Set is implemented by HashSet, LinkedHashSet, EnumSet, TreeSet, CopyOnWriteArraySet.
 */

package com.in28minutes.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		// HashSet
		Set<Integer> numbers_hash = new HashSet<>();
		// neither cares for the sorted order or the insertion order
		numbers_hash.add(765432);
		numbers_hash.add(76543);
		numbers_hash.add(7654);
		numbers_hash.add(765);
		numbers_hash.add(76);

		System.out.println(numbers_hash);

		// LinkedHashSet
		Set<Integer> numbers_linked = new LinkedHashSet<>();
		// stores the insertion order, but it does not sort
		numbers_linked.add(765432);
		numbers_linked.add(76543);
		numbers_linked.add(7654);
		numbers_linked.add(765);
		numbers_linked.add(76);

		System.out.println(numbers_linked);

		// TreeSet
		Set<Integer> numbers_tree = new TreeSet<>();
		// cares about sorted order, but does not care about insertion order
		numbers_tree.add(765432);
		numbers_tree.add(76543);
		numbers_tree.add(7654);
		numbers_tree.add(765);
		numbers_tree.add(76);

		System.out.println(numbers_tree);

		// Exercise:
		// find unique character from the list as below, and make ordered list.
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		Set<Character> unique_characters = new TreeSet<>(characters);
		System.out.println(unique_characters);

		// Exercise for TreeSet
		Set<Integer> numbers = new TreeSet<>(Set.of(65, 54, 34, 12, 99));

		System.out.println(((TreeSet<Integer>) numbers).floor(40)); // 34
		System.out.println(((TreeSet<Integer>) numbers).lower(34)); // 12
		System.out.println(((TreeSet<Integer>) numbers).ceiling(36)); // 54
		System.out.println(((TreeSet<Integer>) numbers).higher(34)); // 54
		System.out.println(((TreeSet<Integer>) numbers).subSet(20, 80)); // [34,54,65]
		System.out.println(((TreeSet<Integer>) numbers).subSet(34, 54));// [34] 2nd param excludes
		System.out.println(((TreeSet<Integer>) numbers).subSet(34, true, 65, true));// [34,54,65] 2nd param includes
		System.out.println(((TreeSet<Integer>) numbers).headSet(50));// [12,34]
		System.out.println(((TreeSet<Integer>) numbers).tailSet(50));// [54,65,99]

	}

}
