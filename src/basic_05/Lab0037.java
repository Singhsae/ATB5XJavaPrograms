package src.basic_05;

import java.util.Scanner;

public class Lab0037 {
    //tables
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number which you want table:");
         int num =sc.nextInt();
         for(int i=1;i<=10;i++){
             System.out.println(num+"*"+i+"="+(num*i));
         }

    }
}
