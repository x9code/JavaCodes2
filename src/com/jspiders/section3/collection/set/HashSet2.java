package com.jspiders.section3.collection.set;

import java.util.*;

public class HashSet2 {
    public static void main(String[] args) {
        // 1. Create a HashSet
        HashSet<String> set = new HashSet<>();

        // 2. add(E e) - add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Banana"); // duplicate, ignored
        set.add(null);     // null allowed
        System.out.println("After add: " + set);

        // 3. addAll(Collection<? extends E> c) - add all from another collection
        List<String> list = Arrays.asList("Grapes", "Mango", "Apple");
        set.addAll(list);
        System.out.println("After addAll: " + set);

        // 4. contains(Object o) - check element presence
        System.out.println("Contains Banana? " + set.contains("Banana"));

        // 5. containsAll(Collection<?> c) - check all elements
        System.out.println("Contains all list elements? " + set.containsAll(list));

        // 6. remove(Object o) - remove element
        set.remove("Orange");
        System.out.println("After remove Orange: " + set);

        // 7. removeAll(Collection<?> c) - remove all elements in collection
        set.removeAll(Arrays.asList("Apple", "Mango"));
        System.out.println("After removeAll: " + set);

        // 8. retainAll(Collection<?> c) - keep only elements in collection (intersection)
        set.retainAll(Arrays.asList("Banana", "Grapes"));
        System.out.println("After retainAll: " + set);

        // 9. isEmpty() - check if empty
        System.out.println("Is set empty? " + set.isEmpty());

        // 10. size() - get number of elements
        System.out.println("Size of set: " + set.size());

        // 11. iterator() - traverse elements
        System.out.print("Iterating elements: ");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // 12. toArray() - convert to array
        Object[] arr = set.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // 13. clear() - remove all elements
        set.clear();
        System.out.println("After clear, is empty? " + set.isEmpty());
    }
}

