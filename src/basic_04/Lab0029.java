package src.basic_04;

import java.util.Scanner;

public class Lab0029 {
    //triangle classifier

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the side1, side2 ,side 3");
        int side1= sc.nextInt();
        int side2= sc.nextInt();
        int side3 =sc.nextInt();
        if((side1==side2)&& (side2==side3)&&(side1==side3)){
            System.out.println("Equilateral");
        } else if ((side1==side2)||(side2==side3)||(side1==side3)) {
            System.out.println("Isocelese");
        }
        else{
            System.out.println("Scalene");

        }
    }





}
