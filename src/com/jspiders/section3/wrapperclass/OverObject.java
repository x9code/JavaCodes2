package com.jspiders.section3.wrapperclass;

public class OverObject {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(1000);
        System.out.println(i1.hashCode());
        Object obj1 = new Object();
        System.out.println(obj1.hashCode());
        Long l = 1000L;
        System.out.println(l.hashCode());
        Long ln = 5000000000L; // larger than int range
        System.out.println(ln.hashCode());
        System.out.println(ln.toString());
        System.out.println(l.toString());
        Long l1 = Long.valueOf(1000L);
        Long l2 = Long.valueOf(1000L);

        System.out.println(l1.equals(l2));
         Long l3 = 1000L;
         Long l4 = 100L;
        System.out.println(i1.equals(l3));
        Float f1 = 10.5f;
        System.out.println(f1.hashCode());

        Float f2 = -10.5f;
        System.out.println(f2.hashCode());
        Float f = 12.75f;
        System.out.println(f.toString());  // "12.75"

        Float g = 1.0e10f;
        System.out.println(g.toString());  // "1.0E10"

        Float f4 = 10.5f;
        Float f5 = 10.5f;
        System.out.println(f4.equals(f5)); // true

        Float f6 = 20.5f;
        System.out.println(f4.equals(f6)); // false

        Double d1 = 100.0;
        Double d2 = 100.0;
        System.out.println(d1.hashCode()); // same for both
        System.out.println(d2.hashCode());

    }
}
