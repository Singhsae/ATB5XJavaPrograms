package src.basic06;

public class Person {
  // public static void main(String[] args) {
           String name;
           int age;

           String Address;
           Person(){
              // this.name="Sanju";
               System.out.println("Default c");
           }
           Person(String ref_name){
               this.name=ref_name;

           }
           void printDetails(){
               System.out.println("Your name is -->" +this.name);
           }
    }

