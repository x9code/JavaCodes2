package com.jspiders.ecom.dto;

import java.util.Scanner;

class Product {
    private int pid;
    private String product_name;

    public String getProduct_name() {

        return product_name;
    }

    public void setProductName(String product_name) {

        this.product_name = product_name;
    }

    public int getPid() {

        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
//here i added toString() to show product id and name then compiler showed some error. then i clicked on it then this happened

class ProductService{
    private Product[] products = new Product[4];
    private int currentIndex = 0;

    public void addProduct(Product product){
        if(currentIndex<=products.length-1){
            products[currentIndex] = product;
            currentIndex++;
            System.out.println("Product added");
        }
        else
        {
            System.out.println("Array is full cannot add any other product");
        }
    }
}
public class Product_Data{
    public static void main(String[] args) {
        ProductService ps = new ProductService();
        Product p1 = new Product();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product name :");
        p1.setProductName(sc.next());
        System.out.println("Enter Product ID :");
        p1.setPid(sc.nextInt());

        ps.addProduct(p1);
    }
}
