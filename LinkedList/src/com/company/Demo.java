package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String>();
        addinorder(cities,"Delhi");
        addinorder(cities,"Noida");
        addinorder(cities,"Meerut");
        addinorder(cities,"Garhmukteshware");
        addinorder(cities,"Delhi");
        printlinkedlist(cities);
        visits(cities);
    }
    private static void printlinkedlist(LinkedList<String> linkedlist){
        Iterator<String> i = linkedlist.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
    }
    private static boolean addinorder(LinkedList<String> linkedList, String newcity){
        ListIterator<String> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()){
        int comparison = listIterator.next().compareTo(newcity);
        if (comparison == 0){
            System.out.println(newcity + "is already in the list ");
            return false;
        }else if (comparison > 0){
            //newcity will be added before this one
            listIterator.previous();
            listIterator.add(newcity);
            return true;
        }else if (comparison < 0){
            //move on next city
            }
        }
        listIterator.add(newcity);
        return true;
    }
    private static void visits(LinkedList<String> linkedList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = linkedList.listIterator();
        if (linkedList.isEmpty()){
            System.out.println("no cities in the list to visit ");
        }else{
            System.out.println("Now visiting " + listIterator.next());
            printmenu();
        }
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    System.out.println("Vaccation over ");
                    return;
                case 1:
                    if (listIterator.hasNext()){
                        System.out.println("Next city to visit is " + listIterator.next());
                    }else{
                        System.out.println("reached at the end of the list");
                    }
                    break;
                case 2:
                    if (listIterator.hasPrevious()){
                        System.out.println("Previous city to visit is " + listIterator.previous());
                    }else{
                        System.out.println("reached at the bbeganing of the list ");
                    }
                    break;
                case 3:
                    printmenu();
                    break;
            }
        }
    }
    private static void printmenu(){
        System.out.println("enter your choice\n Press  ");
        System.out.println("0  to quit\n" +
                "1  to visit next city\n" +
                "2 to visit previous city\n" +
                "3  to print menu");
    }
}
