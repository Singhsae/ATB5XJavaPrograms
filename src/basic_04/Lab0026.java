package src.basic_04;

import java.util.Scanner;

public class Lab0026 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
          int a= sc.nextInt();
        if(a>20) {
            System.out.println("Number is greater than " + a);
        } else if (a>10) {
            System.out.println("Number is greater than 10");
        }
          else  {
                System.out.println("Number is less than 20 and 10");

        }

    }
    }

