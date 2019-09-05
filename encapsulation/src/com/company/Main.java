package com.company;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(5, true);
        System.out.println("initial page count = " + printer.getPageprinted());
        int pageprinted = printer.printpages(6);
        System.out.println("pages printrd was " + pageprinted + "and new count of pages printed is " + printer.getPageprinted());
    }
}
