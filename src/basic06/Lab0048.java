package src.basic06;

public class Lab0048 {
    public static void main(String[] args) {
        //FizzBuzz Problem:
        //Write a program that prints numbers from 1 to 100.
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }

        }
        System.out.println("--end of program---");
    }}
