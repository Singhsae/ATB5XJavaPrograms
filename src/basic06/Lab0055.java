package src.basic06;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab0055 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name= sc.nextLine();
        System.out.println("Length of name is : " + name.length());

        String y="";
        for(int i=name.length()-1;i>=0;i--){
            y=y+name.charAt(i);

        }
        System.out.println("Opposite of you name is :" +y);
    }
}
