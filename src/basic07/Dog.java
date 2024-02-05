package src.basic07;

public class Dog {
    String name;
    Dog(){
        System.out.println("default");
    }
    Dog(String name){
        this.name =name;

       // System.out.println("PC");
    }


    void bark(){
        int age=10;
       // System.out.println("bark");
        System.out.println("Dog name is : "+this.name);
    }
}
