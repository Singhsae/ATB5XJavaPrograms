package src.basic06;

import java.util.Scanner;

public class Lab0060 {
    //Pallindrome
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string , for Pallindrome or not");
        String user_input=sc.next();
        boolean result =isPallindrome(user_input);
        if(result){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }

    }
    private static boolean isPallindrome(String userInput){
        String original_str=userInput;
        StringBuilder sb=new StringBuilder(userInput);
        sb.reverse();
        return original_str.equalsIgnoreCase(sb.toString());
    }















}
