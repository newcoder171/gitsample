package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.company.Car;



public class Main {

    String ty = "Tayo";

    Car c = new Car();

    public static void main(String[] args) {
        int age = 21;


	    // write your code here
        /*while (age < 50) {
            System.out.println("you are " + (50-age) + " years to 50");
            age++;
        }*/

        do {
            System.out.println("you are " + (50-age) + " years to 50");
            age++;
        } while (age < 50);



        List<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(1);
        testNumbers.add(3);
        testNumbers.add(7);
        testNumbers.add(10);
        // System.out.println(printItem(testNumbers));
        // System.out.println(getItem(testNumbers, 2));
    }

    public static List<Integer> getItem(List<Integer> numbers, int index) {
        // [1, 3, 7, 10]
        numbers.remove(index);
        return numbers;
    }


    public static List<Integer> printItem(List<Integer> numbers) {
        List<Integer> doubleNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            doubleNumbers.add(number * 2);
        }

        return doubleNumbers;
        /*List<Integer> missingNumbers = new ArrayList<>();
        int start = numbers.get(0);
        int lastIndex = numbers.size();
        int last = numbers.get(lastIndex - 1);
        for(int i = start; i < last; i++) {
            if(!numbers.contains(i)){
                missingNumbers.add(i);
            }
        }
        return missingNumbers;*/
    }



}
