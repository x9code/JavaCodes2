package com.jspiders.section3.garbagecollector;

class Sample{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize() is called");
    }
}
public class GarbageCollection {
    static void main() {
        Sample obj = new Sample();
        System.out.println(obj.hashCode());
        obj = null;
        System.gc();
        for (int i=9;i>=0;i--){
            System.out.println(i);
        }
    }
}
