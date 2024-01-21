package src.basic_05;

import java.util.Scanner;

public class Lab0038 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int number =sc.nextInt();
        long fact =1;
        int i=1;
        while(i<=number){
            fact=fact*i;
            i++;

        }
        System.out.println("Factorial of number is "+fact);

        sc.close();
    }
}
