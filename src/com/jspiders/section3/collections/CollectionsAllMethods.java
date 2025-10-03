package com.jspiders.section3.collections;

import java.util.*;

public class CollectionsAllMethods {
    public static void main() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5));

        // 1️⃣ Sorting & Ordering
        Collections.sort(numbers);                             // [1, 2, 5, 5, 9]
        Collections.sort(numbers, Collections.reverseOrder()); // [9, 5, 5, 2, 1]
        Collections.reverse(numbers);                          // [1, 2, 5, 5, 9]
        Collections.shuffle(numbers);                          // Random shuffle
        Collections.swap(numbers, 0, 4);                 // Swap first & last

        // 2️⃣ Searching & Min/Max
        int max = Collections.max(numbers);                  // Maximum
        int min = Collections.min(numbers);                  // Minimum
        int index = Collections.binarySearch(numbers, 5);    // Search (sorted list!)

        // 3️⃣ Thread-Safe Wrappers
        List<Integer> syncList = Collections.synchronizedList(numbers);

        // 4️⃣ Immutable/Fixed-Size Collections
        List<Integer> emptyList = Collections.emptyList();
        List<Integer> singletonList = (List<Integer>) Collections.singletonList(42);
        List<String> copies = Collections.nCopies(3, "X");
        List<Integer> readOnly = Collections.unmodifiableList(numbers);

        // 5️⃣ Filling & Replacing
        Collections.fill(numbers, 0);                        // All elements = 0
        Collections.replaceAll(numbers, 0, 99);              // Replace 0 with 99

        // 6️⃣ Frequency & Disjoint
        int freq = Collections.frequency(numbers, 5);       // Count occurrences
        boolean disjoint = Collections.disjoint(numbers, Arrays.asList(1,2)); // true/false

        // Print result
        System.out.println(numbers);
        System.out.println("Max: " + max + ", Min: " + min);
        System.out.println("Frequency of 5: " + freq + ", Disjoint: " + disjoint);
    }
}

