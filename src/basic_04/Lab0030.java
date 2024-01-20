package src.basic_04;

import java.util.Scanner;

public class Lab0030 {
    public static void main(String[] args) {
        //which day is today
        //switch program
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number between 1-7 : Then i will tell which day it is");
        int dayNumber = sc.nextInt();

       // String day =null;
        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Are you Mad ?");

        }
        System.out.println("--end of program--");
    }
}
