package com.jspiders.oops.type_casting;

    class Demo3{
        int z = 45;
        public void count(){
            System.out.println("count() of demo3 class");
        }
    }
    class Sample3 extends Demo3{
        double k1 = 3.4;
        public void view(){
            System.out.println("view() of sample3 class");
        }
    }
    public class ReferenceReturn1{
        public static  Demo3 getObject(String classname){
            if(classname.equals("Demo")){
                return new Demo3();//same class return
            }else{
                return new Sample3();//sub class return
            }
        }
        public static void main(String[] args) {
            //Demo ref1 = new Demo();
            Demo3 ref1 = null;
            ref1 = getObject("Sample");
            System.out.println(ref1);
            ref1.count();
            //ref1.view();//only super class peoperties can be accesssed
        }
    }

