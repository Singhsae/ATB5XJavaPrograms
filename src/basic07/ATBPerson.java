package src.basic07;

public class ATBPerson {
    String name;
    String phone;
    String email;
    ATBPerson(){
        name="Sanjeev";
        System.out.println("i am calllled");
    }
    ATBPerson(String name ,String phone,String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
        System.out.println();
    }
    void talk(){
        System.out.println("talk");
    }
    void printDetails(){
        System.out.println("your name is :"+this.name);
        System.out.println("Your Contact Number is :"+this.phone);
        System.out.println("Your email is :"+this.email);
    }
}
