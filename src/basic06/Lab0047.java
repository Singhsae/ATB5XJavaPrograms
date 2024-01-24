package src.basic06;

import java.util.Scanner;

public class Lab0047 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int n= sc.nextInt();
        int i=1;
      //  for(int i=1;i<n;i++){
            if((n%i==0)&&(n%n==0)){
                System.out.println("Not a prime");
            }
            else {
                System.out.println("Prime");
            }
        }
    }

