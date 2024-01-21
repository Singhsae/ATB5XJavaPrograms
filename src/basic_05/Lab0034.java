package src.basic_05;

import java.util.Scanner;

public class Lab0034 {
    public static void main(String[] args) {
        Scanner user_input =new Scanner(System.in);
        System.out.println("Enter your Name :" );
        String name =user_input.next();
        System.out.println("Enter your age ");
        int age =user_input.nextInt();
        System.out.println("Enter your salary");
        double salary =user_input.nextDouble();
        System.out.println("Your detals are as belwo: "+"\n"+"Name:"+name+"\n"+"Age:" +age+"\n"+"Salary:"+salary);

        user_input.close();


    }
}
