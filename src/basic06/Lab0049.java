package src.basic06;

import java.util.Scanner;

public class Lab0049 {
    //Leap year
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the year");
        int year= sc.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0))
        {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}
