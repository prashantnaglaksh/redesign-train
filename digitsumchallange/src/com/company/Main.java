package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumdigit(125));
    }
    public static int sumdigit(int number){
        int sum = 0;
        if(number >= 10){
            while(number > 0){
                number = number % 10;
                sum = sum + number;
                number = number /10;
            }
            return sum;
        }
        return -1;
    }
}
