/**
 * @author : Sayaka Tamura
 * May 8, 2019
 * Udemy Java Collections 3
 * https://www.youtube.com/watch?v=114BHPiaPGc&list=WL&index=7
 */

/**
 * Map:
 * <Basic>Map provides a data structure based on key-value pair and hashing
 * <Duplication> While a Map holds two objects per Entry e.g. a key and a value and It may contain duplicate values but keys are always unique. 
 */
package com.in28minutes.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {

	public static void main(String[] args) {
		// <HashMap> unsorted, unordered, key's hash code is used
		// <Hashtable> unsorted, unordered, key's hash code is used, and
		// Synchronized - Thread Safe
		// HashMap allows a key with null value. Hashtable does not.
		// <LinkedHashMap>
		// insertion order is maintained, slower insertion and deletion,
		// faster iteration
		// <TreeMap>
		// sorted order is maintained, implements NavigableMap

		Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);
		System.out.println(map); // {A=3, Z=10, B=5}
		System.out.println(map.get("Z")); // 10
		System.out.println(map.size()); // 3
		System.out.println(map.isEmpty()); // false
		System.out.println(map.containsKey("A")); // true
		System.out.println(map.containsValue(3)); // true
		System.out.println(map.keySet()); // [A, B, Z]
		System.out.println(map.values()); // [5, 10, 3]

		Map<String, Integer> mapTest = new HashMap<>(Map.of("Apple", 3, "Milk", 5, "Chocolate", 10));
		System.out.println(mapTest);

		Map<String, Integer> hashmap = new HashMap<>(map);
		hashmap.put("F", 5);
		System.out.println(hashmap); // {A=3, B=5, Z=10, F=5}

		hashmap.put("Z", 11);
		System.out.println(hashmap); // {A=3, B=5, Z=11, F=5}

		// HashMap
		Map<String, Integer> hashmap_2 = new HashMap<>(map);
		hashmap_2.put("Z", 5);
		hashmap_2.put("A", 15);
		hashmap_2.put("F", 25);
		hashmap_2.put("L", 250);
		System.out.println(hashmap_2); // unordered {A=15, Z=5, B=5, L=250, F=25}

		// LinkedHashMap
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("F", 25);
		linkedHashMap.put("A", 15);
		linkedHashMap.put("Z", 5);
		linkedHashMap.put("L", 250);
		System.out.println(linkedHashMap); // ordered {F=25, A=15, Z=5, L=250}

		// TreeMap
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("F", 25);
		treeMap.put("A", 15);
		treeMap.put("Z", 5);
		treeMap.put("L", 250);
		System.out.println(treeMap); // sorted {A=15, F=25, L=250, Z=5}

		// Exercise: how many character & word we can find from the sentence as below
		String str = "This is a great thing";

	}

}
