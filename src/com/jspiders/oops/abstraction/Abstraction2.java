package com.jspiders.oops.abstraction;

//Object  or Service implemtation Layer
interface Database{
    public void create();
    public void read();
    public void update();
    public void delete();

}
class Mysql implements Database{
    @Override
    public void create(){
        System.out.println("The table is created in Mysql..");
    }
    public void read(){
        System.out.println("The table is read in mysql.");
    }
    public void update(){
        System.out.println("The table is update.");
    }
    public void delete(){
        System.out.println("The table is deleted in mysql");
    }



}
class Oracle implements Database{
    @Override

    public void create(){
        System.out.println("The table is created in Oracle..");
    }
    public void read(){
        System.out.println("The table is read in Oracle.");
    }
    public void update(){
        System.out.println("The table is update. in Oracle");
    }
    public void delete(){
        System.out.println("The table is deleted in Oracle");
    }


}
class MangoDb implements Database{

    @Override
    public void create(){
        System.out.println("The table is created in MangoDb..");
    }
    public void read(){
        System.out.println("The table is read in MangoDb.");
    }
    public void update(){
        System.out.println("The table is update in MangoDb.");
    }
    public void delete(){
        System.out.println("The table is deleted in MangoDb");
    }


}
//Object creation Layer
class DriverManager{
    public static Database getObject(String Dbname){

        if(Dbname.equals("Mysql")){
            return new Mysql();

        }else if(Dbname.equals("Oracle")){
            return new Oracle();

        }else{
            return new MangoDb();
        }
    }
}
//Object Utilization layer
class Main{
    public static void main(String[] args) {
        DriverManager d=new DriverManager();
        Database d1 = DriverManager.getObject("Mysql");
        d1.create();
        d1.read();


        d1=DriverManager.getObject("Oracle");
        d1.create();

    }
}

