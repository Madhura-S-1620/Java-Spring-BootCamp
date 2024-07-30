package com.test.innerbean;


public class InvoiceGenerator {
    private Product prod_order;

    public InvoiceGenerator(Product prod_order)
    {
        this.prod_order=prod_order;

    }
    public void setProdOrder(Product order){
        this.prod_order=order;
    }
    public void generateInvoice(){
        System.out.println("Getting Orders details...: "+prod_order.getItem());
        System.out.println("Getting Orders details...: "+prod_order.getPrice());
        System.out.println("Getting Orders details...: "+prod_order.getAddress());
    }


}
