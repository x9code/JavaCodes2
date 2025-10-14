package com.jspiders.oops.method_overriding;

class AndroidOS{
    public void showHome(){
        System.out.println("show 6 app icons");
    }
}
class Samsung extends AndroidOS{
    @Override
    public void showHome(){
        System.out.println("show 210 app icons");
        
    }
}
class Oppo extends AndroidOS{
    @Override
    public  void showHome(){
        System.out.println("show 5 icons and 4 widgets");
    }
}
class Pixel extends AndroidOS{
}
class AndroidMain{
    public static void main(String[] args) {
        System.out.println("starts .....");
        Samsung s1 = new  Samsung();
        s1.showHome();
        Oppo o1 = new Oppo();
        o1.showHome();
        Pixel p1 = new Pixel();
        p1.showHome();
        System.out.println("ends........");
    }
}