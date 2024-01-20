package src.basic_04;

import java.util.Scanner;

public class Lab0031 {
    //Recognise vowel or not
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter character ,I will if it is vowel or not");

        char user_input = sc.next().toCharArray()[0];
        System.out.println(user_input);

        switch (user_input){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not a vowel its a consonent");

        }

    }
}
