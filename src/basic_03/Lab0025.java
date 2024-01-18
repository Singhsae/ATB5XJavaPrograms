package src.basic_03;

import java.util.Scanner;

public class Lab0025 {
    public static void main(String[] args) {
        // take input from user and give max out of two number
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a =sc.nextInt();
        int b= sc.nextInt();

        if (a<b){
            System.out.println("Min" +a);

        }
        else{
            System.out.println("Min" +b);
        }

    }
}
