package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("joe", 99.99);
        Customer anothercustomer = customer;
        anothercustomer = customer;
        anothercustomer.setBalance(100.00);
        System.out.println(customer.getBalance());
        System.out.println(anothercustomer.getBalance());
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        intlist.add(1);
        intlist.add(3);
        intlist.add(4);
        for(int i = 0; i < intlist.size(); i++){
            System.out.println(i + " element is :" + intlist.get(i));
        }
        intlist.add(1, 2);
        for(int i = 0; i < intlist.size(); i++){
            System.out.println(i + " element is :" + intlist.get(i));
        }
        intlist.remove(3);
        for(int i = 0; i < intlist.size(); i++){
            System.out.println(i + " element is :" + intlist.get(i).intValue());
        }
    }
}
