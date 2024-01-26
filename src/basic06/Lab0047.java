package src.basic06;

import java.util.Scanner;

public class Lab0047 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int n= sc.nextInt();
        int i=0;
        int flag=0;
        int m=0;
        m=n/2;

      //  for(int i=1;i<n;i++){
            if((n==0)||(n==1)){
                System.out.println("Not a prime"+n);
            }
            else {
                for(i=2;i<=m;i++){
                    if(n%i==0){
                        System.out.println("Not a prime");
                        flag=1;
                        break;
                    }
                }


            }
            if(flag==0){
                System.out.println("Prime Number "+n);
            }
            sc.close();
        }

    }

