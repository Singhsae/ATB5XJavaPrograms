package src.basic_05;

import java.util.Scanner;

public class Lab0033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x");
        double x= sc.nextDouble();
        System.out.println("enter the y");
        double y = sc.nextDouble();
        System.out.println("enter the z");
        double z= sc.nextDouble();
        double result =0;
        //3/x^2+y^2 -|z|
     result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);

        sc.close();

    }
}
