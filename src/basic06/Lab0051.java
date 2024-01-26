package src.basic06;

import java.util.Scanner;

public class Lab0051 {
    public static void main(String[] args) {
        //reverse value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a ");
        int a = sc.nextInt();
        System.out.println("Enter the b");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a -->"+a);
        System.out.println("Value of b --->"+b);


    }
}
