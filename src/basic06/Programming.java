package src.basic06;

public class Programming {
    int version;
    String author;

    Programming(){
        System.out.println("DC");
    }

    }
    Programming(String author,int version){
        this.author=author;
        this.version=version;
    }
    void printinfo(){
        System.out.println("Programming info-->"+"Author "+this.author+ "Version "+this.version);
        //System.out.println("");
    }
}
