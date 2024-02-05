package src.Inheritance;

public class Programming {
    int version;
    String author;

    Programming(){
        System.out.println("Programming DC");
    }

    Programming(int version,String author){
        this.author=author;
        this.version=version;
    }

    void printInfo(){
        System.out.println("Program Info -->"+this.version+"Author"+this.author);
    }
    void car(){
        System.out.println("lam");
    }
    void bhk3(){
        System.out.println("3bHK");
    }
}
