package com.jspiders.oops.method_overriding;

class MessageV1{
    public void delivered(){
        System.out.println("Show time of delivered message");
    }
}
class MessageV2 extends MessageV1{
    @Override
    public void delivered(){
        System.out.println("show two black ticks");
    }
}
class MessageV3 extends MessageV2{
    @Override
    public void delivered(){
        System.out.println("show two blue ticks");
    }
}
class MainMessage{
    public static void main(String[] args) {
        System.out.println("Starts .....");
        MessageV1 m1 = new MessageV1();
        MessageV2 m2 = new MessageV2();
        MessageV3 m3 = new MessageV3();
        m1.delivered();
        m2.delivered();
        m3.delivered();
        System.out.println("ends ......");
    }
}
