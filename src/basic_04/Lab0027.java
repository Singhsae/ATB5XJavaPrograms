package src.basic_04;

import java.util.Scanner;

public class Lab0027 {
    //Grade Calculator
    //A: 90-100
    //B:80-89
    //C:70-79
    //D:60-69
    //F:0-59
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student score");
        int score = sc.nextInt();
        //char grade='F';
        if (score>=90 && score <=100){
            System.out.println("Your grade is : A ");
        } else if (score>=80 && score<=89) {
            System.out.println("Your grade is : B");
        } else if (score>=70 && score<=79) {
            System.out.println("Your grade is : C");
        } else if (score>=60 && score <=69) {
            System.out.println("Your grade is : D");
        }
        else {
            System.out.println("Your grade is : F");
        }

    }
}
