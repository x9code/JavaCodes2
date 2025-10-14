package com.jspiders.oops.method_overriding;

class sample{
    public void count(int n){
        for(int i = 1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}
class Demo extends sample{
    @Override
    public void count(int r){
        for(int i = r;i>=1;i--){
            System.out.print(i+" ");
        }
    }
}
class Overriding{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.count(5);
        System.out.println();
        sample s1 = new Demo();
        s1.count(5);
        System.out.println();
        sample s2 = new sample();
        s2.count(4);
    }
}
